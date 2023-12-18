import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sa[i]);
		}
		br.close();

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum ^= a[i];
		}
		for (int i = 0; i < n; i++) {
			a[i] &= ~sum;
		}

		Hakidasi h = new Hakidasi(a);
		long sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum2 ^= h.arr[i];
		}
		System.out.println(sum + sum2 * 2);
	}

	static class Hakidasi {
		long[] arr;
		int[] msb;
		int n, rank;

		public Hakidasi(long[] a) {
			n = a.length;
			arr = Arrays.copyOf(a, n);
			msb = new int[n];

			for (int i = 62; i >= 0; i--) {
				boolean flg = false;
				for (int j = rank; j < n; j++) {
					if ((arr[j] >> i & 1) == 1) {
						long t = arr[rank];
						arr[rank] = arr[j];
						arr[j] = t;
						flg = true;
						break;
					}
				}
				if (flg) {
					msb[rank] = i;
					for (int j = 0; j < n; j++) {
						if (j != rank && (arr[j] >> i & 1) == 1) {
							arr[j] ^= arr[rank];
						}
					}
					rank++;
				}
			}
		}
	}
}

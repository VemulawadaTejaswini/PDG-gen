import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		sa = br.readLine().split(" ");
		int[] a = new int[n + 1];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		a[n] = a[0];
		sa = br.readLine().split(" ");
		int[] b = new int[n + 1];
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(sa[i]);
		}
		b[n] = b[0];
		br.close();

		int[] ax = new int[n * 2 - 1];
		int[] bx = new int[n];
		for (int i = 0; i < n; i++) {
			ax[i] = a[i] ^ a[i + 1];
			bx[i] = b[i] ^ b[i + 1];
		}
		System.arraycopy(ax, 0, ax, n, n - 1);

		MP mp = new MP(bx);
		List<Integer> list = mp.findAllFrom(ax);
		PrintWriter pw = new PrintWriter(System.out);
		for (int i : list) {
			pw.println(i + " " + (a[i] ^ b[0]));
		}
		pw.flush();
	}

	static class MP {
		int n;
		int[] arr;
		int[] a;

		public MP(int[] arr1) {
			arr = arr1;
			n = arr.length;
			a = new int[n + 1];
			a[0] = -1;
			int j = -1;
			for (int i = 0; i < n; i++) {
				while (j >= 0 && arr[i] != arr[j]) {
					j = a[j];
				}
				j++;
				a[i + 1] = j;
			}
		}

		List<Integer> findAllFrom(int[] arr2) {
			List<Integer> ret = new ArrayList<>();
			int j = 0;
			for (int i = 0; i < arr2.length; i++) {
				while (j >= 0 && arr2[i] != arr[j]) {
					j = a[j];
				}
				j++;
				if (j == n) {
					ret.add(i - j + 1);
					j = a[j];
				}
			}
			return ret;
		}
	}
}

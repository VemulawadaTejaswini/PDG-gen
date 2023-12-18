import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] sa = br.readLine().split(" ");
		String[] sb = br.readLine().split(" ");
		int[] a = new int[n];
		int[] b = new int[n];
		int[] d = new int[n];
		long fusoku = 0;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
			b[i] = Integer.parseInt(sb[i]);
			d[i] = b[i] - a[i];
			if (d[i] > 0) {
				fusoku += d[i];
				cnt++;
			}
		}

		br.close();
		Arrays.parallelSort(d);

		boolean flg = false;
		for (int i = 0; i < n; i++) {
			if (fusoku <= 0) {
				flg = true;
				break;
			}
			if (d[i] < 0) {
				fusoku += d[i];
				cnt++;
			} else {
				break;
			}
		}

		if (flg) {
			System.out.println(cnt);
		} else {
			System.out.println(-1);
		}
	}
}

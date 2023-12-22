import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n, k, p;
	static final int MAX_P = 100000 * 10000;
	static int[] w;

	public static boolean isload(int p) {
		int truck, i = 0, j = 0;
		while (i < k && j < n) {
			truck = 0;
			while (j < n && truck + w[j] <= p) {
				truck += w[j++];
			}
			i++;
		}
		if (j == n) {
			return true;
		} else {
			return false;
		}
	}

	public static int whatIsP() {
		int left = 1, right = MAX_P + 1, ans = 0;
		while (left < right) {
			p = (left + right) / 2;
			if (isload(p)) {
				ans = p;
				right = p;
			} else {
				left = p + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		try(BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));) {
			String[] str = br.readLine().split(" ");
			n = Integer.parseInt(str[0]);
			k = Integer.parseInt(str[1]);
			w = new int[n];
			for (int i = 0; i < n; i++) {
				w[i] = Integer.parseInt(br.readLine());
			}
			System.out.println(whatIsP());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

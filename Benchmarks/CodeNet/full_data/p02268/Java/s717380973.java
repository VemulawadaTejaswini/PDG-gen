
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String S[] = br.readLine().split(" ");
		int q = Integer.parseInt(br.readLine());
		String T[] = br.readLine().split(" ");
		int count = 0;
		for (int i = 0; i < q; i++) {
			if (binarysarch(S, T[i]) != -1) count++;
		}
		System.out.println(count);
	}
	public static int binarysarch(String[] S, String x) {
		int lx = 0, rx = S.length - 1;
		while (lx <= rx) {
			int c = (lx + rx) / 2;
			if (Integer.parseInt(S[c]) == Integer.parseInt(x)) {
				return c;
			} else if (Integer.parseInt(S[c]) < Integer.parseInt(x)) {
				lx = c + 1;
			} else {
				rx = c - 1;
			}
		}
		return -1;
	}
}
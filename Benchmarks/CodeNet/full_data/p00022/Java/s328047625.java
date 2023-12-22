import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)
			throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int n;
		while (   (  n = Integer.parseInt( br.readLine() )  ) != 0   ) {
			int[] a = new int[n];
			for (int i=0; i < n; i++) {
				a[i] = Integer.parseInt(br.readLine());
			}
			System.out.println( MaxSumS(a) );
		}
	}

	public static long MaxSumS(int[] a) {
		long max = a[0];
		long maxfromend = a[0]; //  ... + a[i-3] + a[i-2] + a[i-1] ????????§?????§??¨????????????
		for (int i=1; i < a.length; i++) {
			maxfromend = Math.max(maxfromend + a[i], a[i]);
			max = Math.max(max, maxfromend);
		}
		return max;
	}
}
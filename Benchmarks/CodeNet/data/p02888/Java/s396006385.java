import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] len = new Integer[n];
		for ( int i = 0; i < n; i++ ) {
			len[i] = in.nextInt();
		}
		Arrays.sort(len);

		int cnt = 0;
		for ( int e1 = 0; e1 < n; e1++ ) {
			for ( int e2 = e1 + 1; e2 < n; e2++ ) {

				int d = len[e1] + len[e2];
				int i = Arrays.binarySearch(len, d);
				i = i >= 0 ? i : ~i;
				cnt += i - e2 - 1;
				
				// System.out.println("e1:" + e1 + " e2:" + e2 + " i:" + i +" cnt:" + cnt);
			}
		}
		System.out.println(cnt);
		in.close();
	}
}
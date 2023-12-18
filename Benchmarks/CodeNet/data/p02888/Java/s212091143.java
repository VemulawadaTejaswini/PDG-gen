import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] len = new Integer[n];
		for ( int i = 0; i < n; i++ ) {
			len[i] = in.nextInt()*2; // 2倍して（偶数にして）受け取る
		}
		Arrays.sort(len);

		int cnt = 0;		
		for ( int e1 = 0; e1 < n - 2; e1++ ) {
			for ( int e2 = e1 + 1; e2 < n - 1; e2++ ) {				
				// LowerBoundを取りたい // 奇数は存在しないので一意な値が返ってくる
				int d = len[e1] + len[e2] - 1;				
				int i = ~Arrays.binarySearch(len, d);
				cnt += i - (e2 + 1);
			}
		}
		System.out.println(cnt);
		in.close();
	}
}
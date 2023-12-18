import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int m = sc.nextInt();

		int c = 0;
		int d = 0;
		for ( int i=0; i<m; i++ ) {
			int p = sc.nextInt();
			String s = sc.next();
			if ( a[p] == 0 ) {
				if ( s.equals("AC") ) {
					c++;
					a[p] = 1;
				} else {
					d++;
				}
			}
		}

		// 出力
		System.out.println(c + " " + d);
	}
}
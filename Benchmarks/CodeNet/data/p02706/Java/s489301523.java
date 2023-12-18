import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		int g = 0;
		for ( int i=0; i<m; i++ ) {
			int a = sc.nextInt();
			g = g + a;
		}

		if ( g > n ) {
			System.out.println(-1);
		} else {
			System.out.println(n-g);
		}
	}
}
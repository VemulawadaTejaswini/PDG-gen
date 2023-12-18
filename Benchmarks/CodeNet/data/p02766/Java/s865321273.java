import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();

		int t = 1;
		int r = 1;
		int f = 0;
		while ( f == 0 ) {
			t = t * k;
			if ( n < t ) {
				f = 1;
			} else {
				r++;
			}
		}
		System.out.println(r);
	}
}
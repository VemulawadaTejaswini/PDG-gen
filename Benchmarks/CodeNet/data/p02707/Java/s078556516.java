import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int[] a = new int[n+1];

		for ( int i=1; i<n; i++ ) {
			int aa = sc.nextInt();
			a[aa]++;
		}

		for ( int i=1; i<=n; i++ ) {
			System.out.println(a[i]);
		}
	}
}
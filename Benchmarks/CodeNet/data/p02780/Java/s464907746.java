import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		float[] p = new float[n];

		for ( int i=0; i<n; i++ ) {
			p[i] = ((float)sc.nextInt() + 1f)/2f ;
		}

		float s = 0f ;
		for ( int i=0; i<k; i++ ) {
			s = s + p[i];
		}
		float u = s ;

		for ( int i=0; i<n-k; i++ ) {
			float t = u - p[i] + p[i+k] ;
			s = Math.max(s,t) ;
			u = t;
		}

		System.out.println(s);
	}
}
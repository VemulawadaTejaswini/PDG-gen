import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String n = sc.next();
		int k = n.length()+1;

		int[] p = new int[k];
		int[] c = new int[k];

		p[0] = 0;
		for ( int i=0; i<n.length(); i++ ) {
			char x = n.charAt(i);
			p[i+1] = Character.getNumericValue(x);
		}

		for ( int i=k-1; i>0; i-- ) {
			if ( p[i] > 9 ) {
				p[i-1]++;
				p[i] = p[i] - 10 ;
			}

			if ( p[i] > 5 ) {
				c[i] = 10 - p[i] ;
				p[i-1]++;
				p[i] = 0 ;
			} else if ( p[i] == 5 && p[i-1] >= 4 ) {
				c[i] = 10 - p[i] ;
				p[i-1]++;
				p[i] = 0 ;
			}
		}

		int g = 0;
		for ( int i=0; i<k; i++ ) {
			g = g + p[i] + c[i];
		}

		System.out.println(g);
	}
}
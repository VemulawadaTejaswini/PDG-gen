
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static class Pair implements Comparable<Pair>{
		int c = 0;
		int d = 0;
		
		@Override
		public int compareTo(Pair o) {
			int dd = this.d - o.d;
			if( dd != 0 ) {
				return dd;
			}
			int cc = this.c - o.c;
			return cc;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		Pair[] p = new Pair[n]; 
		String [] s = new String[n]; 

		for( int i=0; i<n ; i++ ) {
			p[i] = new Pair();
			int pos =0;
			String t = sc.next();
			s[i] = t;
			int j=0;
			for( ; j<t.length() ; j++ ) {
				if( t.charAt(j) == ')' ) {
					p[i].d++;
				}else {
					break;
				}
			}
			for( ; j<t.length() ; j++ ) {
				if( t.charAt(j) == ')' ) {
					pos--;
				}
				if( t.charAt(j) == '(' ) {
					pos++;
				}
			}
			p[i].c = pos;
		}
		
		Arrays.sort(p);
		

		int c=0;
		int d=0;
		for( int i=0; i<n ; i++ ) {
			d += p[i].d;
			if( c < d )break; 
			c += p[i].c;
		}
		
		System.out.println( c-d == 0 ? "Yes":"No");
	}

}

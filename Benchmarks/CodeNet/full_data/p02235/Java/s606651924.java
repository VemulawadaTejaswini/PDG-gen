

import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int q = input.nextInt();
		String a;
		String b;
		for(int i=0; i<q; i++) {
			 a = input.next();
			 b = input.next();
		     System.out.println(getLcs(a,b));
		}
	}
		public static int getLcs(String a, String b) {
		int l1 = a.length();
		int l2 = b.length();
		int[][] lcs = new int [a.length()+1][b.length()+1];
		for(int i=1; i<=l1; i++) {
			for(int j=1; j<=l2; j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
 				 	lcs[i][j] = 1 + lcs[i-1][j-1];} 
				else {
					lcs[i][j] = Math.max(lcs[i][j-1], lcs[i-1][j]);
				}
			}
		}
		return lcs[l1][l2];
	}	
}



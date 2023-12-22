import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {
	
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int minN = n;
		int maxN = n;
		while(true) {
			boolean mnN = check(minN);
			boolean mxN = check(maxN);
			
			if(mnN) {
				System.out.println(minN);
				break;
			}
			if(mxN) {
				System.out.println(maxN);
				break;
			}
			minN--;
			maxN++;
			
		}
		
	}
	
	static boolean check(int a) {
		char[] A = String.valueOf(a).toCharArray();
		char[] B = new char[A.length];
		for(int i = 0; i < A.length; i++) {
			B[i] = A[A.length - i - 1];
		}
		int b = Integer.parseInt(String.valueOf(B));
		
		return a == b;
		
	}
 	
}
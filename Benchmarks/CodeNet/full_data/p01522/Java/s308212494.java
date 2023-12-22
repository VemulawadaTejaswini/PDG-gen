import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {
	static int month[] = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
	static int day[]   = new int[13];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[][] bunny = new boolean[k][n];
		for(int i = 0; i < k; i++) {
			int m = sc.nextInt();
			for(int j = 0; j < m; j++) {
				bunny[i][sc.nextInt()-1] = true;
			}
		}
		int r = sc.nextInt();
		boolean[] check = new boolean[n];
		for(int i = 0; i < r; i++) {
			int p = sc.nextInt()-1;
			int q = sc.nextInt()-1;
			for(int j = 0; j < k; j++) {
				if(bunny[j][p] && bunny[j][q]) {
					check[p] = true;
					check[q] = true;
				}
			}
		}
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(check[i]) count++;
		}
		System.out.println(count);
	}
}
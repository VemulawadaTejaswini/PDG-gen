import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
   
   
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		for(int i = 0; i < m; i++) {
			a[i] = sc.nextInt()-1;
		}
		int[] score = new int[n];
		for(int i = 0; i < m; i++) {
			int x = 0;
			for(int j = 0; j < n; j++) {
				if(sc.nextInt()-1 == a[i]) {
					score[j]++;
				}
				else {
					x++;
				}
			}
			score[a[i]] += x;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(score[i]);
		}
		
		
		
	}
	
}
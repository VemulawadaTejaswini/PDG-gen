import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;


public class Main {
	Scanner sc = new Scanner(System.in);
	void a() {
		while(true) {
			int n = sc.nextInt();
			if(n == 0) return;
			int[] a = new int[n];
			int sum = 0;
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			sum /= (double)(n);
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				if(a[i] <= sum) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}

	}
	
	void b() {
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int t = sc.nextInt();
			int p = sc.nextInt();
			if(n == 0 && m == 0 && t == 0 && p == 0) return;
			int[][] pe = new int[m * 2][n * 2];
			for(int i = 0; i < m * 2; i++) {
				Arrays.fill(pe[i], 0);
			}
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					pe[i][j] = 1;
				}
			}
			/*for(int i = 0; i < m * 2; i++) {
				System.out.println(Arrays.toString(pe[i]));
			}*/
			int x = 0;
			int y = 0;
			for(int k = 0; k < t; k++) {
				int d = sc.nextInt();
				int c = sc.nextInt();
				//System.out.println(d);
				if(d == 1) {	
					for(int i = x; i < c + x; i++) {
						for(int j = 0; j < m * 2; j++) {
							int num = pe[j][i]; 
							pe[j][i] = 0;
							//System.out.println(i + (c - i) * 2 + " " + j);
							pe[j][i + (c - i + x) * 2 - 1] += num;
						}
					}
					x += c;
					//System.out.println(x);
				}
				if(d == 2) {
					for(int i = y; i < c + y; i++) {
						for(int j = 0; j < n * 2; j++) {
							int num = pe[i][j]; 
							pe[i][j] = 0;
							pe[i + (c - i + y) * 2 - 1][j] += num;
						}
					}
					y += c;
				}
			}
			/*
			for(int i = 0; i < m * 2; i++) {
				System.out.println(Arrays.toString(pe[i]));
			}
			*/
			
			for(int i = 0; i < p; i++) {
				int X = sc.nextInt();
				int Y = sc.nextInt();
				int ans = pe[y + Y][x + X];
				//System.out.println(x + X + " " + (y + Y) + " " + x + " "  + y);
				System.out.println(ans);
			}
			
	
		}

	}
	

	public static void main(String[] args) {
		new Main().a();
	}

}


import java.io.*;
import java.util.*;

public class Main {
	
	static int discTime = 0;
	static int[] l;
	static int x = 0, y = 1;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] v = new int[n+1][n];
		int[] d = new int[n+1];
		l = new int[n+1];
		
		
		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();
			int k = sc.nextInt();
			d[u] = -1;
			for (int a = 0; a < k; a++) {
				v[u][a] = sc.nextInt();
			}
		}
		
		d[1] = 0;
		l[0] = 1;
		
		bfs(v,d);
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + d[i]);
		}
		
	}
	
	static void bfs(int[][] v, int[] d){
		for (; x<y; x++) {
			int start = l[x];
			for (int i = 0; i < v[start].length; i++) {
				int end = v[start][i];
				if (d[end] == -1) {
					d[end] = d[start]+1;
					l[y++] = end;
				}
			}
			
		}
	}
	
	
	
}

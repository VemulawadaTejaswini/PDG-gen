import java.io.*;
import java.util.*;
public class C {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,m,x;
		n = s.nextInt();
		m = s.nextInt();
		x = s.nextInt();
		int [][] cost = new int[n][m+1];
		for(int i=0;i<cost.length;i++) {
			for(int j=0;j<m+1;j++) {
				cost[i][j] = s.nextInt();
			}
		}
		int global_min = Integer.MAX_VALUE;
		
		for(int mask = 0; mask<1<<n; mask++) {
			int [] understanding = new int[m];
			int sum = 0;
			for(int i=0;i<cost.length;i++) {
				int bit = 1<<i;
				if((mask & bit)!=0) {
					sum+=cost[i][0];
					for(int j=0;j<m;j++) {
						understanding[j] += cost[i][j+1];
					}
				}
			}
			boolean flag = true;
			for(int a:understanding) {
				if(a<x) {
					flag = false;
				}
			}
			if(flag) {
				global_min = Math.min(global_min, sum);
			}
		}
		if(global_min==Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		else {
		System.out.println(global_min);
		}

	}

}

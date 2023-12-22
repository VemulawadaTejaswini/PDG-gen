import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int K = sc.nextInt();
			if(n == 0 && K == 0) break;
			int[] c = new int[n];
			for(int i = 0; i < n; i++) {
				c[i] = sc.nextInt();
			}
			int CMax = 0;
			for(int i = 0; i < n; i++) {
				if(i + (K-1) >= n) break;
				int sum = 1;
				for(int j = 0; j < K; j++) {
					sum *= c[i + j];
				}
				CMax = Math.max(sum, CMax);
			}
			int AMax = 0;
			for(int i = 0; i < n; i++) {
				for(int j = i+1; j < n; j++) {
					int tmp = c[i];
					c[i] = c[j];
					c[j] = tmp;
					for(int k = 0; k < n; k++) {
						if(k + (K-1) >= n) break;
						int sum = 1;
						for(int l = 0; l < K; l++) {
							sum *= c[k + l];
						}
						AMax = Math.max(sum, AMax);
					}
					tmp = c[i];
					c[i] = c[j];
					c[j] = tmp;
				}
			}
			System.out.println(AMax < CMax?"NO GAME":AMax - CMax);
			
			
		}
	}
}
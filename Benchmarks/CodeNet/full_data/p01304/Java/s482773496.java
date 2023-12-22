import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		while(m-- != 0) {
			int gx = sc.nextInt();
			int gy = sc.nextInt();
			if(gx == 0 && gy == 0) break;
			int p = sc.nextInt();
			Data[] list = new Data[p];
			for(int i = 0; i < p; i++) {
				list[i] = new Data(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			}
			long[][] dp = new long[gy+1][gx+1];
			dp[0][0] = 1;
			for(int i = 0; i < gy+1; i++) {
				for(int j = 0; j < gx+1; j++) {
					Data A = new Data(j,i,j+1,i);
					Data B = new Data(j,i,j,i+1);
					boolean a = false;
					boolean b = false;
					for(int k = 0; k < p; k++) {
						if(list[k].compareTo(A) == 0) {
							a = true;
						}
						if(list[k].compareTo(B) == 0) {
							b = true;
						}
					}
					if(!a && j != gx) {
						dp[i][j+1] += dp[i][j];
					}
					if(!b && i != gy) {
						dp[i+1][j] += dp[i][j];
					}
				}
			}
			long ans = dp[gy][gx];
			if(ans == 0) {
				System.out.println("Miserable Hokusai!");
			}
			else {
				System.out.println(dp[gy][gx]);
			}
		}
		
	}
	static class Data implements Comparable<Data>{
		int x1;
		int y1;
		int x2;
		int y2;
		Data(int a, int b, int c, int d) {
			x1 = a;
			y1 = b;
			x2 = c;
			y2 = d;
		}
		@Override
		public int compareTo(Data o) {
			if(o.x1 == this.x1 && o.y1 == this.y1 && o.x2 == this.x2 && o.y2 == this.y2) return 0;
			if(o.x2 == this.x1 && o.y2 == this.y1 && o.x1 == this.x2 && o.y1 == this.y2) return 0;
			return 1;
		}
	}
}
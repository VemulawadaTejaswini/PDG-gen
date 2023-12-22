
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int W;
		int N;
		int[] v = new int[1001];
		int[] w = new int[1001];
		int[][] u = new int[1001][1001];
		int[][] h = new int[1001][1001];
		int count = 1;
		while(true){
			W = Integer.parseInt(sc.next());
			if(W==0){
				break;
			}
			N = Integer.parseInt(sc.next());
			for(int i=0;i<N;i++){
				String str = sc.next();
				String[] num = str.split(",",0);
				v[i] = Integer.parseInt(num[0]);
				w[i] = Integer.parseInt(num[1]);
			}
			for(int i=w[0];i<=W;i++){
				u[0][i] = v[0];
				h[0][i] = w[i];
			}
			for(int i=1;i<N;i++){
				for(int j=1;j<=W;j++){
					if(j<w[i]){
						u[i][j] = u[i-1][j];
						h[i][j] = h[i-1][j];
					}
					else{
						if(u[i-1][j]>u[i-1][j-w[i]]+v[i]){
							u[i][j] = u[i-1][j];
							h[i][j] = h[i-1][j];
						}
						else{
							u[i][j] = u[i-1][j-w[i]]+v[i];
							h[i][j] = h[i-1][j-w[i]]+w[i];
						}
					}
				}
			}
			out.println("Case "+count+":");
			out.println(u[N-1][W]);
			out.println(h[N-1][W]);
			out.flush();
			
			count++;
		}
	}
}
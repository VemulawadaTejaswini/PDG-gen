import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] f = new int[n][5];
		double AM = -1;
		double BM = -1;
		double A = -1;
		double B = -1;
		for(int i = 0; i < n; i++) 
			for(int j = 0; j < 5; j++) 
				f[i][0] = sc.nextInt();
		for(int i = 1; i < n; i++) {
			if(f[i-1][2] != f[i][2] || f[i-1][1] == f[i][1]) continue;
			double d = Math.sqrt(Math.pow(f[i][3] - f[i-1][3], 2) + Math.pow(f[i][4] - f[i-1][4], 2));
			double time = f[i][0] - f[i-1][0];
			if(f[i][2] == 0)
				if(d > AM || (d == AM && time < A)) {
					AM = d;
					A = time;
				}
			else
				if(d > BM || (d == BM && time < B)) {
					BM = d;
					B = time;
				}
		}
		if(AM == -1) System.out.println(-1 + " " + -1);
		else System.out.printf("%.9f %.9f\n",AM,A/60);
		if(BM == -1) System.out.println(-1 + " " + -1);
		else System.out.printf("%.9f %.9f\n",BM,B/60);
	}
}
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

import javax.xml.crypto.Data;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			double[][] dp = new double[n+1][100];
			dp[0][0] = 1.0;
			double sum = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < 99; j++) {
					dp[i+1][j+1] += dp[i][j] * 1.0 / Math.pow(2.0, j);
					dp[i+1][0]   += dp[i][j] * (1.0 - (1.0 / Math.pow(2.0, j)));
					sum += j * dp[i][j] * (1.0 - (1.0 / Math.pow(2.0, j)));
				}
			}
			for(int j = 0; j < 100; j++) {
				sum += j * dp[n][j];
			}
			System.out.printf("%.20f\n",sum);
			
		}
		
	}
}
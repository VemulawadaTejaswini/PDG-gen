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
		double[] pow = new double[24];
		for(int i = 0; i < 24; i++) {
			pow[i] = 1.0 / Math.pow(2, i);
		}
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			double[][] dp = new double[n+1][25];
			dp[0][0] = 1.0;
			double sum = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < 24; j++) {
					dp[i+1][j+1] += dp[i][j] * pow[j];
					dp[i+1][0]   += dp[i][j] * (1.0 - pow[j]);
					sum += j * dp[i][j] * (1.0 - pow[j]);
				}
			}
			for(int j = 0; j < 25; j++) {
				sum += j * dp[n][j];
			}
			System.out.printf("%.20f\n",sum);
		}
		
	}
}
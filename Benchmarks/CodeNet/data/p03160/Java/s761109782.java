import java.util.Scanner;
import java.lang.*;
import java.util.*;

public class Frog1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] heights = new int[n];
		for(int i = 0; i < n; i++) {
			heights[i] = sc.nextInt();
		}
		
		int[] dp = new int[n]; //min number of cost before reaching i
		for(int i = 0; i < n; i++) {
			dp[i] = 10000;
		}
		
		
		dp[0] = 0; //initialise dp correctly if all to zero mistake dp[i] minimum cost until i. could either be itself or reached from previous
		for(int i = 0; i < n; i++) {
			if(i+1 < n) {
				dp[i+1] = Math.min(dp[i+1], dp[i]+ Math.abs(heights[i] - heights[i+1])); //overlaps here that's why it works.
			}
			if(i+2 < n) {
				dp[i+2] = Math.min(dp[i+2], dp[i] + Math.abs(heights[i] - heights[i+2]));
			}
		}
		System.out.println(dp[n-1]);
	}
}
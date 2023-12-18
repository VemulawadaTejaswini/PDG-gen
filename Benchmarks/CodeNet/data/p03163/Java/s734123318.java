import java.util.*;import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int maxWeight = scn.nextInt();
		int[][] itemvaw = new int[n+1][2];
		
		for(int i=1;i<=n;i++){
		    itemvaw[i][0] = scn.nextInt();
		    itemvaw[i][1] = scn.nextInt();
		}
		int[][] memo = new int[n+1][maxWeight+1];
		System.out.println(knapsack_memoized(1,itemvaw,maxWeight,memo));
	}
	
	public static int knapsack_memoized(int cii, int[][] itemvaw, int capacityLeft, int[][] memo) {
		if (cii == itemvaw.length)return 0;
		if (capacityLeft == 0)return 0;
		if (memo[cii][capacityLeft] != 0)return memo[cii][capacityLeft];
		int o1 = capacityLeft - itemvaw[cii][0] >= 0 ?
		         itemvaw[cii][1] + knapsack_memoized(cii + 1, itemvaw, capacityLeft - itemvaw[cii][0], memo) : Integer.MIN_VALUE;
		int o2 = knapsack_memoized(cii + 1, itemvaw, capacityLeft, memo);
		return memo[cii][capacityLeft] = Math.max(o1, o2);
	}
}

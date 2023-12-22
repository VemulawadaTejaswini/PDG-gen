import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class Problem implements Comparable<Problem>{
		int cost;
		int limit;
		
		public Problem(int cost, int limit) {
			super();
			this.cost = cost;
			this.limit = limit;
		}

		@Override
		public int compareTo(Problem arg0) {
			return this.limit - arg0.limit;
		}
	}
	
	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		Problem[] array = new Problem[N];
		for(int i = 0; i < N; i++){
			array[i] = new Problem(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(array);
		/*
		for(int i = 0; i < N; i++){
			System.out.println(array[i].cost + " " + array[i].limit);
		}
		*/
		int[][] DP = new int[N + 1][N + 1];
		for(int i = 0; i < N + 1; i++){
			for(int j = 0; j < N + 1; j++){
				DP[i][j] = INF;
			}
		}
		
		DP[0][0] = 0;
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				if(DP[i][j] + array[i].cost <= array[i].limit){
					//System.out.println(DP[i][j] + " " + array[i].cost + " " + DP[i][j + 1]);
					DP[i + 1][j + 1] = Math.min(DP[i][j] + array[i].cost, DP[i][j + 1]);
				}
				
				DP[i + 1][j] = Math.min(DP[i + 1][j], DP[i][j]);
			}
		}
		/*
		for(int i = 0; i < N + 1; i++){
			for(int j = 0; j < N + 1; j++){
				System.out.print(DP[i][j] + " ");
			}
			System.out.println();
		}
		*/
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < N + 1; i++){
			for(int j = 0; j < N + 1; j++){
				if(DP[i][j] < INF){
					max = Math.max(max, j);
				}
			}
		}
		
		System.out.println(max);
	}

}
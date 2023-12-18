package SpecialistMariam;
import java.util.Arrays;

public class Main{
	static int N , INF = (int) 1e9;
	static int [][]models; // garments <= 20, model(i) <= 20, budget <=200
	static int [][] memo = new int[20][201];
	// O(20 * 201 * 20) < O(20^20)
	static int solve(int idx, int remA) { // O(states * transitions)
		if(remA < 0) // idx * remA == 20 * 201
			return -1 * INF;
		if(idx == N)
			return 0;
		if(memo[idx][remA] != -1)
			return memo[idx][remA];
		int max = -1 * INF;
		// O(20)
		for(int i = 0; i < models[idx].length; i++) {
			max = Math.max(max, models[idx][i] + solve(idx + 1, remA - models[idx][i]));
		}
		return memo[idx][remA] = max;
	}
	public static void main(String[] args) {
		for(int i = 0;i < N; i++)
			Arrays.fill(memo[i], -1);
	}
}

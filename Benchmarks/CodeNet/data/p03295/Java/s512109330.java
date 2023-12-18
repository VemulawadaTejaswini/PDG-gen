import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] problem = new int[M][2];
		for(int i = 0;i < M;++i) {
			problem[i][0] = sc.nextInt()-1;
			problem[i][1] = sc.nextInt()-1;
		}
		boolean[] between = new boolean[N-1];
		for(int i = 0;i < N-1;++i)
			between[i] = true;
		
		
		for(int i = 0;i < M;++i) {
			for(int j = i;j < M;++j) {
				if(problem[i][0] > problem[j][0]) {
					int cap = problem[i][0];
					problem[i][0] = problem[j][0];
					problem[j][0] = cap;
					cap = problem[i][1];
					problem[i][1] = problem[j][1];
					problem[j][1] = cap;
				}
			}
		}
		int spoint = 0;
		int epoint = 0;
		for(int i = 0;i < N;++i) {
			epoint = spoint;
			for(int j = spoint;j < M;++j) {
				if(problem[j][0] != i)
					break;
				epoint++;
			}
			for(int j = spoint;j < epoint;++j) {
				for(int k = spoint;k < epoint;++k) {
					for(int l = k;l < epoint;++l) {
						if(problem[k][1] > problem[l][1]) {
							int cap = problem[k][1];
							problem[k][1] = problem[l][1];
							problem[l][1] = cap;
						}
					}
				}
			}
			spoint = epoint + 1;
		}
		
		// ここまでソート
		
		spoint = 0;
		epoint = 0;
		int problem_num = 0;
		for(int i = 0;i < N;++i) {
			epoint = spoint;
			for(int j = spoint;j < M;++j) {
				if(problem[j][0] != i) {
					problem_num++;
					break;
				}
				epoint++;
			}
			spoint = epoint + 1;
		}
		problem_num++;
		
		boolean[][] eachProblem = new boolean[problem_num][N-1];
		for(int i = 0;i < problem_num;++i)
			for(int j = 0;j < N-1;++j)
				eachProblem[i][j] = false;
		
		spoint = 0;
		epoint = 0;
		for(int i = 0;i < problem_num;++i) {
			epoint = spoint;
			for(int j = spoint;j < M;++j) {
				if(problem[j][0] != i) {
					break;
				}
				epoint++;
			}
			if(epoint == M)
				epoint--;
			for(int j = problem[spoint][0];j < problem[spoint][1];++j) {
				eachProblem[i][j] = true;
			}
			spoint = epoint;
		}
		
		boolean solveFlag = false;
		while(solveFlag == false) {
			int[] score = new int[N-1];
			for(int i = 0;i < N-1;++i)
				score[i] = 0;
			for(int i = 0;i < problem_num;++i) {
				for(int j = 0;j < N-1;++j) {
					if(eachProblem[i][j])score[j]++;
				}
			}
			int maxIdx = -1;
			int max = 0;
			for(int i = 0;i < N-1;++i)
				if(score[i] > max) {
					maxIdx = i;
					max = score[i];
				}
			
			if(max == 0)
				break;
			else {
				between[maxIdx] = false;
				for(int i = 0;i < problem_num;++i) {
					if(eachProblem[i][maxIdx]) {
						for(int j = 0;j < N-1;++j)
							eachProblem[i][j] = false;
					}
				}
			}
			
			boolean solve = true;
			for(int i = 0;i < problem_num;++i)
				for(int j = 0;j < N-1;++j)
					if(eachProblem[i][j])solve = false;
			if(solve)break;
		}
		
		int score = 0;
		for(int i = 0;i < N-1;++i)
			if(between[i] == false)score++;
		System.out.println(score);
	}
}
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		int N, time = 0;
		int[] C = new int[500];
		int[] S = new int[500];
		int[] F = new int[500];
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 0; i < N - 1; i++) {
			C[i] = sc.nextInt();
			S[i] = sc.nextInt();
			F[i] = sc.nextInt();
		}
		int[] ans = new int[N];
		
		for(int i = 0; i < N - 1; i++) {
			time = 0;
			for(int j = i; j < N - 1; j++) {
				time += calcTime(time, C[j], S[j], F[j]);
			}
			ans[i] = time;
		}
		for(int i: ans) {
			System.out.println(i);
		}
		
	}
	private static int calcTime(int ft, int C, int S, int F) {
		int tt;
		
		if(ft < S) {
			tt = S;
		}else if(ft % F == 0) {
			tt = ft;
		}else {
			tt = ft + F - ft % F;
		}
		return tt + C - ft;
	}
}
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static int InsertionSort(final int N, final int G, int[] A){
		int cnt = 0;
		//System.out.println("> " + G);
		for(int i = G; i < N; i++){
			final int v = A[i];
			int j = i - G;
			//System.out.println(i + " " + j);
			while(j >= 0 && A[j] > v){
				A[j + G] = A[j];
				j -= G;
				cnt++;
			}
			
			A[j + G] = v;
		}
		
		return cnt;
	}
	
	public static void ShellSort(final int N, int[] A){
		int cnt = 0;
		int m = 1;
		int[] G = new int[100];
		G[0] = 1;
		for(int i = 1; i < N; i++, m++){
			G[i] = G[i - 1] * 3 + 1;
			if(G[i] > N){
				break;
			}
		}
		
		for(int i = 0; i < m; i++){
			cnt += InsertionSort(N, G[m - i - 1], A);
		}
		
		System.out.println(m);
		for(int i = m - 1; i >= 0; i--){
			if(i != m - 1){
				System.out.print(" ");
			}
			System.out.print(G[i]);
		}
		System.out.println();
		System.out.println(cnt);
		for(int i = 0; i < N; i++){
			System.out.println(A[i]);
		}
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++){
			A[i] = sc.nextInt();
		}
		
		ShellSort(N, A);
		
		
	}
}
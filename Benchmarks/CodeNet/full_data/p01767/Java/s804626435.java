import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		int[] difficults = new int[N];
		int[] partial_sum = new int[N];
		for(int i = 0; i < N; i++){
			final int a = sc.nextInt();
			
			difficults[i] = a;
		}
		Arrays.sort(difficults);
		for(int i = 0; i < N; i++){
			partial_sum[i] = difficults[i] + (i == 0 ? 0 : partial_sum[i - 1]);
		}
		
		
		final int M = sc.nextInt();
		int[] solver = new int[M];
		for(int i = 0; i < M; i++){
			final int b = sc.nextInt();
			solver[i] = b;
		}
		
		for(int i = 0; i < M; i++){
			final int c = sc.nextInt();
			
			int lower = -1;
			int higher = N;
			
			// [lower, higher)
			while(lower + 1 != higher){
				final int mid = (lower + higher) / 2;
				//System.out.println(lower + ", " + higher + ", " + mid + " => " + difficults[mid] + " " + solver[i]);
				
				if(mid == -1){
					break;
				}else if(difficults[mid] <= solver[i]){
					lower = mid;
				}else{
					higher = mid;
				}
			}
			
			final int score = lower == -1 ? 0 : partial_sum[lower];
			
			System.out.println(score >= c ? "Yes" : "No");
			
		}
		
	}
	
} 
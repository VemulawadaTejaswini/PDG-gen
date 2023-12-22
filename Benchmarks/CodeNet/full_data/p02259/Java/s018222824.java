import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static int BubbleSort(final int N, int[] A){
		
		int count = 0;
		while(true){
			boolean update = false;
			
			for(int i = N - 1; i >= 1; i--){
				if(A[i] < A[i - 1]){
					int tmp = A[i];
					A[i] = A[i - 1];
					A[i - 1] = tmp;
					
					count++;
					update = true;
				}
			}
			
			if(!update){
				break;
			}
		}
		
		return count;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = sc.nextInt();
		}
		
		final int times = BubbleSort(N, A);
		
		for(int i = 0; i < N; i++){
			if(i != 0){
				System.out.print(" ");
			}
			System.out.print(A[i]);
		}
		System.out.println();
		
		System.out.println(times);
	}
}
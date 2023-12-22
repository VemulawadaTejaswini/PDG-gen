import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static int BubbleSort(final int N, int[] A){
		
		int count = 0;
		for(int i = 0; i < N; i++){
			int min = A[i];
			int min_pos = i;
			
			for(int j = i + 1; j < N; j++){
				if(A[j] < min){
					min = A[j];
					min_pos = j;
				}
				
			}
			
			if(min_pos != i){
				int tmp = A[i];
				A[i] = min;
				A[min_pos] = tmp;
				count++;
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
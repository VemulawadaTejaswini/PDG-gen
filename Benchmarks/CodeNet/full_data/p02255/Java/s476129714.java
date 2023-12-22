import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void InsertionSort(final int N, int[] A){
		for(int i = 0; i < N; i++){
			final int v = A[i];
			
			int j = i - 1;
			while(j >= 0 && A[j] > v){
				A[j+1] = A[j];
				j--;
			}
			
			A[j+1] = v;
			
			
			for(int k = 0; k < N; k++){
				if(k != 0){ System.out.print(" "); }
				System.out.print(A[k]);
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = sc.nextInt();
		}
		
		InsertionSort(N, A);
		
	}
}
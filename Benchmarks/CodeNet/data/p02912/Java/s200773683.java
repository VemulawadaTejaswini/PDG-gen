import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] A = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			A[i] = sc.nextInt();
		}
		
		int max = 0;
		int index = 0;
		
		for(int i = 0 ; i < M ; i++) {
			for (int j = 0 ; j < A.length ; j++) {
				if (A[j] > max) {
					max = A[j];
					index = j;
				}
			}
			
			A[index] /= 2;
			
			max = 0;
			index = 0;
		}
		
		long sum = 0;
		
		for (int val : A) {
			sum += val;
		}
		
		System.out.println(sum);
		
		
	}

}

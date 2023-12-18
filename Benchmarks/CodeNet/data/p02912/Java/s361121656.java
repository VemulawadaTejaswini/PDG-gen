import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
	
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < M; i++) {
			A[maxIndex(A)] /= 2;
		}
		
		long sum = 0;
		for(int i = 0; i < N; i++) sum += A[i];
		
		System.out.println(sum);
	}
	
	static int maxIndex(int[] array) {
		int maxIndex = -1;
		int max = aryMax(array);
		for(int i = 0; i < array.length; i++) {
			if(array[i] == max) maxIndex = i;
		}
		
		return maxIndex;
		
	}
	
	static int aryMax(int[] array) {
		Arrays.sort(array);
		return array[array.length - 1];
	}
}


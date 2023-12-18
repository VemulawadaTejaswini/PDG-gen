import java.util.Scanner;
public class Main {
	static class QuickSort {
		public static void sort(int[] data, int left, int right) {
			if(left >= right) {
				return;
			}
				int p;
				if((left+right)%2 == 1){
					p = data[(left+right-1)/2];
				}
				else{
					p = data[(left+right)/2];
				}
				int i = left;
				int j = right;
				while(i <= j){
						while(data[i] < p){
							i++;
						}
						while(data[j] > p){
							j--;
						}
						if(i <= j){
							int tmp = data[i];
							data[i] = data[j];
							data[j] = tmp;
							i++;
							j--;
						}
				}
					QuickSort.sort(data, left, j);
					QuickSort.sort(data, i, right);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int A[] = new int[N];
		int B[] = new int[M];
		int C[] = new int[M];
		int s = 0;
		
		for(int i = 0; i < N; i++) {
			A[i] = stdIn.nextInt();
		}
		for(int i = 0; i < M; i++) {
			B[i] = stdIn.nextInt();
			C[i] = stdIn.nextInt();
			s += B[i];
		}
		
		int[] D = new int[N+s];
		int p = 0;
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < B[i]; j++) {
				D[p] = C[i];
				p++;
			}
		}
		for(int i = 0; p < N+s; i++) {
			D[p] = A[i];
			p++;
		}
		
		QuickSort.sort(D, 0, D.length-1);
		
		int S = 0;
		for(int i = s; i < N+s; i++) {
			S += D[i];
		}
		System.out.println(S);

	}

}
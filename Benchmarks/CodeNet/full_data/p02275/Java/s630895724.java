//API???????????????
import java.util.Scanner;
import java.io.IOException;
class Main {
  	
	static int k = 10000;
	
	public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		
		for(int i = 0; i < n; i++){
			A[i] = scan.nextInt();
		}
		
		CountingSort(A, B, n);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			if(i != n - 1){
				sb.append(B[i]).append(" ");
			}else{
				sb.append(B[i]);
			}
		}
		System.out.println(sb);
	}
	
	public static void CountingSort(int[] A, int[] B, int n){
		int[] C = new int[k + 1];
		int i;
		
		for(i = 0; i < n; i++){
			C[A[i]]++;
		}
		for(i = 1; i <= k; i++){
			C[i] += C[i - 1];
		}
		for(i = n - 1; i >= 0; i--){
			B[C[A[i]] - 1] = A[i];
			C[A[i]]--;
		}
	}
} 
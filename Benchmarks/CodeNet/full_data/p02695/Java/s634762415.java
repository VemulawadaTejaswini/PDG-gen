import java.util.Scanner;

public class Main {
	static int count;
	static int result;
	static void rec(int arr[] , int cur , int cur_val , int M, int A[] , int B[] , int C[] , int D[]){
		if(cur == arr.length){
			int S = 0;
			for(int q = 0  ; q < A.length ; ++q){
				if(arr[B[q]] - arr[A[q]] == C[q]){
					S += D[q];
				}
			}
			result = Math.max(result, S);
			++count;
			return ;
		}
		for(int i = cur_val ; i <= M ; ++i){
			arr[cur] = i;
			rec(arr , cur + 1 , i , M, A, B , C , D);			
		}
	}
	static long solve(int N , int M , int A[] , int B[] , int C[] , int D[]){
		int arr[] = new int[N];
		count = 0;
		result = 0;
		rec(arr, 0 , 1 , M, A , B , C , D);
//		System.out.println(count+" "+result);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		int A[] = new int[Q];
		int B[] = new int[Q];
		int C[] = new int[Q];
		int D[] = new int[Q];

		for(int i = 0 ; i < Q ; ++i){
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
			C[i] = sc.nextInt();
			D[i] = sc.nextInt();
		}
		System.out.println(solve(N , M , A , B , C , D));
	}	
}

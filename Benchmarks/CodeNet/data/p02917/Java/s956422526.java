import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//例
		//B=[2 3 4 8 4 5]
		//A={1 2 4 3 2 3 2}
		
		//各要素が最大になるように、Aを作り、和を求めれば良い。
		//A_0とA_N-2,A_N_1は例外だが、1<= i <=N-3については、
		//A_i=min(B_i-1, B_i, B_i+1)でよいかも
		
		int[] B = new int[N-1];
		for (int i=0;i<N-1;i++) {
			B[i]=sc.nextInt();
		}
		
		int[] A = new int[N];
		
		A[0]=Math.min(B[0],B[1]);
		A[N-2]=Math.min(B[N-3],B[N-2]);
		A[N-1]=B[N-2];
		
		for (int i=1;i<N-2;i++) {
			A[i]=Math.min(Math.min(B[i-1], B[i]) ,B[i+1]);
		}
		
		int ans=0;
		
		for (int i=0;i<N;i++) {
			ans += A[i];
		}
		
		System.out.println(ans);
	}
}

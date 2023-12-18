import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		
		int A[] = new int[N];
		
		for(int i = 0;i<N;i++) A[i] = cin.nextInt();
		
		int B[] = new int[N];
		for(int i = 0;i<N;i++) B[A[i]]++;

		int sum = 0;
		for(int i = 0;i<N;i++) sum += B[i]*(B[i]-1)/2;
		
		for(int K = 0;K<N;K++) {
			int ans = sum - (B[A[K]]-1);
			System.out.println(ans);
		}
		
		
	}

}

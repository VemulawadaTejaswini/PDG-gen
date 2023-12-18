import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	
		int A[] = new int [N];
		int B[] = new int [N];
		for (int i = 0; i<N; i++){
			A[i]=sc.nextInt();
			B[i]=A[i];
		}
		
		Arrays.sort(A);
		int left = A[(N)/2-1];
		int right = A[N/2];
		
		for (int i=0; i<N; i++){
			if (B[i]<=left)
				System.out.println(right);
			else
				System.out.println(left);
				
		}
		sc.close();

	}

}
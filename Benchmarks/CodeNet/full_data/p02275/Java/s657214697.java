import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int n;
	public static int A[];
	public static int B[];
	public static int C[] = new int[10000];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String [] temp = br.readLine().split(" ");
		A = new int[n];
		B = new int[n];

		for(int i = 0; i<n ;i++){
			A[i] = Integer.parseInt(temp[i]);
			C[A[i]]++;
		}

		for(int i=1;i<10000;i++){
			C[i] = C[i-1]+C[i];
		}

		for(int i = n-1;i>=0;i--){
			B[C[A[i]]-1] = A[i];
			C[A[i]]--;
		}

		for(int i = 0; i < n-1 ;i++){
			System.out.print(B[i]+" ");
		}
		System.out.println(B[n-1]);
	}

}
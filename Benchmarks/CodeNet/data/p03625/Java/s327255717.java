import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[]A;
		A = new int[N];
		int len1 =0;
		int len2 =0;
		
		for (int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		for (int i=N-2; i>=0 ;i--){
			if (A[i] == A[i+1]){
				if (len1 == 0){
					len1 = A[i];
				} else {
					if (len1 != A[i]){
						len2 = A[i];
						break;
					}
				}
			}
		}
		System.out.println(len1 * len2);
	}
}


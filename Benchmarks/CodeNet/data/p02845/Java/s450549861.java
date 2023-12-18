import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = stdIn.nextInt();
		}
		int R = 0;
		int G = 0;
		int B = 0;
		long count = 1;
		
		for(int i = 0; i < N; i++) {
			if(A[i] == R && A[i] == G && A[i] == B) {
				count = (count*3)%1000000007;
				R++;
			}
			else if(A[i] == R && A[i] == G && A[i] != B) {
				count = (count*2)%1000000007;
				R++;
			}
			else if(A[i] == R && A[i] != G && A[i] == B) {
				count = (count*2)%1000000007;
				R++;
			}
			else if(A[i] != R && A[i] == G && A[i] == B) {
				count = (count*2)%1000000007;
				G++;
			}
			else if(A[i] == R && A[i] != G && A[i] != B) {
				R++;
			}
			else if(A[i] != R && A[i] == G && A[i] != B) {
				G++;
			}
			else if(A[i] != R && A[i] != G && A[i] == B) {
				B++;
			}
		}
		
		System.out.println(count);

	}

}
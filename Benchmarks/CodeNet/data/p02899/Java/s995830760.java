import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[stdIn.nextInt()-1] = i+1;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(A[i]);
		}

	}

}
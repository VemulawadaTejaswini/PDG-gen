import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] X = new int[N];
		for(int i = 0; i < K; i++) {
			int M = sc.nextInt();
			for(int j = 0; j < M; j++) {
				X[sc.nextInt() - 1]++;
			}
		}
		
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(X[i] == 0)count++;
		}
		System.out.println(count);
		sc.close();
	}
}
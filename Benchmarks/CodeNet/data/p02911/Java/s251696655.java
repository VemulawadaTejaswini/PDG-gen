import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] X = new int[N];
		for(int i = 0; i < Q; i++)
			X[sc.nextInt()-1]++;
		for(int i = 0; i < N; i++) {
			if(K-Q+X[i] > 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

}
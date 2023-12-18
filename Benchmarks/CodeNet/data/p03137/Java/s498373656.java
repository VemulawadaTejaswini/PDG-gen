import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		int ops = 0;
		if(N>=M) {
			System.out.println(ops);
			return;
		}
		int [] X = new int [M];
		for(int i=0; i<M; i++) {
			X[i] = sc.nextInt();
		}
		int [] dist = new int [M-1];
		Arrays.sort(X);
		for(int i=1; i<M;i++) {
			dist[i-1] = X[i] - X[i-1]; 
		}
		Arrays.sort(dist);
		for(int i=0; i<M-N; i++) {
			ops+=dist[i];
		}
		System.out.println(ops);
		sc.close();
	}
}
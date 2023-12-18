import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void doIt() {
		sC();
	}
	
	void sC() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X[] = new int[M];
		int d[] = new int[M - 1];
		for(int i = 0; i < M; i++) {
			X[i] = sc.nextInt();
		}
		Arrays.sort(X);
		for(int i = 0; i < M - 1; i++) {
			d[i] = X[i + 1] - X[i];
		}
		Arrays.sort(d);
		int cnt = 0;
		for(int i = 0; i < M - N; i++) {
			cnt += d[i];
		}
		//System.out.println(Arrays.toString(X));
		//System.out.println(Arrays.toString(d));		
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}

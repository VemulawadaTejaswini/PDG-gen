import java.util.Scanner;

public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int N = in.nextInt();
		int M = in.nextInt();
		int[] ALL = new int[N+M];
		for(int i=0;i<N;i++) {
			ALL[i] = 2;
		}
		for(int i=N;i<N+M;i++) {
			ALL[i] = 1;
		}

		int answer = 0;
		for(int i=0;i<N+M-1;i++) {
			for(int j=i+1;j<N+M;j++) {
				if ((ALL[i] + ALL[j]) % 2 == 0) answer++;
			}
		}


		System.out.println(answer);
	}


	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}
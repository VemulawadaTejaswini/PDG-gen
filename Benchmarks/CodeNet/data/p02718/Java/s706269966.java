import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		int N = in.nextInt();
		int M = in.nextInt();
		int[] A = new int[N];
		long total  = 0;
		for(int i=0;i<N;i++) {
			A[i] = in.nextInt();
			total += A[i];
		}
 
		int cnt = 0;
		double th = ((double)total) / (4*M);
		for(int i=0;i<N;i++) {
			if(A[i] >= th) cnt++;
		}
 
		System.out.println(cnt >= M ? "Yes" : "No");
	}
 
	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}
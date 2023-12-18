import java.util.Arrays;
import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int N = in.nextInt();
		int M = in.nextInt();

		// N = 商品数
		// M = 半額チケット（端数切り捨て）

		long[] ns = new long[N];
		for(int i = 0; i < N; i++) {
			long A = in.nextLong();
			ns[i] = A;
		}

		Arrays.sort(ns);

		for(int i = 0; i < M; i++) {
			long a = ns[N-1] / 2;
			ns[N-1] = a;
			if(i == M -1) break;
			for(int j = N - 2; j > -1;j--) {
				long b = ns[j];
				if( b <= a) {
					ns[j+1] = a;
					break;
				}else if(b > a) {
					ns[j+1] = ns[j];
				}
				if(j == 0){
					ns[j+1] = ns[j];
					ns[j] = a;
				}
			}
			}

		long sum = 0;
		for(int i=0;i<N;i++) {
			sum = sum + ns[i];
		}
		System.out.println(sum);
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}
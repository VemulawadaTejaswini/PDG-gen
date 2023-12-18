import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final int N = sc.nextInt();
		final long[] A = new long[N+1];
		final long[] B = new long[N];
		for(int i=0;i<N+1;i++) {
			A[i] = sc.nextLong();
		}
		for(int i=0;i<N;i++) {
			B[i] = sc.nextLong();
		}
		long left = 0;
		long sum = 0;
		for(int i=0;i<N;i++) {
			if(A[i]>B[i]+left) {
				// 全消費しても倒しきれない。
				sum+=(B[i]+left);
				left = 0;
			}else {
				// リソース余り(全部倒せる)
				sum+=A[i];
				if(A[i]>left) {
					// 積み立て全消費
					// 積み立てからのあまりを引き継ぐ。
					left = (B[i])-(A[i]-left);
				}else {
					// 積み立て消失+全部再積み立て
					left = B[i];
				}
			}
		}
		if(A[N]>left) {
			sum += left;
		}else {
			sum += A[N];
		}
		out.println(sum);
	}
}

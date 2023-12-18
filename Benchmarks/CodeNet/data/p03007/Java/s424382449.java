import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int N = nextInt();
		int[] A = nextIntArray(N);
		Arrays.sort(A);
		int min = A[0],max = A[N-1];
		long sum = 0;
		int zero_i = Integer.MAX_VALUE;//0以上である最初のindex
		for(int i=0;i<N;i++) {
			if(zero_i == Integer.MAX_VALUE&&0<=A[i])zero_i=i;
			sum+=Math.abs(A[i]);
		}

		if(N == 2) {
			out.println(max-min);
			out.println(max+" "+min);
			return;
		}

		long res = 0;
		if(min<=0 && 0<=max) {//正数, 0, 負数のいずれか２つ以上存在
			res = sum;
		}else if(0 < min){//正数のみ
			res = sum - min - min;
		}else if(max < 0) {//負数のみ
			res = sum + max + max;
		}

		out.println(res);
		StringBuilder buf = new StringBuilder();

		sum = 0;
		if(min<=0 && 0<=max) {//正数, 0, 負数のいずれか２つ以上存在
			if(A[1]>=0) {
				sum = A[0]-A[N-1];
				buf.append(A[0] + " " +A[N-1]+System.getProperty("line.separator"));
			}else {
				sum = A[N-1]-A[0];
				buf.append(A[N-1] + " " +A[0]+System.getProperty("line.separator"));
			}
		}else if(0 < min){//正数のみ
			sum = A[0]-A[N-1];
			buf.append(A[0] + " " +A[N-1]+System.getProperty("line.separator"));
		}else if(0 > max) {//負数のみ
			sum = A[N-1]-A[0];
			buf.append(A[N-1] + " " +A[0]+System.getProperty("line.separator"));
		}
		for(int i=1;i<N-1&&i<zero_i;i++) {
			if(A[i+1]>=0) {
				buf.append(A[i]+" "+sum+System.getProperty("line.separator"));
				sum = A[i]-sum;
			}else if(A[i+1]<0) {
				buf.append(sum+" "+A[i]+System.getProperty("line.separator"));
				sum = sum-A[i];
			}
		}
		if(zero_i == 0)zero_i = 1;
		for(int i=zero_i;i<N-1&&zero_i>=0;i++) {

			if(i == N-2) {
				buf.append(A[i]+" "+sum+System.getProperty("line.separator"));
				sum = A[i]-sum;
			}
			else {

				buf.append(sum + " " +A[i]+System.getProperty("line.separator"));
				sum = sum-A[i];
			}

		}

		out.println(buf);
	}

	private static int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	private static int nextInt() {
		return Integer.parseInt(next());
	}
	private static long nextLong() {
		return Long.parseLong(next());
	}
	private static String next() {
		return sc.next();
	}

}
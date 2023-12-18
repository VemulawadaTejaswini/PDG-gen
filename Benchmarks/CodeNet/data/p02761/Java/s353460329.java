import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int N,M;
	int[] s,c;

	private boolean f(int n) {
		String a = String.valueOf(n);
		if(a.length() != N) {
			return false;
		}
		for(int i=0;i<M;i++) {
			if(a.charAt(s[i])-'0' != c[i]) {
				return false;
			}
		}
		return true;
	}
	
	public void _main(String[] args) {
		Scanner sc = new Scanner(in);
	
		N = sc.nextInt();
		M = sc.nextInt();
		
		s = new int[M];
		c = new int[M];
		for(int i=0;i<M;i++) {
			s[i] = sc.nextInt()-1;
			c[i] = sc.nextInt();
		}
		
		int n = (int)Math.pow(10, N-1);
		if(n==1)n--;
		for(; n<Math.pow(10, N);n++) {
			if(f(n)) {
				out.println(String.valueOf(n));
				return ;
			}
		}
		out.println("-1");
	}

//	public void _main(String[] args) {
//		Scanner sc = new Scanner(in);
//
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//
//		int[] a = new int[N + 1];
//		Arrays.fill(a, -1);
//
//		for (int i = 0; i < M; i++) {
//			int s = sc.nextInt() - 1;
//			int c = sc.nextInt();
//
//			if (a[s] == -1 || a[s] == c) {
//				a[s] = c;
//			} else {
//				out.println("-1");
//				return;
//			}
//		}
//
//		sc.close();
//
//		for (int i = 0; i < N; i++) {
//			if (a[i] == -1) {
//				a[i] = 0;
//			}
//		}
//
//		String ans = "";
//		for (int i = 0; i < N; i++) {
//			ans += a[i];
//		}
//
//		int x = Integer.parseInt(ans);
//		if (N > 1 && ans.startsWith("0")) {
//			out.println("-1");
//			return;
//		}
//
//		out.println(ans);
//
//	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

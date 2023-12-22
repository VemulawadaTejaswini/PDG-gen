import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();

	public static int answer=Integer.MAX_VALUE;

	public static int N;
	public static int M;
	public static int X;

	public static int[] C;
	public static int[][] A;

	public static void main(String[] args) {


		N = in.nextInt();
		M = in.nextInt();
		X = in.nextInt();

		C = new int[N];
		A = new int[N][M];

		for(int i=0;i<N;i++) {
			C[i] = in.nextInt();
			for(int j=0;j<M;j++) {
				A[i][j] = in.nextInt();
			}
		}

		s(0, 0, new int[M]);

		System.out.println(answer == Integer.MAX_VALUE ? -1 : answer);
	}

	public static void s(int c, int idx, int[] m) {
		if(idx >= N) return;

		// 選ばない場合と選ぶ場合
		{
			s(c, idx+1,m);
		}
		{
			int tmp = c + C[idx];
			int[] tmpm = new int[M];
			for(int j=0;j<M;j++) tmpm[j] = m[j] + A[idx][j];
			boolean end=true;
			for(int j=0;j<M;j++) if(tmpm[j] < X) end=false;
			if(end) {
				//System.out.print(tmp + " ");
				//for(int j=0;j<M;j++) System.out.print(tmpm[j] + " ");
				//System.out.println();
				answer = Math.min(answer, tmp);
			}else {
				s(tmp, idx+1, tmpm);
			}
		}

	}

	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}
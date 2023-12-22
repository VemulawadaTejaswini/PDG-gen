import java.util.Scanner;

public class Main {

	static int MOD = 1000000007;

	public static void main(String[] args) {
		exec_1_1();

	}

	public static void exec_1_1() {

		try(var sc = new Scanner(System.in)) {

			int N = sc.nextInt();

			int M = sc.nextInt();

			int[] f = new int[N];


			for(int i=0; i<N; i++) f[i]=-1;

			for(int i=0; i<M; i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;


				int rIdx = rootIdx(f, a);
				int rdxB = rootIdx(f, b);
				if(f[rIdx]>f[rdxB]) {
					int swap = rIdx;
					rdxB = rIdx;
					rIdx = swap;
				}
				if(rIdx==rdxB) continue ;

				f[rIdx] += f[rdxB];
				f[rdxB] = rIdx;
			}

			int min = 0;

			for(int i=0; i<N; i++) min = Math.min(min, f[i]);

			System.out.println(min*-1);
		}
	}


	public static int rootIdx(int[] f, int x) {

		if(f[x]<0)return x;

		return f[x] = rootIdx(f, f[x]);

	}
}
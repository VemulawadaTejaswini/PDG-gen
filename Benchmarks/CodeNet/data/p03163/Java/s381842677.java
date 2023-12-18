import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int W = scan.nextInt();

		int[] w = new int[N+1];
		long[] v = new long[W+1];
		w[0] = 0;
		v[0] = 0L;

		for(int i=1;i<N+1;i++) {
			w[i] = scan.nextInt();
			v[i] = scan.nextLong();
		}

		long[][] ans = new long[N+1][W+1];

		for(int i=0;i<W+1;i++) {
			ans[0][i] = 0L;
		}

		for(int item = 1;item < N+1;item++) {
			for(int weight = 0;weight < W+1;weight++) {
				if(weight < w[item] && ans[item-1][weight] == 0) {
					ans[item][weight] = 0L;
				}else if(weight < w[item] && ans[item-1][weight] != 0){
					ans[item][weight] = ans[item-1][weight];
				}else {
					ans[item][weight]=Math.max(ans[item-1][weight],
							(long)ans[item-1][weight-w[item]]+v[item]);
				}
			}
		}

		/*		for(int i=0;i<N+1;i++) {
					for(int j=0;j<W+1;j++) {
						System.out.print(ans[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println();*/

		System.out.println(ans[N][W]);

		scan.close();
	}

}

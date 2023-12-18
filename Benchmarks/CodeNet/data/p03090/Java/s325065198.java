import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = N * (N + 1) / 2 + 1;
		boolean[][] DP = new boolean[N + 1][M];
		for (int i = 0; i <= N; i++) {
			DP[i][0] = true;
		}
		for (int non = 0; non <= N; non++) {
			for (int i = 1; i <= N; i++) {
				if(i == non)continue;
				for (int j = M-1; j >=0; j--) {
					if (j - i >= 0) {
						if (DP[non][j - i]) {
							DP[non][j] = true;
						}
					}
				}
			}
		}
		boolean[] can = new boolean[M];
		Arrays.fill(can, true);
		for(int i = 0;i <= N;i++) {
			for(int j = 0;j < M;j++) {
				can[j] &= DP[i][j];
			}
		}

		int max = 0;
		for(int i = M-1;i >=0;i--) {
			if(can[i]) {
				max = i;
				break;
			}
		}
		int[] sum = new int[N];
		Arrays.fill(sum,max);
		ArrayList<Pair> P = new ArrayList<Pair>();
		for(int i = N; i > 0;i--) {
			for(int j = i-1;j>0;j-- ) {
				if(sum[i-1]==0)break;

				if(sum[i-1] >= j && sum[j-1] >= i) {
					P.add(new Pair(i,j));
					sum[i-1]-=j;
					sum[j-1]-=i;
				}
			}
		}
		int l = P.size();
		System.out.println(l);
		for(int i = 0;i < l;i++) {
			System.out.println(P.get(i));
		}
	}

}
class Pair{
	int a;
	int b;
	Pair(int a,int b){
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return this.a + " " + this.b;
	}
}
import java.util.Scanner;

public class Main {

	private static final long MOD = (long)Math.pow(10, 9) + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		for(int i = 1;i <= K;i++) {
			long combi1 = combination(N-K+1,i);
			long combi2 = combination(K-1,i-1);
			System.out.println(combi1*combi2%MOD);
		}
	}

	public static long combination(int left,int right) {
		if(right==0 || left == right) {
			return 1;
		}
		long[][] pascal = new long[left+1][left+1];
		for(int i = 0;i < pascal.length;i++) {
			pascal[i][0] = 1;
			pascal[i][i] = 1;
		}
		for(int i = 1;i < pascal.length;i++) {
			for(int j = 1;j < pascal.length;j++) {
				pascal[i][j] = pascal[i-1][j-1]%MOD + pascal[i-1][j]%MOD;
			}
		}

		return pascal[left][right];
	}
}
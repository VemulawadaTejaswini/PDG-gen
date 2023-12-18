import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		for(int i = 1;i <= K;i++) {
			long combi1 = combi(N-K+1,i);
			long combi2 = combi(K-1,i-1);
			System.out.println(combi1*combi2%1_000_000_007);
		}
	}

	private static long combi(int i,int j) {
		if(i == 0 || j==0) {
			return 1;
		}
		return i/j * combi(i-1,j-1)%1_000_000_007;
	}
}
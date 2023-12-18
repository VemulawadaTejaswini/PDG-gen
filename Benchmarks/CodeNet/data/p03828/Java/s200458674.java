import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] num = new int[N+1];
		for(int i = 0;i < N;i++) {
			int buf = i;
			for(int j = 2;j <=buf;j++) {
				while(buf%j==0) {
					num[j]++;
					buf /= j;
				}
			}
		}
		long ans = 1;
		long mod = 1000000007;
		for(int i = 0;i <= N;i++) {
			ans *= num[i]+1;
			ans %= mod;
		}
		System.out.println(ans);
	}

}

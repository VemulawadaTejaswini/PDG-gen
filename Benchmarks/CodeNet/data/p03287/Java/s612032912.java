import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		long[] Ap = new long [N+1];
		long sum = 0;
		for(int i = 1;i <= N;i++) {
			sum += scn.nextInt()%M;
			Ap[i] = sum;
		}
		long ans = 0;
		for(int i = 1;i <= N;i++) {
			for(int j = i;j <= N;j++) {
				if((Ap[j]-Ap[i-1])%M==0)ans++;
			}
		}
		System.out.println(ans);
		scn.close();
	}
}
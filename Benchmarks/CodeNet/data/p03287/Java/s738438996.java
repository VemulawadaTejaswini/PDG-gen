import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int[] A = new int[N];
		long[] Ap = new long [N];
		long sum = 0;
		for(int i = 0;i < N;i++) {
			int ai = scn.nextInt();
			A[i] = ai;
			sum += ai;
			Ap[i] = sum;
		}
		long ans = 0;
		for(int i = 0;i < N;i++) {
			for(int j = i;j < N;j++) {
				long buf = A[i] + Ap[j]-Ap[i];
				if(buf%M==0)ans++;
			}
		}
		scn.close();
		System.out.println(ans);
	}
}
import java.util.Scanner;

public class Main {//D

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int Q=sc.nextInt();
		
		int[] L=new int[M+1];
		int[] R=new int[M+1];
		int[] p=new int[Q+1];
		int[] q=new int[Q+1];
		
		for(int k=1;k<=M;k++) {
			L[k]=sc.nextInt();
			R[k]=sc.nextInt();
		}
		for(int k=1;k<=Q;k++) {
			p[k]=sc.nextInt();
			q[k]=sc.nextInt();
		}
		for(int qe=1;qe<=Q;qe++) {
			int ans=0;
			for(int tr=1;tr<=M;tr++) {
				if(p[qe]<=L[tr]&&q[qe]>=R[tr])ans++;
			}
			System.out.println(ans);
		}
	}
}

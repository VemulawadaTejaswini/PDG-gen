import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(),C=sc.nextInt();
		int[] B = new int[M];
		//int[][] A = new int[N][M];
		int ans=0;

		for(int i=0;i<M;i++) {
			B[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			int sum=0;
			for(int j=0;j<M;j++) {
				int A=sc.nextInt();
				sum+=A*B[j];
			}
			sum+=C;
			if(sum>0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
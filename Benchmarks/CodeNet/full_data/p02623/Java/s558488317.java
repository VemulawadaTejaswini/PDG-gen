import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		int[] A=new int[N];
		int[] B=new int[M];

		for (int i = 0; i < N; i++) A[i]=sc.nextInt();
		for (int i = 0; i <M; i++)  B[i]=sc.nextInt();

		int ans=0;
		int sum=0;
		for (int i = 0; i < N+1; i++) {
			if(i>0) {
				sum+=A[i-1];
				if(sum>K) break;
			}
			
			int j=M;
			while(sum<K &&j>0){
				sum+=B[j-1];
				j--;
			}		
			ans=Math.max(ans, i+j);
		}
		System.out.println(ans);
	}
}
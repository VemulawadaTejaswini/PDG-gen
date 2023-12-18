import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[][] A=new int[N][N];
		long sum=0;
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++){
				A[i][j]=sc.nextInt();
				sum+=A[i][j];
			}
		sum/=2;
		
		for(int k=0;k<N;k++){
			for(int i=0;i<N;i++){
				for(int j=i+1;j<N;j++){
					if(i==k||j==k) continue;
					if(A[i][j]>A[i][k]+A[k][j]){
						System.out.println(-1);
						return;
					}
					if(A[i][j]==A[i][k]+A[k][j]){
						sum-=A[i][j];
					}
				}
			}
		}
		System.out.println(sum);
	}
}

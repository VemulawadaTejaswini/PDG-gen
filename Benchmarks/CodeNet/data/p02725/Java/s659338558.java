import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int K=sc.nextInt();
		int N=sc.nextInt();
		int[] A=new int[N];
		
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		
		if(A[1]-A[0]<(K-A[N-1])+A[0]) {
			int sum=0;
			for(int i=0;i<N-1;i++) {
				sum+=A[i+1]-A[i];
			}
			System.out.println(sum);
		}else {
			int sum=(K-A[N-1])+A[0];
			for(int i=2;i<=N-1;i++) {
				sum+=A[i]-A[i-1];
			}
			System.out.println(sum);
		}
		
		
		
		sc.close();
	}
}
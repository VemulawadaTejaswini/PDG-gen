import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		int X[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		X[0]=A[N-1];
		for(int j=0;j<(N-1);j++) {
			X[0]-=A[j]*(int)Math.pow(-1, N-j+1);
		}
		for(int k=1;k<N;k++) {
			X[k]=2*A[k-1]-X[k-1];
		}
		for(int l=0;l<N;l++) {
			System.out.print(X[l]+" ");
		}
	}
}
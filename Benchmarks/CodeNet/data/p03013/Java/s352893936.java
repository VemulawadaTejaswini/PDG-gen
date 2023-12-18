import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int a[]=new int[M];
		long sum[]=new long[M+1];
		long sumall=0;
		long result;
		for(int i=0;i<M;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		for(int j=0;j<=M;j++) {
			if(j==0) {
				if((a[0]-1)%2==0) {
					sum[0]=(int)Math.pow(2, (a[0]-1)/2);
				}else {
					sum[0]=(int)Math.pow(2, (a[0]-2)/2);
					sum[0]*=(a[0]-1);
				}
				sumall=sum[0];
			}
			if(1<=j&&j<M) {
				if(a[j-1]<=a[j]+1) {
					sumall=0;
					break;
				}else if((a[j]-a[j-1])%2==0){
					sum[j]=(int)Math.pow(2, (a[j]-a[j-1])/2);
				}else {
					sum[j]=(int)Math.pow(2, (a[j]-a[j-1]-1)/2);
					sum[j]*=(a[j]-a[j-1]);
				}
				sumall*=sum[j];
			}
			if(j==M) {
				if((N-a[M-1])%2==0) {
					sum[M]=(int)Math.pow(2, (N-a[M-1])/2);
				}else {
					sum[M]=(int)Math.pow(2, (N-a[M-1]-1)/2);
					sum[M]*=(N-a[M-1]);
				}
				sumall*=sum[M];
			}
		}
		result=sumall%1000000007;
		System.out.println(result);
	}
}
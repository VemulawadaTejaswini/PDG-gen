import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int A[]=new int[N];
		int sum[][]=new int[M][2];
		int z=0,x=0,y=0,max=0;
		long ans=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(A);
		while(z<M){
			sum[z][1]=stdIn.nextInt();
			sum[z][0]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(sum, (a, b) -> Long.compare(a[0], b[0]));
		while(z<N){
			if(x!=M)
				if(A[z]<sum[M-x-1][0]&&y==0){
					y=sum[M-x-1][1];
					x++;	
				}
			if(x==0)
				max=1;
			if(A[z]>=sum[M-x-max][0]||y==0)
				ans+=A[z];
			else{
				ans+=sum[M-x-max][0];
				y--;
			}
			max=0;
			z++;
		}
		System.out.println(ans);
	}
}
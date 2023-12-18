import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int X=stdIn.nextInt();
		int A[]=new int[N];
		int B[]=new int[N-1];
		int z=0,y=0,x=0,ans=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			z++;
		}z=0;
		while(z<N-1){
			B[z]=A[z]+A[z+1];
			z++;
		}z=0;
		while(z<N-1){
			if(B[z]>X){
				y=B[z]-X;
				if(y>A[z+1]){
					x=y-A[z+1];y=A[z+1];
				}
				A[z]-=x;
				A[z+1]-=y;
				if(z!=N-2)
					B[z+1]-=y;
				ans+=x+y;
			}
			x=0;y=0;z++;
		}
		System.out.println(ans);
	}
}
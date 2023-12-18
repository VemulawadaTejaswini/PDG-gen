import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int X[][]=new int[N][2];
		int A[]=new int[N];
		int z=0,y=N/2;
		while(z<N){
			X[z][0]=stdIn.nextInt();
			X[z][1]=z;
			z++;
		}z=0;
		Arrays.sort(X, (a, b) -> Long.compare(a[0], b[0]));
		while(z<N){
			if(z<y)
				A[X[z][1]]=X[y][0];
			if(z==y)
				A[X[z][1]]=X[y-1][0];
			if(z>y)
				A[X[z][1]]=X[y-1][0];
			z++;
		}z=0;
		while(z<N){
			System.out.println(A[z]);
			z++;
		}
	}
}
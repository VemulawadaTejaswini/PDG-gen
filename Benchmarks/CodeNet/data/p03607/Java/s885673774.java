import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int z=0,y=1,n=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			z++;
		}z=1;
		Arrays.sort(A);
		while(z<N){
			if(A[z]!=A[z-1]){
				if(y%2==1)
					n++;
				y=1;
			}
			else
				y++;
			z++;
		}
		if(y%2==1)
			n++;
		System.out.println(n);
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int Q=stdIn.nextInt();
		int A[]=new int[N];
		int z=0;
		while(z<Q){
			int a=stdIn.nextInt();
			A[a-1]++;
			z++;
		}z=0;
		while(z<N){
			if(A[z]+K<=Q)
				System.out.println("No");
			else
				System.out.println("Yes");
			z++;
		}
	}
}
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		long B=stdIn.nextLong();
		long N=stdIn.nextLong();
		long max=0;
		if(B>N){
			System.out.println(A*N/B);
			System.exit(0);
		}
		for(long i=B-1;i<=N;i+=B){
			long x=(A*i/B)-(A*(i/B));
			if(x>max)
				max=x;
		}
		System.out.println(max);
	}
}

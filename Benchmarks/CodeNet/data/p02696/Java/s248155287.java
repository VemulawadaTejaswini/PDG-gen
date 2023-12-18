import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		long B=stdIn.nextLong();
		long N=stdIn.nextLong();
		long x=0;
		if(B>=N)
			x=N;
		else
			x=B;
		System.out.println(A*x/B);
	}
}

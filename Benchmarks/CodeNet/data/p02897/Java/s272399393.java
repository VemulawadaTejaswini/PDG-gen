import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		double N=stdIn.nextDouble();
		int A=(int)N;
		if(N%2==0)
			System.out.println(0.5);
		else
			System.out.println((A/2+1)/N);
	}
}

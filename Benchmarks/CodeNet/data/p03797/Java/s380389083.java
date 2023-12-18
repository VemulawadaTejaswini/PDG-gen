import java.util.Scanner;

class Main {

	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long N=stdIn.nextLong();
		long M=stdIn.nextLong();
		long z=0;
		if(N>=M/2)
			System.out.println(N);
		else {
			z=((M-(N*2))/4)+N;
			System.out.println(z);
		}
	}
}
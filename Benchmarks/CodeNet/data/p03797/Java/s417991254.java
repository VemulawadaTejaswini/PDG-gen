import java.util.Scanner;

class Main {

	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long N=stdIn.nextLong();
		long M=stdIn.nextLong();
		long z=0,y=0;
		if(N>=M/2)
			System.out.println(M/2);
		else {
			z=(M-(N*2))/4;
			y=N+z;
			System.out.println(y);
		}
	}
}
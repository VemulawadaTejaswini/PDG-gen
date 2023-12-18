import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int X = in.nextInt();
			System.out.println(total(N,X));
		}
		in.close();
	}
	public static int total(int N,int X)
	{
		if(X == 1)
			return 3*N;
		else
		{
			int k = N / X - 1;
			int r = N % X;
			return 3*k*X+total(X,r);
		}
	}
}
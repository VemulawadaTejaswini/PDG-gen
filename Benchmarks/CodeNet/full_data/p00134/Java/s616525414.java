import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int m=n;
		int s=0;
		while(n--!=0)
			s+=in.nextInt();
		System.out.println(s/m);
	}

}
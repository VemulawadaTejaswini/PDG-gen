import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			while(sc.hasNext())
			{
				long a = sc.nextLong();
				long b = sc.nextLong();
				long d = a * b;
				long r = 0;
					for(;a%b != 0;)
					{
						r = a % b;
						a=b;
						b=r;
					}
						System.out.println(r +" "+ (d/r));
			}
	}
}
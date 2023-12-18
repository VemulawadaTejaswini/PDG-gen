import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		
		for(long i = -1000; i <= 1000; i++)
			for(long j = -1000; j <= 1000; j++)
			{
				long a = i*i*i*i*i;
				long b = j*j*j*j*j;
				
				if(a-b == x)
				{
					System.out.println(i + " " + j);
					return;
				}
			}
	}

}

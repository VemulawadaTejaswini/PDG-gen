import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long an = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(i%3 != 0 && i%5 != 0)
			{
				an += i;
			}
			
		}
		
		System.out.println(an);
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		if(k%2==0)
		{
			long c = k;
			long pil = n/c;
			long an = pil * pil * pil;
			
			
			long off = n + (k/2);
			long pil2 = off/c;
			an += pil2 * pil2 * pil2;
			
			System.out.println(an);
		}
		else
		{
			long c = k;
			long pil = n/c;
			
			System.out.println(pil*pil*pil);
			
		}
		

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		if(k%2==0)
		{
			int c = k;
			int pil = n/c;
			int an = pil * pil * pil;
			
			
			int off = n + (k/2);
			int pil2 = off/c;
			an += pil2 * pil2 * pil2;
			
			System.out.println(an);
		}
		else
		{
			int c = k;
			int pil = n/c;
			
			System.out.println(pil*pil*pil);
			
		}
		

	}

}

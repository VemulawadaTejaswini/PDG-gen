import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		if(str.endsWith("s"))
		{
			System.out.println(str + "es");
		}
		
		else 
		{
			System.out.println(str + "s");			
		}
		
		scan.close();

	}

}

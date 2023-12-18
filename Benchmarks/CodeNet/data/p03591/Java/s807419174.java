import java.util.Scanner;

class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		if(str.substring(0,4).equals("YAKI"))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}

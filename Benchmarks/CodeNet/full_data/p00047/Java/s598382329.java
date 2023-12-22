import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		String cu = "A";
		while(scan.hasNext())
		{	
			String str[] = scan.next().split(",");
			if(cu.equals(str[0]))
				cu = str[1];
			else if(cu.equals(str[1]))
				cu = str[0];
		}
		System.out.println(cu);
	}
}
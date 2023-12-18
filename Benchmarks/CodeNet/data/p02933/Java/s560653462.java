import java.util.*;
public class atCoder1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.nextLine();
		if(a < 3200)
		{
			System.out.println("red");
		}
		else if(a >= 3200)
			System.out.println(s);
	}
}
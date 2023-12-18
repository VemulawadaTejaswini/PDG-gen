
import java.util.Scanner;

public class HitString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(s.length()%2 != 0)
		{
			System.out.println("No");
			return;
		}
			
		for(int i = 0; i < s.length(); i++)
		{
			if(i%2 == 0)
			{
				if(s.charAt(i) != 'h')
				{
					System.out.println("No");
					return;
				}
			}
			else
			{
				if(s.charAt(i) != 'i')
				{
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");

	}

}

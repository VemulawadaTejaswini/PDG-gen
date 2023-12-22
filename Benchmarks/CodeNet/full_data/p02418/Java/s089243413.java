import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String f = sc.nextLine();
		boolean ans = false;

		for(int i = 0; i < s.length(); i++)
		{
			if(i <= s.length() - f.length())
			{
				if(s.substring(i, i+f.length()).equals(f))
				{
					ans = true;
					break;
				}
			}
			else
			{
				int l1 = s.length() - i;
				int l = f.length() - l1;
				String comp = s.substring(i) + s.substring(0, l);
				
				if(comp.equals(f))
				{
					ans = true;
					break;
				}
			}
		}
		
		if(ans)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}


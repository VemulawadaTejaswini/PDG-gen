import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int n, minId = 0, j;
			n = sc.nextInt();
			
			String words[] = new String[n];
			for(int i = 0; i < n; i++)
			{
				words[i] = sc.next();
			}
			
			for(int i = 1; i < n; i++)
			{
				for(j = 0; j < words[i].length() || j < words[minId].length(); j++)
				{
					if(words[i].charAt(j) > words[minId].charAt(j))
					{
						break;
					}
					else if(words[i].charAt(j) < words[minId].charAt(j))
					{
						minId = i;
						j = 0;
						break;
					}
					else if(j == words[i].length() - 1 && words[i].length() <= words[minId].length())
					{
						minId = i;
						j = 0;
						break;
					}
				}
			}
			
			System.out.println(words[minId]);
			
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}
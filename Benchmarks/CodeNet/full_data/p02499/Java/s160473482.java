import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			String input;
			int[] nums = new int[26];
			Arrays.fill(nums, 0);

			outer:
			while(true)
			{
				input = sc.next();
				input = input.toLowerCase();

				for(int i = 0; i < input.length() && i < 1200; i++)
				{
					if(input.charAt(i) == '.')
					{
						break outer;
					}
					nums[input.charAt(i) - 'a']++;
				}
			}

			for(int i = 0; i < 26; i++)
			{
				System.out.println((char)(i + 'a') + " : " + nums[i]);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}
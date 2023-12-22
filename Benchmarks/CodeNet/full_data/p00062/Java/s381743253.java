import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			String str = sc.next();
			int nums[] = new int[str.length()];
			for (int i = 0; i < str.length(); i++)
			{
				nums[i] = (int) (str.charAt(i) - '0');
			}
			down(nums);
		}
	}
	private static void down(int nums[])
	{
		if (nums.length == 1)
		{
			System.out.println(nums[0]);
		}
		else
		{
			int next[] = new int[nums.length - 1];
			for (int i = 0; i < next.length; i++)
			{
				next[i] = (nums[i] + nums[i+1]) % 10;
			}
			down(next);
		}
	}
}
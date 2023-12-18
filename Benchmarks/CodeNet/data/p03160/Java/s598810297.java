import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = sc.nextInt();
		int[] nums = new int[num];

		for(int i = 0; i<nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}

		int i = 0;
		while(i < nums.length)
		{
			if(i == nums.length-1)
				break;
			if(i == nums.length-2)
			{
				sum += Math.abs(nums[i] - nums[i+1]);
				break;
			}
			if(Math.abs(nums[i] - nums[i+1]) < 0.5 * Math.abs(nums[i] - nums[i+2]))
			{
				sum += Math.abs(nums[i] - nums[i+1]);
				i++;
			}
			else if(nums[i + 1] - nums[i] > .5 * nums[i+2] - nums[i])
			{
				sum += Math.abs(nums[i] - nums[i+2]);
				i+=2;
			}
			else
			{
				sum += Math.abs(nums[i] - nums[i+2]);
				i+=2;
			}
		}
		System.out.println(sum);

	}
}
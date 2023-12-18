import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
    {
     	 Scanner scan = new Scanner(System.in);
      	int val = scan.nextInt();
      	String[] words = scan.nextLine().split("");
      	int[] nums = new int[val];
      	for(int i = 0; i < val; i++)
        {
         	 nums[i] = Integer.parseInt(words[i]);
        }
      
      	for(int i = val - 1; i > 0; i--)
        {
          	int[] saveNum = new int[i];
         	for(int j = 0; j < i; j++)
            {
             	 saveNum[j] = Math.abs(nums[j] - nums[j + 1])
            }
          	nums = saveNum;
        }
      
      	System.out.println(num[0]);
    }
}
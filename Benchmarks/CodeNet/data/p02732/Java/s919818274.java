import java.util.Scanner;
public class Main
{
 	public static void main(String[] args)
    {
     	Scanner sc = new Scanner(System.in);
      	int sep = Integer.parseInt(sc.nextLine());
      	String[] sepa = sc.nextLine().split(" ");
      	int[] nums = new int[sep];
      	nums[0] = Integer.parseInt(sepa[0]);
      /*
      	int max = nums[0];
      	int min = nums[0];
        */
      	int[] sepNum = new int[200001];
      	//sepNum[nums[0]]++;
      	for(int i = 0; i < sep; i++)
        {
         	nums[i] = Integer.parseInt(sepa[i]);
          	sepNum[nums[i]] = sepNum[nums[i]] + 1;
          /*
          	if(nums[i] > max)
            {
             	max = nums[i]; 
            }
          
          	if(nums[i] < min)
            {
             	min = nums[i]; 
            }
            */
        }
      	
      	int maxRes = 0;
      	for(int i = 0; i < 200001; i++)
        {
         	 maxRes = maxRes + (sepNum[i] * (sepNum[i] - 1) / 2); 
        }
      	
      	
      	for(int i = 0; i < sep; i++)
        {
         	System.out.println(maxRes - sepNum[nums[i]] + 1); 	
        }
    }
  
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Scanner sc 	   = new Scanner(System.in);
		int N = sc.nextInt();
		int height=0,width=0;
		for(int i=0;i<N;i++) 
		{
			int a = sc.nextInt();
			nums.add(a);
		}
		Collections.sort(nums);
		Collections.reverse(nums);
		
		for(int i=1;i<nums.size();i++) 
		{
			if(nums.get(i-1)==nums.get(i)) 
			{
				 if		(height == 0)  height	 =	nums.get(i);
				 else if(height != 0) { width	 =	nums.get(i); break; }
				 nums.remove(i);nums.remove(i-1);i--;
			}
		}
		 System.out.println(height * width);
	}
}

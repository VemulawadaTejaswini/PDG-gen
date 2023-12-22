import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		int i=0,n;
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		int[] nums = new int[n];
		
		for(int j=0; j<n; j++){
			nums[j] = in.nextInt();
		}
		
		Arrays.sort(nums);
		
		for(int j=0; j<n; j++){
			System.out.print(nums[j]+" ");
		}
		
		in.close();
	}
}
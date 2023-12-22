import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc  =new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		BubbleSort(nums);
		
		
	}
	public static void  BubbleSort(int[] nums){
		int swap_count =0;
		for(int i=0;i<nums.length;i++){
			for(int j=1;j<nums.length-i;j++){
				if(nums[j]<nums[j-1]){
					swap(nums,j,j-1);
					swap_count++;
				}
			}
		}
		for(int i=0;i<nums.length;i++){
			if(i==0)System.out.print(nums[i]);
			else System.out.print(" "+nums[i]);
		}
		System.out.println();
		System.out.println(swap_count);
	}
	public static void swap(int[] nums,int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp; 
	}
}
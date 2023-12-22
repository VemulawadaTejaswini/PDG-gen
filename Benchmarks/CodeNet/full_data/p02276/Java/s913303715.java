import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		for(int i=0;i<N;i++){
			nums[i] = sc.nextInt();
		}
		int pivot = partition(nums,0,nums.length-1);
		for(int i=0;i<N;i++){
			if(i==pivot){
				System.out.print("["+nums[i]+"]");
			}else{
				System.out.print(nums[i]);
			}
			if(i!=N-1){
				System.out.print(" ");
			}
		}
		sc.close();
	}
	public static int partition(int[] nums,int p,int r){
		int x = nums[r];
		int i=p-1;
		for(int j=p;j<r;j++){
			if(nums[j]<=x){
				i++;
				swap(nums,i,j);
			}
		}
		swap(nums,i+1,r);
		return i+1;
	}
	public static void swap(int[] nums,int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
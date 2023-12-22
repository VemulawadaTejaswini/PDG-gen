import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n,q;
		n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		q = sc.nextInt();
		int[] data = new int[q];
		for(int i=0;i<q;i++){
			data[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		int ans =0;
		for(int i=0;i<q;i++){
			if(search(nums,data[i])){
				ans++;
			}
		}
		System.out.println(ans);
		
		
	}
	public static boolean search(int[] nums,int x){
		int l =0; 
		int r = nums.length-1;
		while(l<=r){
			int mid = l+(r-l)/2;
			if(nums[mid]==x){
				return true;
			}else if(nums[mid]>x){
				r =mid-1;
			}else{
				l =mid+1;
			}
		}
		return false;
	}
}
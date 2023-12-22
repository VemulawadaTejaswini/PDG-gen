import java.util.Scanner;
public class Main {
	 public  static int  merge(int[] nums,int s,int mid,int e){
		 int count=0;
	     int[] temp = new int[nums.length];
	     int i = s;
	     int j = mid+1;
	     for(int k=s;k<=e;k++){
	    	 	count++;
	           if(i>mid) temp[k] = nums[j++];
	           else if(j>e) temp[k] = nums[i++];
	           else if(nums[i]<nums[j]){ 
	        	   temp[k] = nums[i++] ;
	           }else{
	        	   temp[k] = nums[j++];
	           }
	      }
	      for(int k=s;k<=e;k++){
	           nums[k] = temp[k];
	       }
	      return count;
	   }
	  public static int mergeSort(int[] nums,int start,int end){
	      if(start>=end) return 0;
	      int mid = start+(end-start)/2;
	      int cnt = mergeSort(nums,start,mid)+mergeSort(nums,mid+1,end);
	      cnt+=merge(nums,start,mid,end);
	      return cnt;
	  }
	public static void swap(int[] nums,int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int count = mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.print(arr[i]);
			}else{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println(count);
		
	}
}
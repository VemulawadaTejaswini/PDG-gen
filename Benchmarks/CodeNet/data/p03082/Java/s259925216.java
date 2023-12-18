import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int tmp = x;
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		List<List<Integer>> lists = permuteUnique(nums);
		int sum = 0;
		for(int i=0; i< lists.size(); i++) {
			List<Integer> list = lists.get(i);
			for(int j=0; j<list.size(); j++) {
				 x = x % list.get(j);
			}
			sum += x;
			x = tmp;
		}
		System.out.println(sum % 1000000007);	
	}

	public static List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> list=new ArrayList<>();
        if(nums==null|nums.length == 0){
            list.add(new ArrayList<Integer>());
            return list;
        }
        insertionSort(nums);        
        List<Integer> array= new ArrayList<Integer>();
        for (int t : nums)
        {
            array.add(t);
        }
        list.add(array);    
        int i;
        while((i=hasNext(nums))>0){
            int a=nums[i-1];
            int b=nums[i];
            int k=i;
            int j=i;
            while(j<nums.length){
                if(nums[j]>a & nums[j]<=b){
                    b=nums[j];
                    k=j;
                }
                j++;
            }
            swap(nums,i-1,k);
            reverse(nums,i,nums.length-1);
            List<Integer> arr= new ArrayList<Integer>();
            for (int t : nums)
            {
                arr.add(t);
            }
            list.add(arr);
        }
        return list;
    }
    public static int hasNext(int[] nums){
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                return i;
            }
        }
        return 0;
    }
    public static void reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i++,j--);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return ;
    }
    public static void insertionSort(int[] arr) {
    int len = arr.length;
    int preIndex, current;
    for (int i = 1; i < len; i++) {
        preIndex = i - 1;
        current = arr[i];
        while(preIndex >= 0 && arr[preIndex] > current) {
            arr[preIndex+1] = arr[preIndex];
            preIndex--;
        }
        arr[preIndex+1] = current;
     }    
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	static int [] nums;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array = br.readLine().split(" ");
		nums = new int[array.length];
		for(int i=0;i<nums.length;i++) nums[i]=Integer.parseInt(array[i]);
		qsort(nums, 0, nums.length-1);
    	System.out.println(nums[0]+" "+nums[1]+" "+nums[2]);
    }
	
	static void qsort(int[] numbers, int left, int right){
		if (left<=right) {
			int center=numbers[(left+right)/2];
			int l=left;
			int r=right;
			while(l<=r){
				while(numbers[l]<center) l++;
				while(numbers[r]>center) r--;
				if(l<=r){
					int tmp=numbers[l];
					numbers[l]=numbers[r];
					numbers[r]=tmp;
					l++;
					r--;
				}
			}
			qsort(numbers, left, r);
			qsort(numbers, l, right);
		}
	}
}
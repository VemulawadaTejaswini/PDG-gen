import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		int[] outNums = new int[nums.length];

		int i = 0;
		for(String num : nums){
			outNums[i] = Integer.parseInt(nums[i]);
			i++;
		}

		while(outNums[0] != 0 && outNums[1] != 0){

			if(outNums[0] < outNums[1]){
				System.out.println(outNums[0] + " " + outNums[1]);
			} else {
				System.out.println(outNums[1] + " " + outNums[0]);
			}
			
			nums = sc.nextLine().split(" ");
			outNums = new int[nums.length];
			i = 0;
			for(String num : nums){
				outNums[i] = Integer.parseInt(nums[i]);
				i++;
			}

		}
	}
}
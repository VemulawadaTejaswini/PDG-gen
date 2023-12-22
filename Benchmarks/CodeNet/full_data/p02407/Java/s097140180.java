import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<nums.length; i++){
			nums[i] = scan.nextInt();
		}
		scan.close();
		for(int s = nums.length-1; s>=0; s--){
			if(s == 0){
				System.out.print(nums[s]);
			}else{

			System.out.print(nums[s] + " ");
			}
		}
		System.out.print("\n");
	}

}
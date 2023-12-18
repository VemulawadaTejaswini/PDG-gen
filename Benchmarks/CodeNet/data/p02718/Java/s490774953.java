import java.util.Scanner;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String nums = sc.nextLine();
		String num[] = nums.split(" ");
		int N = Integer.parseInt(num[0]);
		int M = Integer.parseInt(num[1]);
		String inputs = sc.nextLine();
		String input[] = inputs.split(" ");
//		String input = sc.nextLine();
//		System.out.println(input);
//		String As[] = input.split(" ");

		int count = 0;
		int sum = 0;
		for(int i = 0;i < (N - 1);i++){
			sum = sum + Integer.parseInt(input[i]);
		}

		int popular = sum / (4 * M) ;
		for(int i = 0;i < (N - 1);i++){
			if(Integer.parseInt(input[i]) >= popular){
				count++;
			}
		}

		if(count >= M){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		// String input = sc.nextLine();
	  // String nums[] = input.split(" ");

	  // long A = Long.parseLong(nums[0]);
	  // long B = Long.parseLong(nums[1]);
	  // long sum = Long.parseLong(nums[2]);

		// System.out.println(S.toString());

	}
}
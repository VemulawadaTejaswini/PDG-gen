import java.util.Scanner;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h = 0;
		int m = 0;
		int s = 0;

		s = S%60;
		m = S/60;

		h = m/60;
		m = m%60;
		// String input = sc.nextLine();
	  // String nums[] = input.split(" ");

	  // long A = Long.parseLong(nums[0]);
	  // long B = Long.parseLong(nums[1]);
	  // long sum = Long.parseLong(nums[2]);

		System.out.println(h + ":" + m + ":" + s);
		// System.out.println(S.toString());

	}
}


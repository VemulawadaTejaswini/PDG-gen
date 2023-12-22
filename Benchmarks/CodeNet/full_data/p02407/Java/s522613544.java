import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		String[] nums = sc.nextLine().split(" ");

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < len; i++){
			sb.append(nums[len - (i + 1)]).append((i + 1) < len ? " " : "");
		}

		System.out.println(sb.toString());
	}
}
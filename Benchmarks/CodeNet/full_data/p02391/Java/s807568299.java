import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		if(a < b){
			System.out.print("a < b");
		} else if(a == b){
			System.out.println("a == b");
		} else {
			System.out.println("a > b");
		}
	}
}
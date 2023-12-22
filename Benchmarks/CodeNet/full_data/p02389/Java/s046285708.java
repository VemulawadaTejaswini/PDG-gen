import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] nums = str.split(" ");
		System.out.println(Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]));
	}
}
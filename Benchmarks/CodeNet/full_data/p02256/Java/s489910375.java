import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		
		String[] nums = scin.nextLine().split(" ");
		
		int num1 = Integer.parseInt(nums[0]);
		int num2 = Integer.parseInt(nums[1]);
		
		System.out.println(gcd(num1, num2));
	}
	
	public static int gcd(int a, int b) {
		if (Integer.min(a, b) == 0){
			return Integer.max(a, b);
		}
		
		if (a == b) {
			return a;
		}
		if (a > b) {
            return gcd(a-b, b);
		}
        return gcd(a, b-a); 
	}
}


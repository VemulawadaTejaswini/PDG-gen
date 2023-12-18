import java.util.*;

class Solution {
	public static boolean contest (int required, int accepted) {
		if (required == accepted) {
			return true;
		}
		else return false;
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int required = input.nextInt();
		int accepted = input.nextInt();
		System.out.println (contest(required, accepted));
	}
}

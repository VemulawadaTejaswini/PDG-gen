import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int length = n.length();
		if(!isPalindrome(n, 0, length-1)) {
			System.out.println("No");
			return;
		}
		if(!isPalindrome(n.substring(0, ((length-1)/2)), 0, (length-1)/2-1)) {
			System.out.println("No");
			return;
		}
		if(!isPalindrome(n.substring((length+3)/2-1, length), 0, (length-1)/2-1)) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
		return;
		
	}
	static boolean isPalindrome(String s, int start, int end) {
		int length = 0;
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end--;
			length++;
		}
		return true;
	}
}

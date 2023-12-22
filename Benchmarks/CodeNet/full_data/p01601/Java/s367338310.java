import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int minDist = 1000000;
		int minNum = -1;
		for(int i=10000;i>=0;i--) {
			if (isPalindromic(i)) {
				if (Math.abs(n-i) <= minDist) {
					minDist = Math.abs(n-i);
					minNum = i;
				}
			}
		}
		System.out.println(minNum);
	}

	public static boolean isPalindromic(int n) {
		String s = String.valueOf(n);
		for(int i=0;i<s.length()/2;i++) {
			if (s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
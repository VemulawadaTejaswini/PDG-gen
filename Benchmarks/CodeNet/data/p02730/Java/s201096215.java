import java.math.*;
import java.util.*;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			int n = s.length();
			String sa = s.substring(0, (n-1)/2);
			String sb = s.substring((n+1)/2);
			
			if(isPalindrome(s)) {
				if(isPalindrome(sa)) {
					if(isPalindrome(sb)) {
						System.out.println("Yes");
					}else {
						System.out.println("No");
					}
					
					
				}
				else {
					System.out.println("No");
				}
			}else {
				System.out.println("No");
			}
			
			
			
			
			
		}
		
		static boolean isPalindrome (String s) {
			int n = s.length();
			for (int i=0; i<n/2; i++) {
				if (s.charAt(i)!=s.charAt(n-i-1)) {return false;}
			}
			return true;
		}

	}
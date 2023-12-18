import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] count = new int[26];
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 65]++;
		}
		
		int c = 0;
		for(int i = 0; i < 26; i++) {
			if(count[i] > 0)
				c++;
			if(c > 2 || count[i] != 2) {
				System.out.println("No");
				return;
			}
		}
		if(c < 2) {
			System.out.println("No");
			return;
		} else {
			System.out.println("Yes");
			return;
		}
			
	}

}

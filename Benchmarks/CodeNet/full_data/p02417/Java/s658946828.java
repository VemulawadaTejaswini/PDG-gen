import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		int[] count = new int[26];
		for (char c : input.toCharArray()) {
			c = Character.toLowerCase(c);
			if('a' <= c && c <= 'z'){
				count[c - 'a']++;
			}
		}
		
		for(int i = 0; i < 26; i++){
			System.out.println((char)('a' + i) + " : " + count[i]);
		}
	}

}
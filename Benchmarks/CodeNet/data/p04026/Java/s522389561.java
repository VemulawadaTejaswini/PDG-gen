import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static boolean flag = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int half = s.length() / 2;
		int[] count = new int[26];
		for(int i = 0; i < 26; i++) {
			count[i] = 0;
		}

		for(int i = 2; i < s.length(); i++) {
			int startIndex = 0;
			int endIndex = i;
			while(endIndex <= s.length()) {
				check(s, startIndex, endIndex);
				startIndex++;
				endIndex++;
				if(flag) break;
			}
			if(flag) break;
		}

		if(!flag)System.out.println("-1 -1");
	}

	static void check(String s, int beginIndex, int endIndex) {
		String subst = s.substring(beginIndex, endIndex);
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if(!count.containsKey(temp)) {
				count.put(temp, 1);
			}else {
				count.replace(temp, count.get(temp)+1);
			}

			if(count.get(temp) > (endIndex - beginIndex) / 2) {
				System.out.println((beginIndex+1) + " " + (endIndex));
				flag = true;
				break;
			}
		}
	}

}

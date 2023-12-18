import java.util.*;

// ARC 81-E
// https://beta.atcoder.jp/contests/arc081/tasks/arc081_c

public class Main {
	
	static ArrayList<Character> alphabets;
	
	public static void main (String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		
		alphabets = new ArrayList<Character>();
		for (int i = 0; i < 26; i++) {
			alphabets.add((char) ('a' + i));
		}
		
		String A = in.next();
	
		boolean isAnswerFound = false;
		char[] c = new char[0];
		
		// If answer is not found, this will keep going, but it's ok. The judge will return TLE
		while (!isAnswerFound) {
			c = nextComb(c);
			if (!isSubstring(A, c)) {
				isAnswerFound = true;
			}
		}
		
		System.out.println(c);
	}
	
	public static boolean isSubstring(String s, char[] ss) {
		for (int i = 0; i < ss.length; i++) {
			int index = s.indexOf(ss[i]);
			if (index < 0) {
				return false;
			}
			s = s.substring(index + 1);
		}
		return true;
	}
	
	public static char[] nextComb(char[] c) {
		if (c.length == 0) {
			return new char[]{'a'};
		} else if (c[c.length - 1] == 'z') {
			int secondLastIndex = c.length - 2;
			if (secondLastIndex >= 0 && c[secondLastIndex] != 'z') {
				c[c.length - 1] = 'a';
				int index = alphabets.indexOf(c[secondLastIndex]);
				c[secondLastIndex] = alphabets.get(index + 1);
				return c;
			}
			char[] newC = new char[c.length + 1];
			Arrays.fill(newC, 'a');
			return newC;
		} else {
			int index = alphabets.indexOf(c[c.length - 1]);
			c[c.length - 1] = alphabets.get(index + 1);
			return c;
		}
	}
}

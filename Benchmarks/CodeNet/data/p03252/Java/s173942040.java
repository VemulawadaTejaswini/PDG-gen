import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = scanner.next();
		Map<Character, Character> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char sc = s.charAt(i);
			char tc = t.charAt(i);
			if (map.containsKey(tc)) {
				if (sc == map.get(tc)) {

				} else {
					System.out.println("No");
					return;
				}
			}
			map.put(tc, sc);
		}
		System.out.println("Yes");

	}
class Pair{
	char c;
	char h;
	Pair(char c,char h){
		this.c=c;
		this.h=h;
	}
	
	boolean isPair(Pair pair) {
		if ((pair.c == this.c && pair.h == this.h) || (pair.h == this.c && pair.c == this.h))
			return true;
		else
			return false;
	}
}
}
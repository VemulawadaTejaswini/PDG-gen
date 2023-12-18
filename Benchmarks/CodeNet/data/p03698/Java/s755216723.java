import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean found[] = new boolean[26];
		for(int i = 0; i < 26; i++) found[i] = false;
		boolean result = true;
		for(int i = 0; i < s.length(); i++) {
			if(found[(int)s.charAt(i) - 97]) {
				result = false;
				break;
			}
			found[(int)s.charAt(i) - 97] = true;
		}
		if(result) System.out.println("yes");
		else System.out.println("no");
	}
}

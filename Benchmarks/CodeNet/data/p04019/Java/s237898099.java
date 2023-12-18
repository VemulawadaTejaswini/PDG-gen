import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] chars = s.toCharArray();
		Set<Character> set = new HashSet<>();
		for(char c: chars) {
			set.add(c);
		}
		if(set.size()%2==0) {
			if(set.contains('N')==set.contains('S')&&set.contains('E')==set.contains('W')) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
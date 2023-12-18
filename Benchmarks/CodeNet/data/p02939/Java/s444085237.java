import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		char[] ch = s.toCharArray();
		Set<Character> set = new HashSet<>();
		for(Character c: ch)set.add(c);
		System.out.println(s.length() - set.size());
	}
}
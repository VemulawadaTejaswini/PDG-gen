import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		Set<Character> set = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		if(set.size() == 1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}

}

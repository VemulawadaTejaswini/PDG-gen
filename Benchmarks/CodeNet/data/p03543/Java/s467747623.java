import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();
		char[] c = n.toCharArray();
		Set<Character> m = new HashSet<>();
		for(char i : c) {
			m.add(i);
		}
		if (m.size()==2 || m.size()==1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

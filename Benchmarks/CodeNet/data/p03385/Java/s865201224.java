import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> s = new HashSet<>();
		while (sc.hasNext()) {
			s.add(sc.next());
		}
		
		System.out.println(s.size() == 3 ? "Yes" : "No");
	}
}
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Set<String> set = new HashSet<>();
		String first = sc.next();
		set.add(first);
		
		char tail = first.charAt(first.length() - 1);
		for (int i = 0; i < n - 1; i++) {
			String word = sc.next();
			if (!set.add(word) || tail != word.charAt(0)) {
				System.out.println("No");
				sc.close();
				return;
			}
			tail = word.charAt(word.length() - 1);
		}
		
		System.out.println("Yes");
		
		sc.close();
	}
}



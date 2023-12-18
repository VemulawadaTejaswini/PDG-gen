import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int[] price;
	static int[] stock;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		List<Set<Character>> list = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			list.add(new HashSet<>());
		}
		
		for (int i = 0; i < s.length(); i++) {
			list.get(t.charAt(i) - 'a').add(s.charAt(i));
			if (list.get(t.charAt(i) - 'a').size() > 1) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		return;
		
	}
	
}

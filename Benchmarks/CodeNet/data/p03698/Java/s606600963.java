import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		Set<Character>set = new HashSet<>();
		for(char c : ch) {
			set.add(c);
		}
		System.out.println((ch.length == set.size()) ? "yes" : "no");		
	}

}

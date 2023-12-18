import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int s_length = s.length();
		String message = "no";
		Set<String> set = new HashSet<String>();
		for(int i = 0; i < s_length; i++) {
			set.add(s.charAt(i) + "");
		}
		if(s_length == set.size()) {
			message = "yes";
		}
		System.out.println(message);
	}
}
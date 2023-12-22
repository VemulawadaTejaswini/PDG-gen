import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		List<String> l = Arrays.asList(a.split(" "));
		Collections.sort(l);
		String s ="";
		for (int i = l.size() - 1; i >= 0; i--) {
			s = s+l.get(i)+" ";
		}
		System.out.println(s.trim());
	}
}
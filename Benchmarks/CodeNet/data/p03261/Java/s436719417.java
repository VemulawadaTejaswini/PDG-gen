import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		int n = in.nextInt(); in.nextLine();
		String before = in.nextLine();
		set.add(before);
		for (int i = 1; i < n; i++) {
			String str = in.nextLine();
			if(set.contains(str) || before.charAt(before.length() - 1) != str.charAt(0)) {
				System.out.println("No");
				return;
			}
			set.add(str);
			before = str;
		}
		System.out.println("Yes");
	}
}
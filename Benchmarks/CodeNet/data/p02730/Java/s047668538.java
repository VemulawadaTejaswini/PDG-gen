import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		if (checkReverse(S)) {
			if (checkReverse(S.substring((S.length() + 1) / 2))) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

	private static boolean checkReverse(String S) {
		List<String> Slist = Stream.of(S.split("")).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		Collections.reverse(Slist);
		String reverseS = Slist.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		return reverseS.equals(S);
	}
}
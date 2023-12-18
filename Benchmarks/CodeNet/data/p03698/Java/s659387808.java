import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String s = sc.next();

		sc.close();

		String[] sList = s.split("");

		List<String> list = Arrays.asList(sList);
		boolean ans = (list.size() == new HashSet<>(list).size());

		System.out.print(ans ? "yes" : "No");

	}

}
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		List<Set<Integer>> dict = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			dict.add(new HashSet<>());
		}

		for (int i = 0; i < n; i++) {
			String in = sc.nextLine();
			doMethod(in, dict);
		}
	}

	private static void doMethod(String in, List<Set<Integer>> dict) {

		String[] param = in.split(" ");
		int n = dict.size();
		Integer hash = param[1].hashCode();
		int key = hash % n;
		if (key<0) key = -key;

		if(param[0].equals("insert")) {
			dict.get(key).add(hash);

		} else {
			Set<Integer> kouhos = dict.get(key);
			if(kouhos.contains(hash)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
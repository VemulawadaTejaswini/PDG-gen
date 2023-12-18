import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int k = sc.nextInt();
		Set<String> set = new HashSet<>();
		List<String> a = new ArrayList<>();

		for (int i = 0; i < s.length() + 1; i++) {
			for (int j = i + 1; j < s.length() + 1; j++) {
				if (!set.contains(s.substring(i, j))) {
					set.add(s.substring(i, j));
					a.add(s.substring(i, j));
				}
			}
		}

		Collections.sort(a);
		System.out.println(a.get(k - 1));
	}
}

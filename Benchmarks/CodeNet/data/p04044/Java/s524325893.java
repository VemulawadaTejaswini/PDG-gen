import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		ArrayList<String> s = new ArrayList<String>(n);

		for (int i = 0; i < n; i++) {
			s.add(sc.next());
		}

		Collections.sort(s);

		for (int i = 0; i < n; i++) {

			System.out.print(s.get(i));
		}
	}
}
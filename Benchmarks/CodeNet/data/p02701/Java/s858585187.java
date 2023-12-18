import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			if (!map.containsKey(s))
				map.put(s, 0);
		}
		System.out.println(map.size());
	}
}
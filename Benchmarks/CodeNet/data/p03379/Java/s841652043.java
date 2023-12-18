import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		while (sc.hasNext()) {
			list.add(sc.nextInt());
		}
		for (int i = 0 ; i < n ; i++) {
			List<Integer> newList = new ArrayList<>();
			newList.addAll(list);
			newList.remove(i);
			Collections.sort(newList);
			System.out.println(newList.get(n/2-1));
		}
	}
}
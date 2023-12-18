import java.util.*;

public class Main {

	private static List<Integer> getStrings(Scanner sc, int num) {
		List<Integer> stringList = new ArrayList<>();
		while(num>0) {
			int nextInt = sc.nextInt();
			stringList.add(nextInt);
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> alist = getStrings(sc, n);
		int sum = alist.stream().mapToInt(t -> t).sum();
		Collections.sort(alist);
		Collections.reverse(alist);
		for (int i = 0; i < m; i++) {
			if (alist.get(i) * 4 * m / sum < 1) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}

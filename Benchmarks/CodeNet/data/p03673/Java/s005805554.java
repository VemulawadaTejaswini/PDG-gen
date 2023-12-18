import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (i % 2 == n % 2) {
				list.add(sc.nextInt());
			} else {
				list.add(0, sc.nextInt());
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append(" ");
			}
			sb.append(list.get(i));
		}
		System.out.println(sb);
	}
}

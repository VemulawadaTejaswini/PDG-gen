import java.util.*;
public class Main{
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int l = s.nextInt();
			List<String> list = new ArrayList<>(n);
			for (int i = 0; i < n; i++) {
				list.add(s.next());
			}
			Collections.sort(list);
			StringBuilder sb = new StringBuilder(n*l);
			for (String t : list) {
				sb.append(t);
			}
			System.out.println(sb);
		}
	}
}

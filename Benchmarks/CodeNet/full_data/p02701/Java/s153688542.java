import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		List<String> list = new ArrayList<String>();
		for (int i = 0 ; i < N; i++) {
			String s = scan.next();
			list.add(s);
		}
		scan.close();
		List<String> ans = new ArrayList<>(new HashSet<>(list));
		System.out.println(ans.size());
	}
}
import java.util.*;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result = true;
		String w = sc.next();
		ArrayList wList = new ArrayList();
		wList.add(w);
		char s = w.charAt(w.length() - 1);
		for (int i = 1; i < n; i++) {
			w = sc.next();
			if (wList.contains(w)) {
				result = false;
				break;
			}
			wList.add(w);
			if (s != w.charAt(0)) {
				result = false;
				break;
			}
			s = w.charAt(w.length() - 1);
		}
		System.out.println(result ? "Yes" : "No");
	}
}

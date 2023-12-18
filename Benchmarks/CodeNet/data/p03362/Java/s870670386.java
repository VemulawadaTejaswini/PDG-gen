import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		List<Integer> sosuu = sosuuList(55555);
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for (int i = 0; i < sosuu.size(); i++) {
			if (sosuu.get(i) % 5 == 1) {
				sb.append(sosuu.get(i) + " ");
				cnt++;
				if (cnt == n) {
					break;
				}
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}

	static List<Integer> sosuuList(int n) {
		List<Integer> sosuu = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			int r = (int) Math.sqrt(i);
			boolean flg = false;
			for (Integer o : sosuu) {
				if (r < o) {
					break;
				}
				if (i % o == 0) {
					flg = true;
					break;
				}
			}
			if (!flg) {
				sosuu.add(i);
			}
		}
		return sosuu;
	}
}

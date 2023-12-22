import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = n - 1;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < m; i++) {
			sc.nextLine();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (!set.contains(a) || !set.contains(b)) {
				cnt--;
				set.add(a);
				set.add(b);
			}
		}
		System.out.println(cnt);
	}
}

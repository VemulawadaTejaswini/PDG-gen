import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();

		// 変数strの長さ分回す
		for (int i = n; i <= Math.min(m, n+x-1); i++) {
			set.add(n);
		}
		for (int i = m; i >= Math.min(m, n-x+1); i--) {
			set.add(m);
		}
		set.forEach(System.out::println);
	}
}
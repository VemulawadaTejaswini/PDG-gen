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
		for (int i = 0; i < x; i++) {
			set.add(n++);
		}
		for (int i = 0; i < x; i++) {
			set.add(m--);
		}
		set.forEach(System.out::println);
	}
}
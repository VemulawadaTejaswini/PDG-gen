import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		TreeSet<Integer> ts = new TreeSet<>();
		for (int i = 0; i < k; i++) {
			if (a + i <= b) {
				ts.add(a + i);
			}
			if (a <= b - i) {
				ts.add(b - i);
			}
		}
		Iterator<Integer> ite = ts.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}

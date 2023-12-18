import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		int k = sc.nextInt();
		TreeSet<String> ts = new TreeSet<>();
		for (int i = 1; i <= 5 && i <= s.length(); i++) {
			for (int j = 0; j <= s.length() - i; j++) {
				ts.add(s.substring(j, i + j));
			}
		}
		Iterator ite = ts.iterator();
		for(int i = 0; i < k - 1; i++) {
			ite.next();
		}
		System.out.println(ite.next());
	}
}
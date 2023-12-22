import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			String str = sc.next();
			Set<String> set = new HashSet<String>();
			set.add(str);
			for (int i = 1; i < str.length(); i++) {
				String a = str.substring(0, i);
				String b = str.substring(i, str.length());
				String ra = new StringBuilder().append(a).reverse().toString();
				String rb = new StringBuilder().append(b).reverse().toString();
				set.add(a + rb);
				set.add(b + a);
				set.add(ra + b);
				set.add(rb + a);
				set.add(b + ra);
				set.add(ra + rb);
				set.add(rb + ra);
			}
			System.out.println(set.size());
			n--;
		}
	}

}
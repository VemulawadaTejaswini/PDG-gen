import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		sc.close();

		TreeSet<String> strSet = new TreeSet<String>();
		for (int i = 0; i < s.length(); i++) {
			for (int len = 1; len <= 5 && len + i <= s.length(); len++) {
				String str = s.substring(i, i + len);
				strSet.add(str);
			}
		}
		System.out.println(strSet.toArray(new String[0])[k - 1]);
	}
}

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Set<String> set = new LinkedHashSet<String>();
		String[] W = new String[N];
		for(int i = 0; i < N; i++) {
			String t = scan.next();
			set.add(t);
			W[i] = t;
		}
		scan.close();
		if(N != set.size()) {
			System.out.println("No");
			System.exit(0);
		}
		char c = W[0].charAt(W[0].length() - 1);
		for(int i = 1; i < N; i++) {
			if(c != W[i].charAt(0)) {
				System.out.println("No");
				System.exit(0);
			}
			c = W[i].charAt(W[i].length() - 1);
		}
		System.out.println("Yes");
	}
}
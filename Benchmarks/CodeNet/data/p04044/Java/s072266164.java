import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), l = scanner.nextInt();
		String[] ss = new String[n];
		String ans = "";
		for (int i = 0; i < n; i++) {
			ss[i] = scanner.next();
		}
		Arrays.sort(ss);
		
		for (int i = 0; i < ss.length; i++) {
			ans += ss[i];
		}
		System.out.println(ans);
		scanner.close();
	}
}
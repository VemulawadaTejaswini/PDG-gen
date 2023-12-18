import java.util.Scanner;
import java.util.Arrays;

public class Main {	
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l = scan.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = scan.next();
		}
		Arrays.sort(s);
		String r = s[0];
		for (int i = 1; i < n; i++) {
			r = r + s[i];
		}
		System.out.println(r);
	}
}

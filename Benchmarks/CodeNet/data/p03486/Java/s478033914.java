import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		sc.close();
		int l1 = s.length();
		int l2 = t.length();
		char[]c1 = new char[l1];
		char[]c2 = new char[l2];
		for(int i = 0; i < l1; i++) {
			c1[i] = s.charAt(i);
		}
		for(int i = 0; i < l2; i++) {
			c2[i] = t.charAt(i);
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		int min = Math.min(l1, l2);
		for(int i = 0; i < min; i++) {
			if(c2[l2 - i - 1] > c1[i]) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
}
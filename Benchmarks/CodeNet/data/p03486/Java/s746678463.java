import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		Arrays.sort(s);
		Arrays.sort(t);
		String S = s.toString();
		String T = t.toString();
		if (S.length()<T.length()||S.compareTo(T)<0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
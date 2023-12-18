import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		Arrays.sort(s);
		Arrays.sort(t);
		String s_asc = String.valueOf(s);
		String t_desc = new StringBuilder(String.valueOf(t)).reverse().toString();
		if(s_asc.compareTo(t_desc) < 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

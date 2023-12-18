import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'A') {
				sb.append('T');
			} else if (s[i] == 'T') {
				sb.append('A');
			} else if (s[i] == 'C') {
				sb.append('G');
			} else if (s[i] == 'G') {
				sb.append('C');
			}
		}
		System.out.println(sb);
	}
}
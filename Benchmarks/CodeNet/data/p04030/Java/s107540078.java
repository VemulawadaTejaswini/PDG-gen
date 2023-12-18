import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(c == 'B') {
				if(sb.length() > 0) {
					sb.deleteCharAt(sb.length()-1);
				}
			} else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
}
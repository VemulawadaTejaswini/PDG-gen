import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int tmp = 0;
		String answer = "";

		for (int i = 0; i < 3; i++) {
			tmp = Integer.parseInt(n.substring(i, i+1));
			if ("1".equals(String.valueOf(tmp))) {
				answer += "9";
			} else if ("9".equals(String.valueOf(tmp))) {
				answer += "1";
			} else {
				answer += tmp;
			}
		}
		System.out.println(answer);
	}
}

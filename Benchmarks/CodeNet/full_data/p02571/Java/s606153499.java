import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		int a_length = a.length();
		int b_length = b.length();

		int loop_cnt = a_length - b_length + 1;
		int answer = b_length;

		for (int i = 0; i < loop_cnt; i++) {
			int change_cnt = 0;
			for (int j = 0; j < b_length; j++) {
				if (a.charAt(i + j) != b.charAt(j)) {
					change_cnt++;
				}
			}
			if (change_cnt < answer) {
				answer = change_cnt;
			}
		}
		System.out.println(answer);
	}
}

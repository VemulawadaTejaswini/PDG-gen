import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		String[] s = {sc.next(), sc.next(), sc.next()};

		for(int i = 0;i < 3; i++) {
			sb.append(s[i].substring(i, i+1));
		}

		System.out.println(sb);
	}
}
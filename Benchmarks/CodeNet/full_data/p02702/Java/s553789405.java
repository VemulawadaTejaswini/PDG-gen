import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int count = 0;
		for (int i = 0; i <= S.length(); i++) {
			for (int j = i + 1; j < i + 6 && j <= S.length(); j++) {
				String S_div = S.substring(i, j);
				int Si = Integer.parseInt(S_div);
				if (Si % 2019 == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
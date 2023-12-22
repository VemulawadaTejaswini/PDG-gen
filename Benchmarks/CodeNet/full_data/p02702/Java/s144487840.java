import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int count = 0;
		for (int i = 0; i <= S.length(); i++) {
			for (int j = i + 1; j <= S.length(); j++) {
				String S_div = S.substring(i, j);
				long Si = Long.parseLong(S_div);
				if (Si == 0) {
					count += 0;
				} else if (Si % 2019 == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
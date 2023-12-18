import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		long num;
		long cnt = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				num = Long.parseLong(s.substring(i, j));

				if(num % 2019 == 0) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}

}

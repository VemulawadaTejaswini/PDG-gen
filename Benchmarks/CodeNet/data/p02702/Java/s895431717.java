
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		sc.close();

		for (int i = 0; i < s.length()-3; i++) {
			for (int j = i+3; j < s.length(); j++) {
				if (s.charAt(i) == '0') {
					continue;
				}
				String subStr = s.substring(i, j+1);
				int num = Integer.parseInt(subStr);
				System.out.println(num);
				if (num % 2019 == 0) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

}

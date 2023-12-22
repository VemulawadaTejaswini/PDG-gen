import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Long sum = 0L;

		if(s.length() < 4) {
			System.out.println(0);
			System.exit(0);
		}

		for(int i = 0; i < s.length() - 4; i++) {
			for(int j = i + 3; j < s.length(); j++) {
				if(Long.parseLong(s.substring(i, j + 1)) % 2019 == 0) {
					sum++;
				}
			}
		}

		System.out.println(sum);
		sc.close();
	}
}

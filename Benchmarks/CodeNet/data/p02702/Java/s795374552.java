import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String temp =scanner.nextLine();
		long n = 0;
		long m = temp.length();
		int ans = 0;

		for(int i = 0; i < m - 3; i++) {
			for(int j = i + 4; j < m + 1; j ++) {
				n = Long.parseLong(temp.substring(i,j));

				if(n % 2019 == 0) {
					ans ++;
				}
			}

		}

		System.out.println(ans);

	}
}
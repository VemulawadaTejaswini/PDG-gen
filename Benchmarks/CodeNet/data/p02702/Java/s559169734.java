import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int max = S.length();
		int count = 0;
		for(int i = 0; i < max; i++) {
			for(int j = i + ５; j < max; j++) {
				long check = Long.parseLong(S.substring(i, j));
				if(check % 2019 == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s;
		Scanner scan = new Scanner(System.in);

		s = scan.next();
		int len = s.length();

		int count = 0;
		for(int i = 0; i < len-3; i++) {
			for(int j = 4+i; j <= len; j++) {
				long n = Long.parseLong(s.substring(i, j));
				if(n % 2019 == 0) {
					count++;
				}
			}
		}

		System.out.println(count);
	}
}

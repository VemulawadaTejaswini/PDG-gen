import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		for(int i = 0; i < s.length() - 3; i++) {
			for(int j = i + 3; j < s.length() + 1; j++) {
				if (Long.parseLong(s.substring(i, j)) % 2019 == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
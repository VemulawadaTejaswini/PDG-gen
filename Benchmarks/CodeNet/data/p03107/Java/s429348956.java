import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			int count = 0;
			char target = '0';
			for(char c : S.toCharArray()) {
				if(c == target) {
					count++;
				}
			}
			System.out.println(Math.min(count, S.length() - count) * 2);
		} // Scanner Close
    }
}
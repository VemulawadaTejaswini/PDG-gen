import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			String s = sc.next();
			String t = sc.next();

			int result = Integer.MAX_VALUE;

			for (int i = 0; i <= s.length() - t.length(); i++) {

				int temp = 0;

				for (int j = 0; j < t.length(); j++) {
					if (s.charAt(i + j) != t.charAt(j)) {
						temp++;
					}
				}

				result = Math.min(result, temp);

			}

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
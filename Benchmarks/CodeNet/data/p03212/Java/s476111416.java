import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int count = 0;
		for (int i = 0; i < N; i++) {
			String s = String.valueOf(i);
			if (s.matches("^(?!.*(1|2|4|6|8|9|0)).*")) {
				if (s.matches(".*[3].*")) {
					if (s.matches(".*[5].*")) {
						if (s.matches(".*[7].*")) {
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		int count = 0;
		String s="";
		for (long i = 0; i < N; i++) {
			if (i % 2 == 1) {
				s = String.valueOf(i);
				if (s.matches("[^1246890]+")) {
					if (s.matches(".*[3].*")) {
						if (s.matches(".*[5].*")) {
							if (s.matches(".*[7].*")) {
								count++;
							}
						}
					}
				}

			}
		}
		System.out.println(count);
	}
}

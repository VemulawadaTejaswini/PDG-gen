import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int n = s.nextInt();
			final int l = s.nextInt();

			int min = Integer.MAX_VALUE;
			int pie = 0;
			for (int i = 1; i <= n; i++) {
				int aji = l + i - 1;
				if (Math.abs(aji) < Math.abs(min)) {
					min = aji;
				}
				pie += aji;
			}
			System.out.println(pie - min);
		}
	}

}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long h = sc.nextLong();
			long w = sc.nextLong();

			if (h % 3 == 0 || w % 3 == 0) {
				System.out.println("0");
				return;
			}

			long s1 = 0;
			long s2 = 0;
			long s3 = 0;

			if (h < w) {
				s1 = ((w / 3) + 1) * h;
				long w2 = w - ((w / 3) + 1);
				s2 = w2 * (h / 2);
				long h2 = h - (h / 2);
				s3 = w2 * h2;
			} else {
				s1 = ((h / 3) + 1) * w;
				long w2 = h - ((h / 3) + 1);
				s2 = w2 * (w / 2);
				long h2 = w - (w / 2);
				s3 = w2 * h2;
			}
			long ansA = Math.max(s1, Math.max(s2, s3)) - Math.min(s1, Math.min(s2, s3));


			s1 = 0;
			s2 = 0;
			s3 = 0;

			if (h < w) {
				s1 = (w / 3) * h;
				long w2 = w - (w / 3);
				s2 = w2 * (h / 2);
				long h2 = h - (h / 2);
				s3 = w2 * h2;
			} else {
				s1 = (h / 3) * w;
				long w2 = h - (h / 3);
				s2 = w2 * (w / 2);
				long h2 = w - (w / 2);
				s3 = w2 * h2;
			}
			long ansB = Math.max(s1, Math.max(s2, s3)) - Math.min(s1, Math.min(s2, s3));

			System.out.println(Math.min(ansA,ansB));

		}
	}

}
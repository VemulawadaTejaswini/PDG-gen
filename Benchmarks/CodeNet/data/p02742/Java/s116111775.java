import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			double h1 = Math.ceil((double)h / (double)2);
			double w1 = Math.ceil((double)w / (double)2);
			double h2 = Math.floor((double)h / (double)2);
			double w2 = Math.floor((double)w / (double)2);
			long ans = (long)(w1 * h1 + w2 * h2);
			System.out.println(ans);
		}

	}

}

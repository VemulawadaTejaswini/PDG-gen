import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no2();
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			Integer max = sc.nextInt();
			Integer width = sc.nextInt();
			Integer gap = sc.nextInt();

			int n = max / (width + gap);
			if (n * (width + gap) + gap > max)
				n--;
			System.out.println(n);
		}
	}
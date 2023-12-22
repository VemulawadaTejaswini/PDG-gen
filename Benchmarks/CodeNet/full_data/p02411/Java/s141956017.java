public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			while (true) {
				int m = sc.nextInt();
				int f = sc.nextInt();
				int r = sc.nextInt();

				if (m < 0 && f < 0 && r < 0) {
					break;
				}
				if (m < 0 || f < 0) {
					System.out.println("F");
					continue;
				}

				int score = m + f;
				if (score >= 80) {
					System.out.println("A");
				} else if (score >= 65) {
					System.out.println("B");
				} else if (score >= 50) {
					System.out.println("C");
				} else if (score >= 30) {
					System.out.println((r >= 50) ? "C" : "D");
				} else {
					System.out.println("F");
				}
			}
		}
	}
}

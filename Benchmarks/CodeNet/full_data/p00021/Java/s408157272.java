import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNext()) {
				int dataSet = sc.nextInt();
				for (int i = 0; i < dataSet; i++) {
					double x1 = sc.nextDouble();
					double y1 = sc.nextDouble();
					double x2 = sc.nextDouble();
					double y2 = sc.nextDouble();
					double x3 = sc.nextDouble();
					double y3 = sc.nextDouble();
					double x4 = sc.nextDouble();
					double y4 = sc.nextDouble();
					if (((y2 - y1) / (x2 - x1)) == ((y4 - y3) / (x4 - x3))) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				}
			}
		} finally {
			sc.close();
		}
	}
}
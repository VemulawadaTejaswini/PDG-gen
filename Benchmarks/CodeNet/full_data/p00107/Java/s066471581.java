import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			int d = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();

				if (d == 0 && w == 0 && h == 0) {
					break;
				}

			int n = sc.nextInt();


			for (int i = 0; i < n; i++) {
				int r = sc.nextInt();

				int min = d;
				min = Math.min(w, min);
				min = Math.min(h, min);


				if ( min <= r ) {
					System.out.println("OK");
				} else {
					System.out.println("NA");
				}
			}

		}
		sc.close();
	}
}

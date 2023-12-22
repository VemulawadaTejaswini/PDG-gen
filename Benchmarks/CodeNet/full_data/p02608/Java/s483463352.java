import java.util.Scanner;

// Aising2020_C
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int x = 1;
		int y = 1;
		int z = 1;

		boolean firstZ = true;

		for (int n = 1; n <= N; n++) {
			int fn = 0;
			int count = 0;
			int sqrt = (int) Math.sqrt(n);

			for (int i = 1; i < sqrt; i++) {
				x = i;
				for (int j = 1; j < sqrt; j++) {
					y = j;
					for (int k = 1; k < sqrt; k++) {
						z = k;
						fn = x * x + y * y + z * z + x * y + y * z + z * x;

						if (fn == n && firstZ == true) {
							sqrt = z + 1;
							firstZ = false;
						}
						if (fn == n) {
							count++;
						}
						fn = 0;
					}
				}
			}

			System.out.println(count);
			count = 0;
			firstZ = true;
		}

		sc.close();
	}

}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while ((scan.hasNext())) {

			int[] seiseki = new int[scan.nextInt()];
			for (int i = 0; i < seiseki.length; i++) {
				for (int j = 0; j < 5; j++) {
					seiseki[i] += scan.nextInt();
				}
			}

			java.util.Arrays.sort(seiseki);
			System.out.println(seiseki[seiseki.length - 1] + " " + seiseki[0]);

		}
	}
}
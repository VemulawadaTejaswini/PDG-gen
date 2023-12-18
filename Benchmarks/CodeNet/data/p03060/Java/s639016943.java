import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			String strV, strC;
			int N, result = 0;
			int[] V = new int[20];
			int[] C = new int[20];

			Scanner scanner = new Scanner(System.in);
			N = scanner.nextInt();

			scanner = new Scanner(System.in);
			strV = scanner.nextLine();

			scanner = new Scanner(System.in);
			strC = scanner.nextLine();

			for (int i = 0; i < N; i++) {
				V[i] = Integer.parseInt(strV.split(" ")[i]);
				C[i] = Integer.parseInt(strC.split(" ")[i]);
			}

			for (int i = 0; i < N; i++) {
				if (V[i] - C[i] > 0) {
					result += V[i] - C[i];
				}
			}

			System.out.print(result);

			scanner.close();
		}
}

import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		boolean flag = true;
		while (flag == true) {
			int nico = Integer.parseInt(sc.nextLine());
			if (nico == 0) break;

			int max = -5000 * 100000;
			int[][] a = new int[nico][nico];
			for (int i = 0; i < nico; i++) {
				a[0][i] = Integer.parseInt(sc.nextLine());
				if (max < a[0][i]) max = a[0][i];
			}
			
			for (int i = 1; i < nico; i++) {
				for (int j = 0; j < (nico - i); j++) {
					a[i][j] = a[i-1][j] + a[0][i+j];
					if (max < a[i][j]) max = a[i][j];
				}
			}
			System.out.println(max);
		}
	}
}
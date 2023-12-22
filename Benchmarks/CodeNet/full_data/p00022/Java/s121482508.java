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
			
			int[] a = new int[nico];
			for (int i = 0; i < nico; i++) {
				a[i] = Integer.parseInt(sc.nextLine());
			}
			
			int max = 0;
			for (int i = 0; i < nico; i++) {
				for (int j = 0; j < (nico - i); j++) {
					int sum = 0;
					
					for (int k = 0; k < (i + 1); k++) {
						sum = sum + a[j + k];
					}
					if (max < sum) max = sum;
				}
			}
			System.out.println(max);
		}
	}
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		boolean flag = true;
		
		int nico = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < nico; i++) {
			String[] param = sc.nextLine().split(" ");
			
			int d = 0;
			int[] ds = new int[10];
			for (int j = 0; j < 10; j++) {
				ds[j] = Integer.parseInt(param[j]);
				d = d + ds[j];
			}

			int l = Integer.parseInt(param[10]);
			int r = Integer.parseInt(param[11]);
			
			double point = (double)d / (r + l) * l;
			
			int j = 0;
			while (point > 0.0) {
				point = point - ds[j];
				j++;
			};
			
			System.out.println(j);
		}
		
	}
}
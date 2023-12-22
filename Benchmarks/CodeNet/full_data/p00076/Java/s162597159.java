import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			int nico = Integer.parseInt(sc.nextLine());
			if (nico == -1) break;
			
			double x = 1.0;
			double y = 0.0;
			
			for (int i = 0; i < nico; i++) {
				if (x != 0.0) {
					double rad = Math.atan(y / x);
					x = x - Math.sin(rad);
					y = y - Math.cos(rad);
				} else {
					x = x + 1.0;
				}
			}

			System.out.println(x);
			System.out.println(y);
		}
	}
}
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			double d = Double.parseDouble(sc.nextLine());
			
			double sum = d;
			for (int i = 0; i < 4; i++) {
				d = d * 2;
				sum = sum + d;
				
				d = d / 3;
				sum = sum + d;
			}
			d = d * 2;
			sum = sum + d;
			
			System.out.println(d);
		}
	}
}
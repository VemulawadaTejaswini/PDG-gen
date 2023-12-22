import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		double max = 0.0;
		double min = -1.0;
		while (sc.hasNextLine()) {
			double height = Double.parseDouble(sc.nextLine());

			if (max < height) max = height;
			if ((min > height) || (min == -1.0)) min = height;
		}
		
		System.out.println(max - min);
	}
}
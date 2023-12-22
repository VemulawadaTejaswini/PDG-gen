import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	private static final double DA = 9.8;
	private static final double DA2 = 4.9;


	public static void main(String[] args) {
		while(sc.hasNext()) {
			double v = sc.nextDouble();

			//?¨????
			double t = v / DA;
			double y = DA2 * t * t;

			int nFloor = 0;
			while(true) {
				double hight = 5 * (double)++nFloor - 5;

				if(hight > y) {
					break;
				}
			}

			System.out.println(nFloor);
		}
	}

}
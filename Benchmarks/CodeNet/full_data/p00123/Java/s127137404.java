import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			double k_500m = sc.nextDouble();
			double k_1000m = sc.nextDouble();
			
			if (k_500m < 35.50 && k_1000m < 71.00) {
				System.out.println("AAA");
			} else if (k_500m < 37.50 && k_1000m < 77.00) {
				System.out.println("AA");
			} else if (k_500m < 40.00 && k_1000m < 83.00) {
				System.out.println("A");
			} else if (k_500m < 43.00 && k_1000m < 89.00) {
				System.out.println("B");
			} else if (k_500m < 50.00 && k_1000m < 105.00) {
				System.out.println("C");
			} else if (k_500m < 55.00 && k_1000m < 116.00) {
				System.out.println("D");
			} else if (k_500m < 70.00 && k_1000m < 148.00) {
				System.out.println("E");
			} else {
				System.out.println("NA");
			}
		}
	}
}
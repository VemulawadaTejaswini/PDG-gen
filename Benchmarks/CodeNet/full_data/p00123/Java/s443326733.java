import java.util.Scanner;

public class Main {
	final static double[] LV500 = { 35.5, 37.5, 40, 43, 50, 55, 70 };
	final static double[] LV1000 = { 71, 77, 83, 89, 105, 116, 148 };
	final static String[] lv = { "AAA", "AA", "A", "B", "C", "D", "E" };

	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		a: while (in.hasNext()) {
			double _500 = in.nextDouble();
			double _1000 = in.nextDouble();
			String s = "NA";
			for (int i = 0; i < 7; i++) {
				if (LV500[i] > _500) {
					for (int j = i; j < 7; j++) {
						if (LV1000[j] > _1000) {
							System.out.println(lv[j]);
							continue a;
						}
					}
					break;
				}
			}
			System.out.println("NA");
		}
	}
}
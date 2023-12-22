import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;

		while(scan.hasNext()) {
			double high = scan.nextDouble();
			if(max < high) {
				max = high;
			}
			if(high < min) {
				min = high;
			}
		}
		System.out.println(max - min);
		scan.close();
	}

}


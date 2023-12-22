import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			double zandaka = 100;
			double rishi = 0.01d;
			long X = scn.nextLong();

			int year = 0;
			while(zandaka < X) {
				double fukuri = Math.floor(zandaka*rishi);
				zandaka = zandaka + fukuri;
				year++;
			}

			System.out.println(year);
		}
	}
}
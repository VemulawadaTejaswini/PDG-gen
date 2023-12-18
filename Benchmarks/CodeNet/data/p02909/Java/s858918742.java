import java.util.Scanner;

public class Main {

	private static final String SUNNY = "Sunny";
	private static final String CLOUDY = "Cloudy";
	private static final String RAINY = "Rainy";

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String r = null;
		switch (s) {
		case SUNNY:
			r = CLOUDY;
			break;
		case CLOUDY:
			r = RAINY;
			break;
		case RAINY:
			r = SUNNY;
			break;
		default:
			break;
		}
		System.out.println(r);
		sc.close();
	}
}

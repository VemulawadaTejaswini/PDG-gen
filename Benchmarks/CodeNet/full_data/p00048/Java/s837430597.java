import java.util.Scanner;

class Main {

	private static final String LIGHT_FLY = "light fly";
	private static final String FLY = "fly";
	private static final String BANTAM = "bantam";
	private static final String FEATHER = "feather";
	private static final String LIGHT = "light";
	private static final String LIGHT_WELTER = "light welter";
	private static final String WELTER = "welter";
	private static final String LIGHT_MIDDLE = "light middle";
	private static final String MIDDLE = "middle";
	private static final String LIGHT_HEAVY = "light heavy";
	private static final String HEAVY = "heavy";

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextDouble()) {
				double weight = scanner.nextDouble();
				System.out.println(getWeightClass(weight));
			}
		}
	}

	private static String getWeightClass(double weight) {
		String weghitClass = null;

		if (weight <= 48.00) {
			weghitClass = LIGHT_FLY;
		} else if (weight <= 51.00) {
			weghitClass = FLY;
		} else if (weight <= 54.00) {
			weghitClass = BANTAM;
		} else if (weight <= 57.00) {
			weghitClass = FEATHER;
		} else if (weight <= 60.00) {
			weghitClass = LIGHT;
		} else if (weight <= 64.00) {
			weghitClass = LIGHT_WELTER;
		} else if (weight <= 69.00) {
			weghitClass = WELTER;
		} else if (weight <= 75.00) {
			weghitClass = LIGHT_MIDDLE;
		} else if (weight <= 81.00) {
			weghitClass = MIDDLE;
		} else if (weight <= 91.00) {
			weghitClass = LIGHT_HEAVY;
		} else {
			weghitClass = HEAVY;
		}
		return weghitClass;
	}
}
import java.util.Scanner;

class Main {

	public static final String LIGHT_FLY = "light fly";
	public static final String FLY = "fly";
	public static final String BANTAM = "bantam";
	public static final String FEATHER = "feather";
	public static final String LIGHT = "light";
	public static final String LIGHT_WELTER = "light welter";
	public static final String WELTER = "welter";
	public static final String LIGHT_MIDDLE = "light middle";
	public static final String MIDDLE = "middle";
	public static final String LIGHT_HEAVY = "light heavy";
	public static final String HEAVY = "heavy";

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
		} else if (48.00 < weight && weight <= 51.00) {
			weghitClass = FLY;
		} else if (51.00 < weight && weight <= 54.00) {
			weghitClass = BANTAM;
		} else if (54.00 < weight && weight <= 57.00) {
			weghitClass = FEATHER;
		} else if (57.00 < weight && weight <= 60.00) {
			weghitClass = LIGHT;
		} else if (60.00 < weight && weight <= 64.00) {
			weghitClass = LIGHT_WELTER;
		} else if (64.00 < weight && weight <= 69.00) {
			weghitClass = WELTER;
		} else if (69.00 < weight && weight <= 75.00) {
			weghitClass = LIGHT_MIDDLE;
		} else if (75.00 < weight && weight <= 81.00) {
			weghitClass = MIDDLE;
		} else if (81.00 < weight && weight <= 91.00) {
			weghitClass = LIGHT_MIDDLE;
		} else {
			weghitClass = HEAVY;
		}
		return weghitClass;
	}
}
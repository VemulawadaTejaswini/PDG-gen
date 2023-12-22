import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[] max = new int[11];
	static String[] name = new String[11];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		initialize();

		while ((line = br.readLine()) != null) {
			float weight = Float.parseFloat(line);
			System.out.println(classfy(weight));
		}
	}

	static String classfy(float weight) {
		weight = (int) Math.ceil(weight);
		for (int i = 0; i < 11; i++) {
			if (weight <= max[i])
				return name[i];
		}
		return null;
	}

	static void initialize() {
		//
		max[0] = 48;
		max[1] = 51;
		max[2] = 54;
		max[3] = 57;
		max[4] = 60;
		max[5] = 64;
		max[6] = 69;
		max[7] = 75;
		max[8] = 81;
		max[9] = 91;
		max[10] = Integer.MAX_VALUE;
		//
		name[0] = "light fly";
		name[1] = "fly";
		name[2] = "bantam";
		name[3] = "feather";
		name[4] = "light";
		name[5] = "light welter";
		name[6] = "welter";
		name[7] = "light middle";
		name[8] = "middle";
		name[9] = "light heavy";
		name[10] = "heavy";
	}

}
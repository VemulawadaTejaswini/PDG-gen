import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String line = "";
		int[] weight = {91,81,75,69,64,60,57,54,51,48,0};
		String[] cls = {"heavy","light heavy","middle","light middle",
						"welter","light welter","light","feather","bantam","fly","light fly"};

		while ((line = br.readLine()) != null) {
			double w = Double.parseDouble(line);
			for (int i = 0; i < cls.length; i++) {
				if (w > weight[i]) {
					System.out.println(cls[i]);
					break;
				}
			}
		}


	}

}
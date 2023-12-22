import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BMI
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line, ",");
			String i = st.nextToken();
			int w = (int) (Double.parseDouble(st.nextToken()) * 10000);
			int h = (int) (Double.parseDouble(st.nextToken()) * 100);

			if (w / (h * h) >= 25) {
				System.out.println(w / (h * h));
			}
		}

	}

}
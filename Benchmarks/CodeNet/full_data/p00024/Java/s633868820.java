import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	//
	// 速度: v = 9.8t
	// 距離: y = 4.9t^2
	//

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		
		while ((line = br.readLine()) != null) {
			double v = Double.parseDouble(line);
			double t = v / 9.8;
			double y = 4.9 * t * t;
			double N = Math.ceil(y / 5) + 1;
			System.out.println((int) N);
		}
	}
}
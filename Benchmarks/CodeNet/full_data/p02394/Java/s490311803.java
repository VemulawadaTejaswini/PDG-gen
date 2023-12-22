import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] nyuryokuStr = line.split("[\\s]+");

		int weight = Integer.parseInt(nyuryokuStr[0]);
		int height = Integer.parseInt(nyuryokuStr[1]);
		int x_zahyo = Integer.parseInt(nyuryokuStr[2]);
		int y_zahyo = Integer.parseInt(nyuryokuStr[3]);
		int hankei = Integer.parseInt(nyuryokuStr[4]);

		if ((x_zahyo - hankei >= 0) && (y_zahyo + hankei > 0)) {
			if ((x_zahyo + hankei <= weight) && (y_zahyo + hankei <= height)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			Dice dice = new Dice(str);
			str = reader.readLine();
			int q = Integer.parseInt(str);

			for (int i = 0; i < q; i++) {
				str = reader.readLine();
				String[] face = str.split(" ");

				int j = 0;
				int k = 0;
				for (j = 0; j < 6; j++) {
					if (face[0].equals(dice.getFace(j))) {
						break;
					}
				}
				switch (j) {
				case 0:
					break;
				case 1:
					dice.moveN();
					break;
				case 2:
					dice.moveW();
					break;
				case 3:
					dice.moveE();
					break;
				case 4:
					dice.moveS();
					break;
				case 5:
					dice.moveN();
					dice.moveN();
					break;
				}
				for (k = 1; k < 5; k++) {
					if (face[1].equals(dice.getFace(k))) {
						break;
					}
				}
				int right = 0;
				switch (k) {
				case 1:
					right = 2;
					break;
				case 2:
					right = 4;
					break;
				case 3:
					right = 1;
					break;
				case 4:
					right = 3;
					break;
				}
				System.out.println(right);				System.out.println(dice.getFace(right));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
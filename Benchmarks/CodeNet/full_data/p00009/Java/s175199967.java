import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		print();
	}

	private static void print() {

		int counter = 0;
		boolean canDivide = true;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();

			while (str != null) {

				int n = Integer.parseInt(str);

				for (int i = 2; i < n; i++) {
					for (int j = 2; j < i; j++) {
						if (i % j == 0) {
							canDivide = false;
							break;
						}
					}

					if (canDivide) {
						counter++;
					}
					canDivide = true;
				}
				System.out.println(counter);

				str = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
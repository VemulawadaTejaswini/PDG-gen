import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		String line;
		int n;

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			line = reader.readLine();
			n = Integer.parseInt(line);
			for (int i = 1;; i++) {
				if (i > n) {
					System.out.println("");
					System.exit(0);
				} else if (i == n) {
						if (i % 3 == 0) {
							System.out.print(" " + i);
						} else {
							System.out.println("");
						}
				} else if(i>10&&i/10%3==0){
					System.out.print(" " + i);
				}
				
				else if (i % 10 == 3) {
					System.out.print(" " + i);
				}

				else if (i % 3 == 0) {
					System.out.print(" " + i);
				}
			}

		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {
			if (!line.contains(" ")) {
				int cost = Integer.parseInt(line);
				int income, outgo, month = 0;
				boolean more = true;
				while (more) {
					if ((line = br.readLine()).equals("0")) {
						break;
					}
					if (!(line = br.readLine()).contains(" ")) {
						break;
					}
					income = Integer.parseInt(line.substring(0,
							line.indexOf(' ')));
					outgo = Integer
							.parseInt(line.substring(line.indexOf(' ') + 1));
					cost -= (income - outgo);
					month++;
					if (cost <= 0) {
						more = false;
					}
				}
				System.out.println(more ? "NA" : month);
			}
		}
	}
}
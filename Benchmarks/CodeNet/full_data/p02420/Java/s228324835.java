import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";

		String str2 = "";

		String num = "";

		int num2;

		StringBuilder builder = new StringBuilder();

		while (!((str = br.readLine()).equals("-"))) {

			num = br.readLine();
			num2 = Integer.parseInt(br.readLine());

			for (int i = 0; i < Integer.parseInt(num); i++) {

				builder.append(str.substring(num2, str.length()));
				builder.append(str.substring(0, num2));

				str = builder.toString();
				builder.setLength(0);
			}
			str2 += str + "\n";


		}

		System.out.println(str2);
	}

}
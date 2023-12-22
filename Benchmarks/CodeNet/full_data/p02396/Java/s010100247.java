import java.io.*;

class Main {
	public static void main(String[] args) throws java.io.IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder str = new StringBuilder();

		int i = 0;

		while (true) {
			i++;
			String tmp = input.readLine();
			int x = Integer.parseInt(tmp);

			if (x == 0)
				break;

			str.append("Case " + i + ": " + x + "\n");

		}

		System.out.print(str);

	}
}
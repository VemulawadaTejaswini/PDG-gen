import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		String str = input.readLine();

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLowerCase(str.charAt(i)))
				System.out.print(Character.toUpperCase(str.charAt(i)));
			else
				System.out.print(Character.toLowerCase(str.charAt(i)));
		}
		System.out.println();

	}
}
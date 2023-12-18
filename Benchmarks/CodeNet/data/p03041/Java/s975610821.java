
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(br.readLine());
		scanner.nextInt();
		int k = scanner.nextInt() -1;
		scanner.close();
		String string = br.readLine();

		char characters[] = new char[string.length()];
		for(int i=0; i<string.length(); i++) {
			characters[i] = string.charAt(i);
		}
		characters[k] = Character.toLowerCase(characters[k]);
		System.out.println(String.valueOf(characters));

	}

}

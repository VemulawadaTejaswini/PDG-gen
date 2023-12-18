import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		switch (str) {
		case "Sunny":
			System.out.println("Cloudy");
			break;
		case "Cloudy":
			System.out.println("Rainy");
			break;
		default:
			System.out.println("Sunny");
			break;
		}
	}
}

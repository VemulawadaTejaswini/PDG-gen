import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] in = new String[2];
		for (int i = 0; i < 2; i++) in[i] = new Scanner(System.in).nextLine();
		
		String[] weatherForecast = in[0].split("");
		String[] weather = in[1].split("");
		int count = 0;

		for (int i = 0; i < weatherForecast.length; i++) {
			if (weatherForecast[i].equals(weather[i]))
				count++;
		}
			
		System.out.println(count);
	}
}

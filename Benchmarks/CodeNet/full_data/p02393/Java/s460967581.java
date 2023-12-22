import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

			final String inputLine = br.readLine();
			final String[] inputNumbers = inputLine.split(" ");

			Stream<String> stream = Arrays.stream(inputNumbers);

			String[] array = stream.sorted().toArray(String[]::new);
			System.out.println(array[0] + " " + array[1] + " " + array[2]);

		}

	}

}

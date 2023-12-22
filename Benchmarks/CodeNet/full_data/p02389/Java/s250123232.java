import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

			final String inputLine = br.readLine();
			final String[] inputNumber = inputLine.split(" ");

			final Integer height = Integer.valueOf(inputNumber[0]);
			final Integer width = Integer.valueOf(inputNumber[1]);

			final Integer area = height * width;
			final Integer around = (height + width) * 2;

			System.out.println(area + " " + around);
		}

	}

}

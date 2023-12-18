import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] input = new String[2];
		String line = in.readLine();

		input = line.split(" ");
		long a = Long.parseLong(input[0]);
		long b = Long.parseLong(input[1]);

		if((a * b) % 2 == 0)
			System.out.println("EVEN");
		else
			System.out.println("ODD");

	}
}
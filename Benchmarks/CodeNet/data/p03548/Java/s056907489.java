
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int X = Integer.parseInt(tokens[0]);
		int Y = Integer.parseInt(tokens[1]);
		int Z = Integer.parseInt(tokens[2]);

		X -= Z;
		int result = X / (Y + Z);
		System.out.println(result);
	}
}

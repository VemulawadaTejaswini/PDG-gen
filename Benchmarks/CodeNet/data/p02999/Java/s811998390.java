import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int X = Integer.parseInt(tokens[0]);
		int A = Integer.parseInt(tokens[1]);
		in.close();
		if (X < A) {
			System.out.println(0);
		} else {
			System.out.println(A);
		}
	}

}

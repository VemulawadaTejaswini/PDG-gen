import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int R = Integer.parseInt(tokens[0]);
		int G = Integer.parseInt(tokens[1]);
		int B = Integer.parseInt(tokens[2]);
		int N = Integer.parseInt(tokens[3]);

		in.close();
		long count = 0;
		for (int r = 0; r <= Math.floorDiv(N, R); r++) {
			for (int g = 0; g <= Math.floorDiv(N, G); g++) {
				if (r * R + g * G > N) {
					break;
				}
				if((N-R*r-G*g) % B == 0) {
					++count;
				}
			}
		}
		System.out.println(count);
	}

}
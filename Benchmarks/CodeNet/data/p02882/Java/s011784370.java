import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[1]);
		int x = Integer.parseInt(tokens[2]);
		double deg = 0.0;
		if (a * b * b / 2 >= x) {
			double z = ((double) x) * 2 / a / b;
			deg = 90 - Math.toDegrees(Math.atan(z / b));
		} else {
			int space = a * a * b - x;
			double z = (double) space * 2 / a / a;
			deg = Math.toDegrees(Math.atan(z / a));
		}
		System.out.println(String.format("%.15f", deg));
	}
}

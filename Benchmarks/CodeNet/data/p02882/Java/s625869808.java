import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		double a = Double.parseDouble(tokens[0]);
		double b = Double.parseDouble(tokens[1]);
		double x = Double.parseDouble(tokens[2]);
		double deg = 0.0;
		if (a * b * b / 2 <= x) {
			double rad = Math.atan(2 * (a * a * b - x) / (a * a * a));
			deg = Math.toDegrees(rad);
		} else {
			double rad = Math.PI / 2 - Math.atan(2 * x / (a * b * b));
			// double rad = Math.atan(a * b * b / (2 * x));
			deg = Math.toDegrees(rad);
		}
		System.out.println(String.format("%.15f", deg));
	}
}

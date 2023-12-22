import java.io.*;
import java.util.Arrays;

class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			String[] strArrays = str.split("\\s", 0);
			double a = Integer.parseInt(strArrays[0]);
			double b = Integer.parseInt(strArrays[1]);
			double c = Integer.parseInt(strArrays[2]);
			double d = Integer.parseInt(strArrays[3]);
			double e = Integer.parseInt(strArrays[4]);
			double f = Integer.parseInt(strArrays[5]);
			double y = (c * d - a * f) / (b * d - a * e);
			double x = (c - b * y) / a;
			y = (Math.round(y * 1000))/1000;
			x = (Math.round(x * 1000))/1000;
			System.out.println(String.format("%.3f", x) + " " + String.format("%.3f", y));
			str = br.readLine();
		}
	}
}
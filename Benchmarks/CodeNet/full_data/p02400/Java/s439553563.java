import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int r = Integer.parseInt(line);

		double s = r * r * Math.PI;
		double l = r * 2 * Math.PI;

		String ansS = String.format("%.5f", s);
		String ansL = String.format("%.5f", l);

		System.out.println(ansS + " " + ansL);
	}
}
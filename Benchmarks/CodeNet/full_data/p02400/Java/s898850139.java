import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		double π = 3.1415926;
		//計算
		double x = π * r * r;//面積
		double y = 2 * π * r;//円周
		String men = String.format("%.6f", x);
		String en = String.format("%.6f", y);
		System.out.println(men + " " + en);
		br.close();
	}
}
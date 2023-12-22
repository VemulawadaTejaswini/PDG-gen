import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Integer.parseInt(br.readLine());
		double π = 3.14;
		//計算
		String x = String.format("%.5f", π * r * r);//面積
		String y = String.format("%.5f", 2 * π * r);//円周
		System.out.println(x + " " + y);
		br.close();
	}
}
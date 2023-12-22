import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		double pi = Math.PI;
		double menseki = r*r*pi;
		double enshu = 2.0*pi*r;
		System.out.printf("%.6f %.6f", menseki, enshu);
	}
}
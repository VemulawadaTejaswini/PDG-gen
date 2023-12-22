import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			double r = Integer.parseInt(br.readLine());
			double π = 3.141592653589793;
			double x;	//面積
			double y;	//円周
			//計算
			x = π * r * r;
			y = 2 * π * r;
			System.out.println(x + " " + y);
	}
}
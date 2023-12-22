import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int r = Integer.parseInt(str);
		double s, l;

		s = (double)r*r*Math.PI;
		l = 2.0*r*Math.PI;

		System.out.printf("%.6f %.6f\n", s, l);
	}
}
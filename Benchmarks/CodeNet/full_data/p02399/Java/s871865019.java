import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split("\\s+");
		
		float a = Float.parseFloat(str[0]);
		float b = Float.parseFloat(str[1]);
		
		float f = a / b;
		float r = a % b;
		System.out.printf("%.0f %.0f %.6f", f, r, f);
		
	}
}
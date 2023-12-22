import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while((str=br.readLine()) != null){
			double minv = Double.parseDouble(str);
			double t = minv/9.8;
			double y = 4.9 * Math.pow(t, 2);
			double n = (y+5)/5;
			System.out.println((int)Math.ceil(n));
		}
	}
}
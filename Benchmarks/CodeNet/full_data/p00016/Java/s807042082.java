import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double x = 0;
		double y = 0;
		double a = Math.toRadians(90);
		while (!str.equals("0,0")) {
			String[] data = str.split(",", 2);
			int d = Integer.parseInt(data[0]);
			x = (x + d * Math.cos(a));
			y = (y + d * Math.sin(a));
			a = a - Math.toRadians(Integer.parseInt(data[1]));
			str = br.readLine();
		}
		System.out.println((int) x);
		System.out.println((int) y);
	}
}
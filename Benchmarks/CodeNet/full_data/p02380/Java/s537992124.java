import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String line = input.readLine();
		String[] str = line.split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);

		double rad = 0 ,s = 0 , l = 0 , h = 0 ;

		rad = c * Math.PI / 180 ;

		s = a * b * Math.sin(rad) / 2 ;
		l = a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(rad));
		h = 2 * s / a ;

		System.out.println(s + "\n" + l + "\n" + h);

	}

}
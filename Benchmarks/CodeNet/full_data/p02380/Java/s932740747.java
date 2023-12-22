import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);
		double marge = Integer.parseInt(str[2]);
		double c = Math.toRadians( marge );

		 Double h = Math.sin( c ) * b;
         Double menseki = ( a * h )/2;
		double syui = a + b + Math.sqrt((a * a)+(b * b) - 2 * ((a * b) * Math.cos(c)));
		double height = b * Math.sin(c);

		System.out.println(menseki +" "+ syui +" "+ height );

	}
}
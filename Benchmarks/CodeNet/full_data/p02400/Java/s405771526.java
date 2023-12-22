import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double a= Double.parseDouble(reader.readLine());
		System.out.println(Double.toString(a*a*3.14)+" "+Double.toString(a*2*3.14));
	}
}
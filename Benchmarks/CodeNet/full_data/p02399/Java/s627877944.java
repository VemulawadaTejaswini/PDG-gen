import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data[] = reader.readLine().split(" ");
		long a= Integer.parseInt(data[0]);
		double b= Double.parseDouble(data[1]);
		System.out.println(Long.toString((long)(a/b))+" "+Long.toString((long)(a%b))+ " " + Double.toString(a/b));
	}
}
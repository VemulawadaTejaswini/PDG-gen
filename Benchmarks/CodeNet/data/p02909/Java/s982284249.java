import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		if(s.equals("Sunny")) {
			System.out.println("Cloudy");
		}else if(s.equals("Cloudy")) {
			System.out.println("Rainy");
		}else if(s.equals("Rainy")) {
			System.out.println("Sunny");
		}
	}
}
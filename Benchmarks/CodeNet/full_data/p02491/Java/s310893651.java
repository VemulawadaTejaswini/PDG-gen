import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String[] list = str.split(" ");
		int a = Integer.parseInt(list[0]);
		int b = Integer.parseInt(list[1]);
		
		int d = a / b ;
		int r = a % b ;
		float f = (float)a / b ;
		
		System.out.println(d + " " + r + " " + f);
		
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in),1);
		String input = r.readLine();
		while (input != null){
			String[] s = input.split(" ");
			int a = Integer.valueOf(s[0]);
			int b = Integer.valueOf(s[1]);
			System.out.println(String.valueOf(a+b).length());
			input = r.readLine();
		}
	}
}
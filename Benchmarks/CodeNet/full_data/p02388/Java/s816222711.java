import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] a) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x;
		try {
			x = Integer.parseInt(br.readLine());
			System.out.println(String.valueOf(x*x*x));
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}
}

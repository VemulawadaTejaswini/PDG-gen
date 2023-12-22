import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int secTime = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

		int h = secTime / 3600;
		int m = (secTime - (secTime / 3600) * 3600) / 60;
		int s = secTime % 60;

		System.out.println(h + ":" + m + ":" + s);
	}
}
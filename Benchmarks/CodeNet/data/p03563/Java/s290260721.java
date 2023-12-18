import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String strR = bufferedReader.readLine();
		String strG = bufferedReader.readLine();
		int r = Integer.parseInt(strR);
		int g = Integer.parseInt(strG);

		int answer = g * 2 - r;
		System.out.println(answer);
	}

}

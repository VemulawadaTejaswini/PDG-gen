import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArray = new String[2];
		strArray = br.readLine().split(" ");
		int A = Integer.parseInt(strArray[0]) - 1;
		int B = Integer.parseInt(strArray[1]) - 1;

		int result = (A + B - 1) / A;

		System.out.println(result);

	}

}

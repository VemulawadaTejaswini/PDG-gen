import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArray = new String[2];
		strArray = br.readLine().split(" ");
		int A = Integer.parseInt(strArray[0]);
		int B = Integer.parseInt(strArray[1]);

		int result = 0;

		if (B % A == 0) {
			result = B / A;
		} else if (B > A) {
			result = 1;
		} else if (B < A) {
			result = (A + B + 1) / A;
		}

		System.out.println(result);

	}

}

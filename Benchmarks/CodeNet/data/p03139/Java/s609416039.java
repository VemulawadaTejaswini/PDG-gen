import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String inStr = "";
		try {
			inStr = new String(input.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] inStrArray = inStr.split(" ");

		int N = Integer.valueOf(inStrArray[0]);
		int A = Integer.valueOf(inStrArray[1]);
		int B = Integer.valueOf(inStrArray[2]);

		exec(N, A, B);

	}

	private static void exec(int _N, int _A, int _B) {

		int max = 0;
		if (_A > _B) {
			max = _B;
		} else {
			max = _A;
		}

		int min = 0;
		min = _A + _B;
		if (min > _N) {
			min -= _N;
		} else {
			min = 0;
		}

		System.out.println(Integer.toString(max) + " " + Integer.toString(min));
	}

}

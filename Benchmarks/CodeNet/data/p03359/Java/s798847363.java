import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Integer;

public class Main {

	public static void main(String[] args) throws Exception {
		String line = readLine();
		String[] strArray = line.split(" ");
		int[] array = new int[2];
		for (int i = 0; i < 2; i++) {
			array[i] = Integer.parseInt(strArray[i]);
		}

		if (array[0] <= array[1]) {
			System.out.println(array[0]);
		} else {
			System.out.println(array[0]-1);
		}

	}


	private static String readLine() throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		return br.readLine();
	}


}
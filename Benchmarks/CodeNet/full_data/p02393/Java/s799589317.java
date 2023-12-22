import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		String inStr;
		inStr = inp();
		String[] in;
		in = inStr.split(" ");

		int[] e = { Integer.valueOf(in[0]), Integer.valueOf(in[1]), Integer.valueOf(in[2]) };

		for (int i = 0; i < 2; i++)
			for (int j = i + 1; j < 3; j++)
				if (e[i] > e[j]) {
					int tmp = e[i];
					e[i] = e[j];
					e[j] = tmp;
				}

		System.out.println(e[0] + " " + e[1] + " " + e[2]);

	}

	private static String inp() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

}
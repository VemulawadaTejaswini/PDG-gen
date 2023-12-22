import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseSequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] data = str.toCharArray();

		char buf;
		for (int i = 0; i < data.length / 2; i++) {
			buf = data[i];
			data[i] = data[data.length - 1 - i];
			data[data.length - 1 - i] = buf;
		}
		System.out.println(data);
	}

}
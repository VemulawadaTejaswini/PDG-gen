import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static String ST = "ST";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder line = new StringBuilder(br.readLine());

		int stIndex;

		while (!((stIndex = line.indexOf(ST)) == -1)) {
			line.delete(stIndex, stIndex + 2);
		}

		System.out.println(line.length());
	}
}
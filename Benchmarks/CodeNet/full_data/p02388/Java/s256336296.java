import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputed = new String(in.readLine());
		int temp = Integer.parseInt(inputed);

		int answer = temp * temp * temp;
		System.out.println(answer);

	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();

		int a = Integer.parseInt(str1);

		if (a < 3200) {
			System.out.println("red");
		} else
			System.out.println(str2);
	}
}

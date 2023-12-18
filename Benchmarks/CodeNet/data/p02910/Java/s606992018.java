import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = getStdin();
		String[] arr = stdin.readLine().split("");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				if (arr[i].equals("L")) {
					System.out.println("No");
					return;
				}
			} else {
				if (arr[i].equals("R")) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");

	}

	public static BufferedReader getStdin() {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		return stdin;
	}

}
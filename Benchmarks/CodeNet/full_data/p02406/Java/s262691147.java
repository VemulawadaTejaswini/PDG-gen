import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) {
		try (BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));) {
			int n = Integer.parseInt(br.readLine());
			for (int i = 1; i <= n; i++) {
				if (i % 3 == 0 || i % 10 == 3) {
					System.out.print(" " + i);
				}
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
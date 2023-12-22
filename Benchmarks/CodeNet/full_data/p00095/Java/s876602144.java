import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		int[] top = new int[] { 0, 0 };

		br.readLine();
		while ((s = br.readLine()) != null) {
			Scanner sc = new Scanner(s);
			int _angler = sc.nextInt();
			int _catch = sc.nextInt();

			if (top[1] < _catch || (top[1] == _catch && top[0] > _angler)) {
				top[0] = _angler;
				top[1] = _catch;
			}
		}
		System.out.println(top[0] + " " + top[1]);
	}
}
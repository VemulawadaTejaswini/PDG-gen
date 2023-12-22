import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		int[] top = new int[] { 21, -1 };

		br.readLine();
//		int n = Integer.parseInt(br.readLine());
//		int i = 0;
		while ((s = br.readLine()) != null) {
//			if (i == n)
//				break;
			Scanner sc = new Scanner(s);
			int _angler = sc.nextInt();
			int _catch = sc.nextInt();

//			if (_angler < 0 || _angler > 20)
//				continue;
//			if (_catch < 0 || _angler > 100)
//				continue;

			if (top[1] < _catch || (top[1] == _catch && top[0] > _angler)) {
				top[0] = _angler;
				top[1] = _catch;
			}
//			i++;
		}
		System.out.println(top[0] + " " + top[1]);
	}
}
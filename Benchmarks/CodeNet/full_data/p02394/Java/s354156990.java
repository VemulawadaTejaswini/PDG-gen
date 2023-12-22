
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		//String s = "5 4 2 2 1";
		String[] str = s.split(" ");
		int w = Integer.parseInt(str[0]);
		int h = Integer.parseInt(str[1]);
		int x = Integer.parseInt(str[2]);
		int y = Integer.parseInt(str[3]);
		int r = Integer.parseInt(str[4]);

		int a = x + r;
		int b = y + r;
		if (a <= w && b <= h) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
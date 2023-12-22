import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String[] v = br.readLine().split(" ");
			int w = Integer.parseInt(v[0]);
			int h = Integer.parseInt(v[1]);
			int x = Integer.parseInt(v[2]);
			int y = Integer.parseInt(v[3]);
			int r = Integer.parseInt(v[4]);

			if (x >= r && x <= w - r && y >= r && y <= h - r) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
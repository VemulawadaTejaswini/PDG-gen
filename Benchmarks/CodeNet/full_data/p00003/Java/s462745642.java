import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		try {
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] v = line.split(" ");
				int a = Integer.parseInt(v[0]);
				int b = Integer.parseInt(v[1]);
				int c = Integer.parseInt(v[2]);
				int max = Math.max(Math.max(a, b), c);

				if (max == a) {
					if (a * a == b * b + c * c) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				} else if (max == b) {
					if (b * b == a * a + c * c) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				} else {
					if (c * c == a * a + b * b) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				}
			}
		} catch (Exception e) {
		}
	}
}
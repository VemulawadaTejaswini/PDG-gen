import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String P = "";

		while (true) {
			String[] str = br.readLine().split(" ");
			int m = Integer.parseInt(str[0]);
			int f = Integer.parseInt(str[1]);
			int r = Integer.parseInt(str[2]);
			if (m == -1 && f == -1 && r == -1) {
				break;
			}
			if (m == -1 || f == -1) {
				P = "F";
			} else if (m + f >= 80) {
				P = "A";
			} else if (m + f >= 65) {
				P = "B";
			} else if (m + f >= 50) {
				P = "C";
			} else if (m + f >= 30) {
				if (r >= 50) {
					P = "C";
				} else {
					P = "D";
				}
			} else {
				P = "F";
			}
			sb.append(P).append("\n");
		}
		System.out.print(sb);
	}
}
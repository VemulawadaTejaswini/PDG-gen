import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Boolean isnotEnd = true;
		while (isnotEnd) {
			String[] datasetstr = str.split(" ", 3);
			int m = Integer.parseInt(datasetstr[0]);
			int f = Integer.parseInt(datasetstr[1]);
			int r = Integer.parseInt(datasetstr[2]);
			if (m == -1 && f == -1 && r == -1) {
				isnotEnd = false;
			} else if (m == -1 || f == -1) {
				System.out.println("F");
			} else if (m + f >= 80) {
				System.out.println("A");
			} else if (m + f >= 65) {
				System.out.println("B");
			} else if (m + f >= 50) {
				System.out.println("C");
			} else if (m + f >= 30) {
				if (r >= 50) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("F");
			}
			str = br.readLine();
		}
	}
}
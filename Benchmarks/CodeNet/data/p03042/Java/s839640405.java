import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();

			String s1 = str.substring(0, 2);
			String s2 = str.substring(2, 4);

			int i1 = Integer.parseInt(s1);
			int i2 = Integer.parseInt(s2);

			if (i1 < 12) {
				if (i2 < 12) {
					System.out.println("AMBIGUOUS");
				} else {
					System.out.println("MMYY");
				}
			} else {
				if (i2 < 12) {
					System.out.println("YYMM");
				} else {
					System.out.println("NA");
				}
			}

			System.out.println(s1 + " " + s2);

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
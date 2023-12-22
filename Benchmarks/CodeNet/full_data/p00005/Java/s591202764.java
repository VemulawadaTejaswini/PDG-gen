import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int numint[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			String numstr[] = str.split(" ", 0);
			numint = new int[2];
			numint[0] = Integer.parseInt(numstr[0]);
			numint[1] = Integer.parseInt(numstr[1]);
			int gcm = Euclid();
			int lcm = numint[0] * numint[1] / gcm;
			System.out.println(gcm + " " + lcm);
			str = br.readLine();
		}
	}

	public static int Euclid() {
		int x = numint[0];
		int y = numint[1];
		while (x != y) {
			if (x < y) {
				y = y - x;
			} else {
				x = x - y;
			}
		}
		return x;
	}
}
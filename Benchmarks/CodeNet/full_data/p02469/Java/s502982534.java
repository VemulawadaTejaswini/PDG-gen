import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int numint[];
	public static int multiplied[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String countstr = str;
		int countint = Integer.parseInt(countstr);
		str = br.readLine();
		String numstr[] = str.split(" ", 0);
		numint = new int[countint];
		for (int i = 1; i <= countint; i++) {
			numint[i - 1] = Integer.parseInt(numstr[i - 1]);
		}
		multiplied = new int[countint];
		multiplied[0] = numint[0];
		for (int j = 1; j < countint; j++) {
			int gcm = Euclid(j - 1);
			multiplied[j] = multiplied[j - 1] * numint[j] / gcm;
		}
		System.out.println(multiplied[countint - 1]);

	}

	public static int Euclid(int k) {
		int x = multiplied[k];
		int y = numint[k + 1];
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int minv = Integer.MAX_VALUE;
		int maxv = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int j = Integer.parseInt(reader.readLine());
			if (maxv < j - minv)
				maxv = j - minv;
			if (j < minv)
				minv = j;
		}
		System.out.println(maxv);
	}
}
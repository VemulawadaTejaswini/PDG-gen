import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] as = br.readLine().split(" ");

		ArrayList<Integer> anums = new ArrayList<Integer>();
		for (String s : as) {
			anums.add(Integer.parseInt(s));
		}

		int c = 0;
		for (int i = 0; i < anums.size(); i++) {
			int xor = anums.get(i);
			int sum = anums.get(i);
			c++;
			for (int j = i + 1; j < anums.size(); j++) {
				xor ^= anums.get(j);
				sum += anums.get(j);
				if (xor == sum)
					c++;
			}
		}
		System.out.println(c);

	}

}

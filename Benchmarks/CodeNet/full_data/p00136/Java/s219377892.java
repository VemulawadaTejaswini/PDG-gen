import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] check = new int[6];
		int[] high = {165,170,175,180,185,Integer.MAX_VALUE};
		for (int i = 0; i < n; i++) {
			double d = Double.parseDouble(br.readLine());
			for (int j = 0; j < high.length; j++) {
				if (d < high[j]) {
					check[j]++;
					break;
				}
			}
		}

		for (int i = 0; i < check.length; i++) {
			System.out.print((i + 1) + ":");
			for (int j = 0; j < check[i]; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
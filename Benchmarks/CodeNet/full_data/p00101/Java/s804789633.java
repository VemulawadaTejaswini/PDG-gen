import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < str.length; j++)
				str[j] = str[j].equals("Hoshino") ? "Hoshina" : str[j];
			System.out.print(str[0]);
			for (int j = 1; j < str.length; j++)
				System.out.print(" " + str[j]);
			System.out.println();
		}

	}

}
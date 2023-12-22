
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int a;
		
		String s;
		while ((s = reader.readLine()) != null) {
			int count = 0;
			a = Integer.parseInt(s);
			for (int i = 1; i < 10; i++)
				for (int j = 1; j < 10; j++)
					for (int k = 1; k < 10; k++)
						for (int l = 1; l < 10; l++)
							if (i + j + k + l == a)
								count++;
			System.out.println(count);
		}

	}

}
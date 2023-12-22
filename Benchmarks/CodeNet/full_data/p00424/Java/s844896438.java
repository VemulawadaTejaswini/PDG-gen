import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (!str.equals("0")) {
			int n = Integer.parseInt(str);
			String[] convBef = new String[n];
			String[] convAft = new String[n];
			for (int i = 0; i < n; i++) {
				str = br.readLine();
				String[] chara = str.split(" ");
				convBef[i] = chara[0];
				convAft[i] = chara[1];
			}
			str = br.readLine();
			int m = Integer.parseInt(str);
			for (int i = 0; i < m; i++) {
				Boolean isEqual = false;
				str = br.readLine();
				for (int j = 0; j < n; j++) {
					if (str.equals(convBef[j])) {
						System.out.print(convAft[j]);
						isEqual = true;
						break;
					}
				}
				if (!isEqual)
					System.out.print(str);
			}
			System.out.println();
			str = br.readLine();
		}
	}
}
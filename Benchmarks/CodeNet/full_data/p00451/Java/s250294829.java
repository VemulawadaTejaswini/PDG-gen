import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			String[] strA = str.split("");
			str = br.readLine();
			String[] strB = str.split("");
			int lengthA = strA.length;
			int lengthB = strB.length;
			int maxn = 0;
			for (int i = 0; i < lengthA; i++) {
				for (int j = 0; j < lengthB; j++) {
					if (strA[i].equals(strB[j])) {
						int n = 1;
						while (i + n < lengthA && j + n < lengthB
								&& strA[i + n].equals(strB[j + n])) {
							n++;
						}
						if (maxn < n)
							maxn = n;
						j = j + n - 1;
					}
				}
			}
			System.out.println(maxn);
			str = br.readLine();
		}
	}
}
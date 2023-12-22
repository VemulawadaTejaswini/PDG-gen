import java.io.*;
import java.util.Arrays;

class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		while (str != null) {
			String[] strArrays = str.split("\\s", 0);
			Arrays.sort(strArrays);
			int[] intArrays = new int[strArrays.length];
			for (int i = 0; i < strArrays.length; i++) {
				intArrays[i] = Integer.parseInt(strArrays[i]) * Integer.parseInt(strArrays[i]);
			}
			if ((intArrays[0] + intArrays[1]) == intArrays[2]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			str = br.readLine();
		}
	}
}
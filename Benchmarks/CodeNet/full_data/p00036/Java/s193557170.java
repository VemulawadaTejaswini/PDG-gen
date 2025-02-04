import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static String solve (String[] str) {
		main : for (int i = 0; i < str.length - 2; i++) {
			for (int j = 0; j < str[i].length() - 2; j++) {
				if (str[i].charAt(j) == '1') {
					break main;
				}
			}
		}
		return "";
//		if (str[baseY].charAt(baseX + 1) == '1') {
//
//			if (str[baseY + 1].charAt(baseX) == '1')
//				return str[baseY + 1].charAt(baseX + 1) == '1' ? "A" : "G";
//			else
//				return str[baseY + 1].charAt(baseX + 1) == '1' ? "E" : "C";
//
//		} else {
//
//			if (str[baseY + 2].charAt(baseX) == '1')
//				return "B";
//			else
//				return str[baseY + 1].charAt(baseX + 1) == '1' ? "F" : "D";
//
//		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while ((line = br.readLine()) != null) {
			if (line.isEmpty()) continue;
			String[] str = new String[10];
			str[0] = line + "00";
			for (int i = 1; i < str.length - 2; i++)
				str[i] = br.readLine() + "00";
			System.out.println(solve(str));
		}

	}

}
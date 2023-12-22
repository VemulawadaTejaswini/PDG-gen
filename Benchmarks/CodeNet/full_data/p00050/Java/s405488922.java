import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static String replace (String s1, int i, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 =s2.toCharArray();
		for (int j = 0; j < c2.length; j++)
			c1[i + j] = c2[j];
		return String.valueOf(c1);
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean isEnd = false;
		while (isEnd == false) {
			isEnd = true;
			int i1 = str.indexOf("apple");
			int i2 = str.indexOf("peach");
			if (i1 != -1 && !list.contains(i1)) {
				isEnd = false;
				list.add(i1);
				str = replace(str, i1,"peach");
			}
			if (i2 != -1 && !list.contains(i2)) {
				isEnd = false;
				list.add(i2);
				str = replace(str, i2,"apple");
			}
		}

		System.out.println(str);
	}

}
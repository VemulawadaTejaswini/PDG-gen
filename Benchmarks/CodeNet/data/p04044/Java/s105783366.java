import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] a = strToIntArray(br.readLine());

			List<String> SList = new ArrayList<String>();
			for (int i = 0; i < a[0]; i++) {
				SList.add(br.readLine());
			}

			Collections.sort(SList);

			StringBuilder sb = new StringBuilder("");

			for (String string : SList) {
				sb.append(string);
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			System.err.println("Error:" + e.getMessage());
		}
	}

	// Stringで読みこんでスペースで分割されている数字を配列に入れるやつ
	// 利用法 int[] A = strTointArray(br.readLine());
	static int[] strToIntArray(String S) {
		String[] strArray = S.split(" ");
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}
}

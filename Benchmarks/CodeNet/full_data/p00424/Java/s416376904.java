import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	private static BufferedReader br;
	private static Map<String, String> dic;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String line = br.readLine();
			int sizeDic = Integer.parseInt(line);
			if (sizeDic == 0) {
				break;
			}
			Map<String, String> dic = makeDictionary(sizeDic);
			int length = Integer.parseInt(br.readLine());
			String res = interpret(length);
			//System.out.println(dic);
			System.out.println(res);
		}
	}

	public static Map<String, String> makeDictionary(int sizeDic) throws IOException {
		dic = new HashMap<String, String>();
		for (int i = 0; i < sizeDic; i++) {
			String[] kv = br.readLine().trim().split(" ");
			dic.put(kv[0], kv[1]);
		}
		return dic;
	}

	public static String interpret(int length) throws IOException {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++){
			String str = br.readLine().trim();
			if (dic.containsKey(str)) {
				sb.append(dic.get(str));
			} else {
				sb.append(str);
			}
		}
		return sb.toString();
	}
}
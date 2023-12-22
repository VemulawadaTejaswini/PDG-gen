import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Production
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			TreeMap<Integer, Integer> product = new TreeMap<Integer, Integer>();
			int n = Integer.parseInt(line);

			int name, quant, delim;
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				delim = line.indexOf(' ');
				name = stoi(line.substring(0, delim));
				quant = Integer.parseInt(line.substring(delim + 1));
				if (product.containsKey(name)) {
					product.put(name, product.get(name) + quant);
				} else {
					product.put(name, quant);
				}
			}
			StringBuilder sb = new StringBuilder();
			for (Entry<Integer, Integer> e : product.entrySet()) {
				sb.append(itos(e.getKey().intValue()) + " "
						+ e.getValue().toString() + "\n");
			}
			System.out.println(sb.toString());
		}
	}

	static int stoi(String str) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			result <<= 5;
			result += (str.charAt(i) - '@');
		}
		return result;
	}

	static String itos(int num) {
		char[] str = new char[5];
		int c, len = 0;
		//
		for (int i = 4; i >= 0; i--) {
			c = num >> 5 * i & 31;
			if (c != 0) {
				str[len] = (char) (c + '@');
				len++;
			}
		}
		return (new String(Arrays.copyOf(str, len)));
	}
}
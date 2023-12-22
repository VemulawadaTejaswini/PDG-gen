import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			Map<String, Integer> map = new LinkedHashMap<String, Integer>();
			map.put("a", 0);
			map.put("b", 0);
			map.put("c", 0);
			map.put("d", 0);
			map.put("e", 0);
			map.put("f", 0);
			map.put("g", 0);
			map.put("h", 0);
			map.put("i", 0);
			map.put("j", 0);
			map.put("k", 0);
			map.put("l", 0);
			map.put("m", 0);
			map.put("n", 0);
			map.put("o", 0);
			map.put("p", 0);
			map.put("q", 0);
			map.put("r", 0);
			map.put("s", 0);
			map.put("t", 0);
			map.put("u", 0);
			map.put("v", 0);
			map.put("w", 0);
			map.put("x", 0);
			map.put("y", 0);
			map.put("z", 0);
			String input = br.readLine();
			int i;
			for (i = 0; i < input.length(); i++) {
				String c = input.substring(i, i + 1).toLowerCase();
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				}
			}
			for(Map.Entry<String, Integer> e : map.entrySet()) {
			    System.out.println(e.getKey() + " : " + e.getValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
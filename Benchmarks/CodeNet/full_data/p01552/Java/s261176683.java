import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * YAML
 */
public class P2438 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		P2438 main = new P2438();

		StringTokenizer query = new StringTokenizer(br.readLine(), ".");
		List<String> yaml = new ArrayList<>();
		Obj[] objs = new Obj[50_000];

		//read
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			yaml.add(line);
		}

		//parse
		for (int i = 0; i < yaml.size(); i++) {
			String line1 = yaml.get(i);

			//parent
			int n = 0;
			for (int j = 0; j < line1.length(); j++) {
				if (line1.charAt(j) == ' ') n++;
				else break;
			}
			if (objs[n] == null) {
				objs[n] = main.new Obj();
			}

			//prop
			words = line1.substring(n).split(":");
			if (words.length == 1) {
				//prop: object
				String line2 = yaml.get(i + 1);
				//self
				int m = 0;
				for (int j = 0; j < line2.length(); j++) {
					if (line2.charAt(j) == ' ') m++;
					else break;
				}
				if (objs[m] == null) {
					objs[m] = main.new Obj();
				}
				String key = words[0];
				objs[n].props.put(key, main.new Prop<Obj>(objs[m]));
			} else {
				//prop: string
				String key = words[0];
				String string = words[1].substring(1);
				objs[n].props.put(key, main.new Prop<String>(string));
			}
		}

		Obj obj = objs[0];
		Prop prop = null;
		while (query.hasMoreTokens()) {
			if ((prop = obj.get(query.nextToken())) != null) {
				if (prop.value instanceof Obj) {
					obj = (Obj) prop.value;
				} else {
					if (query.hasMoreTokens()) {
						prop = null;
						break;
					}
				}
			}
		}

		String ans = "";
		if (prop == null) {
			ans = "no such property";
		} else if (prop.value instanceof String) {
			ans = "string \"" + prop.value + "\"";
		} else if (prop.value instanceof Obj) {
			ans = "object";
		}
		System.out.println(ans);

	} //end main


	class Obj {
		Map<String, Prop> props;

		Obj() {
			props = new HashMap<>();
		}

		Prop get(String key) {
			return props.get(key);
		}
	}

	class Prop<T> {
		T value;

		Prop(T value) {
			this.value = value;
		}
	}
}
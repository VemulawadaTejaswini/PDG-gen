import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static char[] input;
	static int pos;

	public static void main(String[] arg) {
		String[] q = sc.nextLine().split("\\.");
		StringBuilder sb = new StringBuilder();
		while (sc.hasNext()) {
			sb.append(sc.nextLine() + "\n");
		}
		input = sb.toString().toCharArray();
		Elem elem = parseMapping(0);
		for (int i = 1; i < q.length && elem != null; ++i) {
			elem = elem.get(q[i]);
		}
		System.out.println(elem == null ? "no such property" : elem.toString());
	}

	static Mapping parseMapping(int indent) {
		Mapping mapping = new Mapping();
		while (true) {
			int n = nextIndent();
			if (n != indent) break;
			pos += indent;
			int sp = pos;
			while (input[pos] != ':') {
				++pos;
			}
			String key = String.valueOf(input, sp, pos - sp);
			++pos;
			if (input[pos] == '\n') {
				++pos;
				int m = nextIndent();
				Mapping child = parseMapping(m);
				mapping.map.put(key, child);
			} else {
				++pos;
				sp = pos;
				while (input[pos] != '\n') {
					++pos;
				}
				mapping.map.put(key, new Str(String.valueOf(input, sp, pos - sp)));
				++pos;
			}
		}
		return mapping;
	}

	static int nextIndent() {
		int cur = pos;
		if (cur >= input.length) return -1;
		while (input[cur] == ' ') {
			++cur;
		}
		return cur - pos;
	}

	static abstract class Elem {
		abstract Elem get(String key);
	}

	static class Mapping extends Elem {
		HashMap<String, Elem> map = new HashMap<String, Elem>();

		Elem get(String key) {
			return map.get(key);
		}

		public String toString() {
			return "object";
		}
	}

	static class Str extends Elem {
		String v;

		Str(String s) {
			this.v = s;
		}

		Elem get(String key) {
			return null;
		}

		public String toString() {
			return "string \"" + v + "\"";
		}
	}

}
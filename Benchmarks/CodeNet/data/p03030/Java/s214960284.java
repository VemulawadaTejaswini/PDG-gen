import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
	static class Tuple implements Comparable<Tuple> {
		int id;
		String str;
		int value;

		Tuple(int id, String str, int value) {
			this.id = id;
			this.str = str;
			this.value = value;
		}

		@Override
		public int compareTo(Tuple o) {
			if (this.str.equals(o.str)) {
				if (this.value > o.value) {
					return -1;
				} else if (this.value < o.value) {
					return 1;
				} else {
					return 0;
				}
			} else {
				return this.str.compareTo(o.str);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());

		List<Tuple> shops = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.readLine().split(" ");
			shops.add(new Tuple(i + 1, tokens[0], Integer.parseInt(tokens[1])));
		}
		Collections.sort(shops);
		for (int i = 0; i < N; ++i) {
			System.out.println(shops.get(i).id);
		}
		in.close();
	}

}
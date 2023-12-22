import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Illumination
 * --------------------
 * JOI 12th, Fin.1
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N = parseInt(br.readLine());

		List<Integer> list = new ArrayList<>();

		line = br.readLine();

		//sum up
		list.add(0);

		char prev = line.charAt(0);
		int sum = 1;
		int max = 1;

		for (int i = 2; i < line.length(); i += 2) {
			char next = line.charAt(i);
			if (prev != next) {
				sum++;
			} else {
				list.add(sum);
				sum = 1;
			}
			prev = next;
		}

		list.add(sum);
		list.add(0);

		//solve
		for (int i = 1; i < list.size() - 1; i++) {
			max = Math.max(max, list.get(i - 1) + list.get(i) + list.get(i + 1));
		}

		System.out.println(max);
	}
}
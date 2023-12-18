
import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Pair {
		int id, value;

		Pair(int id, int value) {
			this.id = id;
			this.value = value;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		List<Pair> A = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			A.add(new Pair(i, Integer.parseInt(tokens[i])));
		}
		Collections.sort(A, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				return Integer.compare(o1.value, o2.value);
			}
		});
		for (int i = 0; i < N; ++i) {
			System.out.print((A.get(i).id + 1) + " ");
		}
		System.out.println("");
	}
}

import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		List<Long> list = new ArrayList<>(N + 1);
		list.add(2L);
		list.add(1L);
		for (int i = 2; i <= N; ++i) {
			list.add(list.get(i - 1) + list.get(i - 2));
		}
		System.out.println(list.get(N));
	}
}

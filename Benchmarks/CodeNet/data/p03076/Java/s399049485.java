import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		List<Integer> times = new ArrayList<>();
		int modMax = -1;
		for (int i = 0; i < 5; ++i) {
			int time = Integer.parseInt(in.readLine());
			if (time % 10 == 0) {
				modMax = Math.max(modMax, 0);
			} else {
				modMax = Math.max(modMax, (10 - time % 10));
			}
			if (time % 10 == 0) {
				times.add(time);
			} else {
				time += 10 - time % 10;
				times.add(time);
			}
		}
		in.close();
		int sum = 0;
		for (int i = 0; i < 5; ++i) {
			sum += times.get(i);
		}
		System.out.println(sum - modMax);
	}

}

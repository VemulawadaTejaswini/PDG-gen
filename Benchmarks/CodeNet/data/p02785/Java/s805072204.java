import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try (Stream<String> lines = new BufferedReader(new InputStreamReader(System.in)).lines()) {
			new Main().exec(lines.toArray(String[]::new));
		}
	}

	void exec(String[] args) {
		String[] a = args[0].split(" ");
		int n = Integer.parseInt(a[0]);
		int k = Integer.parseInt(a[1]);
		int[] h = Stream.of(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(h);
		System.out.println(LongStream.range(0, n).map(v -> v < n - k ? h[(int)v] : 0).sum());
	}

}

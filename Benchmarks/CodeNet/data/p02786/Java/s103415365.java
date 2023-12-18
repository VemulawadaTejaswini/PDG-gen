import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try (Stream<String> lines = new BufferedReader(new InputStreamReader(System.in)).lines()) {
			new Main().exec(lines.toArray(String[]::new));
		}
	}

	void exec(String[] args) {
		long h = Long.parseLong(args[0]);
		System.out.println((long)Math.pow(2, IntStream.iterate(0, i -> i + 1).filter(i -> Math.pow(2, i) >= h + 1).findFirst().getAsInt()) - 1);
	}

}

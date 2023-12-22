import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			IntStream stream = br.lines()
					.mapToInt(Integer::parseInt);

			PrintWriter pw = new PrintWriter(System.out);
			stream.forEach(new IntConsumer() {
				private int i = 0;
				private boolean flg = false;

				@Override
				public void accept(int value) {
					if (value == 0 || flg) {
						flg = true;
						return;
					}
					pw.write("Case " + ++i + ":" + value);
					pw.write(System.lineSeparator());
				}
			});
			pw.flush();

		} catch (IOException e) {
		}

	}
}


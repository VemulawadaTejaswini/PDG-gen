import static org.hamcrest.CoreMatchers.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@Test
	public void 入力例_1() throws Exception {
		String input =
			"41 2" + System.lineSeparator() +
			"5 6";
		String output =
			"30";

		assertIO(input, output);
	}

	@Test
	public void 入力例_2() throws Exception {
		String input =
			"10 2" + System.lineSeparator() +
			"5 6";
		String output =
			"-1";

		assertIO(input, output);
	}

	@Test
	public void 入力例_3() throws Exception {
		String input =
			"11 2" + System.lineSeparator() +
			"5 6";
		String output =
			"0";

		assertIO(input, output);
	}

	@Test
	public void 入力例_4() throws Exception {
		String input =
			"314 15" + System.lineSeparator() +
			"9 26 5 35 8 9 79 3 23 8 46 2 6 43 3";
		String output =
			"9";

		assertIO(input, output);
	}

	private void assertIO(String input, String output) throws Exception {
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Main.main(new String[0]);

		Assert.assertThat(out.toString(), is(output + System.lineSeparator()));
	}
}

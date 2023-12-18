import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		int R, G;
		R = Integer.parseInt(in.readLine());
		G = Integer.parseInt(in.readLine());
		int result = G * 2 - R;
		System.out.println(result);
	}

	void calc() {
	}

	void showResult() {
	}
}

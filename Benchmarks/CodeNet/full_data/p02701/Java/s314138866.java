import java.util.*;
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
		int N = Integer.parseInt(in.readLine());
		Set<String> set = new HashSet<>();
		for(int i= 0; i < N; ++i) {
			set.add(in.readLine());
		}
		System.out.println(set.size());
	}

	void calc() {
	}

	void showResult() {
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(shorten(in.readLine()));

	}

	static String shorten(String src) {
		return src.replaceAll("([A-Z])[a-z]* ([A-Z])[a-z]{1,99} ([A-Z])[a-z]*", "$1$2$3");
	}
}

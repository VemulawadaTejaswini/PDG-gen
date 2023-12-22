import java.io.*;
import java.util.stream.Stream;

class A {

	public static void main(String[] args) throws Exception {
		Stream.of(new BufferedReader(new InputStreamReader(System.in)).lines()).forEach(line -> {
			String[] input = line.split(" ");
			System.out.println(((String) ((int) input[0] + (int) input[1])).length());
		});
	}

}
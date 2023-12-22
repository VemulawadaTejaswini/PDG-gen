package local.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String...args) throws IOException {

		try (InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(" ");
				if (values.length == 2) {
					int a = Integer.parseInt(values[0]);
					int b = Integer.parseInt(values[1]);
					System.out.println(a + b);
				}
			}
		}
		return;
	}
}


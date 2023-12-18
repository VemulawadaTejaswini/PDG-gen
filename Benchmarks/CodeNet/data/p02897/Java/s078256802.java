import java.io.BufferedReader;
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		try {
			double n = Double.parseDouble(br.readLine());
			if(n % 2 == 0) {
				System.out.println(String.format("%.7f", 1.0 / 2));
			} else {
				System.out.println(String.format("%.7f", ((n + 1) / 2) / n));
			}
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

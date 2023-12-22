import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while((line = br.readLine())  != null) {
			String[] arrays = line.split(" ");
			int a = Integer.parseInt(arrays[0]);
			int b = Integer.parseInt(arrays[1]);
			System.out.println(a+b);
		}
	}
}
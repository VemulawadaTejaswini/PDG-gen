import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String num = br.readLine();
		String[] set = num.split(" ");

		int a = Integer.parseInt(set[0]);
		int b = Integer.parseInt(set[1]);

		int c = a/b;
		int d = a%b;
		String f = String.format("%.5f", ((double)a/(double)b));

		System.out.println(sb.append(c).append(" ").append(d).append(" ").append(f));

	}

}
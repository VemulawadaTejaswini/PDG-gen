import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int H = Integer.parseInt(br.readLine());
		int W = Integer.parseInt(br.readLine());

		System.out.println( (N-H+1) * (N-W+1) );


	}
}
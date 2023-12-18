import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int X = Integer.parseInt(line[1]);

		X = X>N-X ? X : N-X;

		System.out.println(3*X+3);
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String line = br.readLine();
		String[] str1 = line.split(" ");
		int[] str2 = Stream.of(str1).mapToInt(Integer::parseInt).toArray();

		Arrays.sort(str2);

		long a = 0;
		for (int i = n; i < n + n; i++) {
			a += str2[i];
		}

		System.out.println(a);
	}
}

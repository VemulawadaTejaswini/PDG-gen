import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] array = br.readLine().split(" ");
			int N = Integer.parseInt(array[0]);
			int K = Integer.parseInt(array[1]);

			int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			int[] map = new int[N];

			for (int a : A) {
				map[a - 1]++;
			}

			Arrays.sort(map);

			int count = 0;
			for (int i = 0; i < map.length - K; i++) {
				count += map[i];
			}

			System.out.println(count);
		}
	}
}
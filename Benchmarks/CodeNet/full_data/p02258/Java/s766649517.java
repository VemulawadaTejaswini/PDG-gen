import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		List<Long> l = new ArrayList<Long>();
		for (int i = 0; i < N; i++)
			l.add(Long.parseLong(br.readLine()));

		long result = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (l.get(j) - l.get(i) > result)
					result = l.get(j) - l.get(i);
			}
		}
		System.out.println(result);

		if (br != null) {
			br.close();
			br = null;
		}
	}
}
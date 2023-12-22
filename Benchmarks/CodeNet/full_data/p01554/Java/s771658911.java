import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String id[] = new String[n];
		int ac = 0;

		for (int i = 0; i < n; i++) {
			id[i] = br.readLine();
		}
		int m = Integer.parseInt(br.readLine());

		for (int i = 0; i < m; i++) {
			boolean flag = true;
			String action = br.readLine();
			for (int j = 0; j < n; j++) {
				if (action.equals(id[j])) {
					flag = false;
					if (ac % 2 == 0)
						System.out.println("Opened by " + action);
					else
						System.out.println("Closed by " + action);
					ac++;
				}
			}
			if (flag) {
				System.out.println("Unknown " + action);
			}
		}
	}
}


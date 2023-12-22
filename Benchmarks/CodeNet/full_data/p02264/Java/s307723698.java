import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);

		int q = Integer.parseInt(str[1]);

		Deque<String> dq = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			String[] name_time = br.readLine().split(" ");

			dq.offerLast(name_time[0]);
			dq.offerLast(name_time[1]);

		}

		int[] total_time = new int[n];
		String[] name = new String[n];

		int a = 0;
		int p = 0;
		while (!(dq.isEmpty())) {

			String Now_name = dq.pollFirst();

			int now_time = Integer.parseInt(dq.pollFirst());
			/*
			 * System.out.println(Now_name+" "+now_time);
			 */
			if (now_time - q > 0) {
				dq.offerLast(Now_name);
				dq.offerLast(String.valueOf(now_time - q));

				a += q;
			} else {
				a += now_time;
				total_time[p] = a;
				name[p] = Now_name;

				p++;
			}

		}

		for (int i = 0; i < n; i++) {
			System.out.println(name[i] + " " + total_time[i]);
		}
	}
}
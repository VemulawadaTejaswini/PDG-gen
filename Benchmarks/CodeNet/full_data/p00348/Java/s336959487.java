import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int size = Integer.parseInt(br.readLine());
			String[] nums = br.readLine().split(" ");

			int[] data = new int[size];
			for (int i = 0; i < size; i++) {
				data[i] = Integer.parseInt(nums[i]);
			}

			final int end = data.length - 1;
			int count = 0;
			int pos = 0;

			for (;;) {
				if (pos != 0) {
					while (pos != 0 && data[pos - 1] > data[pos]) {
						pos--;

						int tmp = data[pos];
						System.arraycopy(data, pos + 1, data, pos, end - pos);
						data[end] = tmp;

						count++;
					}
				}

				if (pos == end) {
					break;
				}

				pos++;
			}

			System.out.println(count);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] array = br.readLine().split(" ");
			int N = Integer.parseInt(array[0]);
			int C = Integer.parseInt(array[1]);

			TVData[] dataArray = new TVData[N];
			for (int i = 0; i < N; i++) {
				dataArray[i] = new TVData(br.readLine());
			}
			final int[] table = new int[2 * 100_001];
			final boolean[] tmp = new boolean[2 * 100_001];
			boolean updated = false;
			for (int channel = 1; channel <= C; channel++) {
				if (updated) {
					for (int i = 0; i < tmp.length; i++) {
						tmp[i] = false;
					}
					updated = false;
				}

				for (TVData data : dataArray) {
					if (data.channel == channel) {
						for (int i = data.start * 2 - 1; i <= data.end * 2; i++) {
							tmp[i] = true;
						}
						updated = true;
					}
				}

				for (int i = 0; i < table.length; i++) {
					if (tmp[i]) {
						table[i]++;
					}
				}
			}

			System.out.println(Arrays.stream(table).max().getAsInt());
		}
	}

	public static class TVData {
		private final int channel;
		private final int start;
		private final int end;

		public TVData(String line) {
			int[] tmp = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
			start = tmp[0];
			end = tmp[1];
			channel = tmp[2];
		}
	}

}

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N, arr[] = new int[3];
		String str, tmp[];
		N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			str = in.readLine();
			tmp = str.split(" ", 0);
			for (int j = 0; j < 3; j++) {
				arr[j] = Integer.parseInt(tmp[j]);
				arr[j] *= arr[j];
			}
			Arrays.sort(arr);
			if (arr[2] == arr[0] + arr[1])
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}
}
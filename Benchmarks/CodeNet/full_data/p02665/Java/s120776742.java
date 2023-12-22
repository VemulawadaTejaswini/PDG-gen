import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		int n = Integer.parseInt(reader.readLine());
		long[] arr = new long[n + 1];
		input = reader.readLine().split(" ");
		for(int i = 0; i <= n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		if(n > 0 && arr[0] != 0) {
			System.out.println(-1);
			return;
		}
		long[][] up = new long[n + 1][2];
		up[0][0] = 1;
		for(int i = 1; i <= n; i++) {
			up[i][0] = ((up[i - 1][0]) * 2) - arr[i];
//			System.out.println(up[i][0] + " ");
		}
		up[n][1] = 0;
		for(int i = n - 1; i >= 0; i--) {
			up[i][1] = arr[i + 1] + up[i + 1][1];
		}
		long ans = 0;
		long[] temp = new long[n + 1];
		for(int i = 0; i <= n; i++) {
			ans += Math.min(up[i][0], up[i][1]) + arr[i];
			temp[i] = Math.min(up[i][0], up[i][1]);
			if(temp[i] < 0) {
				System.out.println(-1);
				return;
			}
		}
		out.print(ans);
		out.flush();
	}

}

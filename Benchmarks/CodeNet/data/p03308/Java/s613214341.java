
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int n 	     = Integer.parseInt(br.readLine());
		long max     = 0;
		long[] list  = new long[n];
		String[] tmp = br.readLine().split(" ");

		for(int i = 0; i < n; i++) {

			list[i] = Long.parseLong(tmp[i]);

		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {

				max = Math.max(Math.abs(list[i] - list[j]), max);
			}
		}
		System.out.println(max);
	}
}

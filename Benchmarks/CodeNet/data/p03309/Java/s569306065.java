import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int n 	     = Integer.parseInt(br.readLine());
		long mean    = 0;
		long[] list  = new long[n];
		String[] tmp = br.readLine().split(" ");

		for(int i = 0; i < n; i++) {

			list[i] = Long.parseLong(tmp[i]);
			mean += list[i];
		}

		mean = (long) Math.ceil(mean / (n * 1.0));
		int min = -1 * (int)mean;

		long res = Long.MAX_VALUE;
		for(int i = min; i < mean; i++) {

			long tem = 0;

			for(int j = 0; j < n; j++) {

				tem += Math.abs(list[j] - (i + j));
				System.out.println(tem + "-" + i);

			}
			res = Math.min(res, tem);
			System.out.println(res + "-" + i);

		}
		System.out.println(res);
	}
}

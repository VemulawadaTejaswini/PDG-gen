import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		int n = Integer.parseInt(reader.readLine());
		long sum = 0;
		input = reader.readLine().split(" ");
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		long[] arr = new long[100001];
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(input[i]);
			arr[a]++;
			sum += a;
		}
		int q = Integer.parseInt(reader.readLine());
		while(q-->0) {
			input = reader.readLine().split(" ");
			int b = Integer.parseInt(input[0]), c = Integer.parseInt(input[1]);
			long temp = arr[b];
			arr[b] = 0;
			sum -= temp * b;
			arr[c] += temp;
			sum += temp * (long)c;
			out.println(sum);
		}
		out.flush();
		out.close();
    }
}

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
		input = reader.readLine().split(" ");
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		long[] arr = new long[n];
		long total = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
			total ^= arr[i];
		}
		for(int i = 0; i < n; i++) {
			out.print((total ^ arr[i]) + " ");
		}
		out.flush();
		out.close();
    }
}

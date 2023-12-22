import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Long> list = new ArrayList<Long>();
		long res = 0;
		long sum = 0;
		int n = Integer.parseInt(bi.readLine());
		String st = bi.readLine();
		long MOD = 1000000007;
		
		StringTokenizer str = new StringTokenizer(st, " ");
		
		for(int i = 0; i < n; i++) {
			
			long in = Long.parseLong(str.nextToken());
			res = (res + (sum * in) % MOD) % MOD;
			sum += in;
			
		}
		
		System.out.println(res);		
		
	}

}
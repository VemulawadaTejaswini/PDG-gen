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
		long rem = 0;
		int n = Integer.parseInt(bi.readLine());
		String st = bi.readLine();
		long MOD = 1000000007;
		
		StringTokenizer str = new StringTokenizer(st, " ");
		
		for(int i = 0; i < n; i++) {
			
			long in = Long.parseLong(str.nextToken());	
			sum = (sum + in) % MOD;
			if(in != 0)
			list.add(in);
			
		}
		
		rem = list.remove(0);
		
		while(list.size() > 0) {
			
			sum -= rem;
			if(sum < 0) sum += MOD;
			sum = sum % MOD;
			res = (res + (sum * rem) % MOD) % MOD;
			rem = list.remove(0);
			
		}
		
		System.out.println(res);		
		
	}

}
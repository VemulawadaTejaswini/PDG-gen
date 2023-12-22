import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while (true) {
			
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			
			int div = 5;
			int sum = 0;
			
			while (div <= n) {
				
				sum += n / div;
				div *= 5;
				
			}
			ans.add(sum);
		}
		
		for (int a : ans) {
			System.out.println(a);
		}

	}

}
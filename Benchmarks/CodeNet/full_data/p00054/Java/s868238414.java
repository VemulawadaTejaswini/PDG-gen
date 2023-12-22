import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			
			st = new StringTokenizer(s," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int ret = 0;
			
			String str = String.valueOf((double)a / b).substring(2);
			
			int lim = Math.min(str.length(), n);
			
			for (int i = 0; i < lim; i++) {
				
				ret += str.charAt(i) - '0';
				
			}
			
			System.out.println(ret);
			
		}

	}

}
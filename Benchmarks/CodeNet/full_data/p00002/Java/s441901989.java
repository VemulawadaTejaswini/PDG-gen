package GlobalSign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int sum=0;
		int cnt=0;
		while((str=br.readLine()) != null) {
			if(!str.isEmpty()) {
				StringTokenizer tkn = new StringTokenizer(str, " ");
				while(tkn.hasMoreTokens()) {
					int no = Integer.parseInt(tkn.nextToken());
					sum += no;
				}
				String str1 = String.valueOf(sum);
				System.out.println(str1.length());
			}
		}
	}
}
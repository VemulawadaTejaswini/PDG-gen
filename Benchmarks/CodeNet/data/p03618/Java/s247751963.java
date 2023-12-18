import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			
			char d[] = line.toCharArray();
			long []chars = new long[26];
 			int count = 0;
			int sum = 0;
			int len = line.length();
			for(char c : d) {
			         chars[c-'a']++;
			}
			sum = len*(len-1)/2;
			for(long x :chars)
			{
				if(x > 1) {
					sum -= x*(x-1)/2;
				}
			}
			System.out.println(sum+1);
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
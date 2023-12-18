import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		long n = 0;
		long[] as = null;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			n = Long.parseLong(br.readLine());
			
			as = new long[(int)n];
			int i = 0;
			for (String str : br.readLine().split(" ")) {
				as[i++] = Long.parseLong(str);
			}
		} catch (IOException e) {
			return;
		}
		
		int cnt = 0;
		for (int i = 1; i < n; i++) {
			if (as[i] == as[i - 1]) {
				cnt++;
				i++;
			}
		}
		
		System.out.println(cnt);
	}
}

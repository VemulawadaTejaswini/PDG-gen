import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n = 0;
		String str = null;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			n = Integer.parseInt(br.readLine());
			str = br.readLine();
		} catch (IOException e) {
			return;
		}
		
		char[] cs = new char[n];
		for (int i = 0; i < n; i++) {
			cs[i] = str.charAt(i);
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			int tmp = 0;
			
			for (int j = 0; j < i; j++) {
				if (cs[j] == 'W') {
					tmp++;
				}
			}
			for (int j = i + 1; j < n; j++) {
				if (cs[j] == 'E') {
					tmp++;
				}
			}
			
			if (tmp < min) {
				min = tmp;
			}
		}
		
		System.out.println(min);
	}
}

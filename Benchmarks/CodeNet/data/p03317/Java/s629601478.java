import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n = 0;
		int k = 0;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] strs = br.readLine().split(" ");
			n = Integer.parseInt(strs[0]);
			k = Integer.parseInt(strs[1]);
			
			String str = br.readLine();
		} catch (IOException e) {
			return;
		}
		int cnt = 0;
		if (n == k) {
			cnt++;
		} else {
			while (n >= 1) {
				n -= (k - 1);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}

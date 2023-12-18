import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		int q = 0;
		int[] ls = null;
		int[] rs = null;
		int[] ps = null;
		int[] qs = null;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] strs = br.readLine().split(" ");
			
			n = Integer.parseInt(strs[0]);
			m = Integer.parseInt(strs[1]);
			q = Integer.parseInt(strs[2]);
			
			ls = new int[m];
			rs = new int[m];
			for (int i = 0; i < m; i++) {
				strs = br.readLine().split(" ");
				ls[i] = Integer.parseInt(strs[0]);
				rs[i] = Integer.parseInt(strs[1]);
			}
			
			ps = new int[q];
			qs = new int[q];
			for (int i = 0; i < q; i++) {
				strs = br.readLine().split(" ");
				ps[i] = Integer.parseInt(strs[0]);
				qs[i] = Integer.parseInt(strs[1]);
			}
		} catch (IOException e) {
		}
		
		for (int i = 0; i < q; i++) {
			int count = 0;
			
			for (int j = 0; j < m; j++) {
				if (ps[i] <= ls[j] && qs[i] >= rs[j]) {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
}

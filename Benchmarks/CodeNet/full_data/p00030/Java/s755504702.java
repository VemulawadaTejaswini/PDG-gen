import java.io.*;
import java.util.*;

public class Main {
	
	public static int n = 0, s = 0, ans = 0;
	
	@SuppressWarnings("unchecked")
	public static void solve (boolean[] check, ArrayList<Integer> list, int cnt) {
		
		ArrayList<Integer> temp = (ArrayList<Integer>) list.clone();
		
		if (cnt == n) {
			int sum = 0;
			for (int i = 0; i < list.size(); i++) {
				sum += list.get(i);
			}
			if (sum == s) ans++;
			return;
		}
		
		main:
		for (int i = 0; i < check.length; i++) {
			
			if (check[i]) continue;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) >= i) continue main;
			}
			
			temp.add(i);
			check[i] = true;
			solve(check,temp,cnt + 1);
			check[i] = false;
			temp.remove(temp.size() - 1);
			
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String ss = br.readLine();
			StringTokenizer st = new StringTokenizer(ss, " ");
			n = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			if (n == 0 && s == 0) break;
			solve(new boolean[10], new ArrayList<Integer>(), 0);
			
			System.out.println(ans);
			ans = 0;
		}
		
	}
	
}
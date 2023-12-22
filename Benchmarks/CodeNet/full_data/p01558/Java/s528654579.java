import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	//2330 start
	//2344 TLE
	
	private void doit(){
		InStream sc = new InStream();
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			String s = sc.next();
			
			int right = 0, left = 0;
			HashMap<Integer, HashSet<String>> map = new HashMap<Integer, HashSet<String>>();
			boolean [][] isvisited = new boolean[n][n];
			int count = 0;
			while(m-- > 0){
				String str = sc.next();
				if(str.charAt(0) == 'R'){
					if(str.charAt(1) == '+')right++;
					else right--;
				}
				else{
					if(str.charAt(1) == '+')left++;
					else left--;
				}
				if(isvisited[left][right]) continue;
				String now = s.substring(left, right + 1);
				int diff = right - left;
				if(map.containsKey(diff)){
					if(! map.get(diff).contains(now)){
						count++;
						map.get(diff).add(now);
					}
				}
				else{
					count++;
					HashSet<String> hs = new HashSet<String>();
					hs.add(now);
					map.put(diff, hs);
				}
				//System.out.println(now);
				
			}
			System.out.println(count);
		}
	}
	
	class InStream{
		BufferedReader in;StringTokenizer st;
		public InStream() {
			this.in = new BufferedReader(new InputStreamReader(System.in));
			this.st = null;
		}
		String next() {
			while (st==null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.readLine());
				} catch (Exception e) {}
			}
			return st.nextToken(); 
		}
		boolean hasNext(){
			try {
				st = new StringTokenizer(in.readLine());
				return true;
			} catch (Exception e) {return false;}
		}
		int nextInt() {	return Integer.parseInt(next()); }
		long nextLong() {return Long.parseLong(next());	}
		double nextDouble() {return Double.parseDouble(next());	}
	}
	
	public static void main(String [] args){
		new Main().doit();
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	//2330 start
	//2344 TLE
	//0004 MLE

	private void doit(){
		InStream sc = new InStream();
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			char [] s = sc.next().toCharArray();
			int right = 0, left = 0;
			HashSet<String> set = new HashSet<String>();
			StringBuilder sb = new StringBuilder();
			sb.append(s[0]);
			int len = 1;
			while(m-- > 0){
				String str = sc.next();
				if(str.charAt(0) == 'R'){
					if(str.charAt(1) == '+'){
						right++;
						sb.append(s[right]);
						len++;
					}
					else{
						right--;
						len--;
						sb.deleteCharAt(len);
					}
				}
				else{
					if(str.charAt(1) == '+'){
						sb.deleteCharAt(0);
						left++;
						len--;
					}
					else{
						left--;
						len++;
						sb.insert(0, s[left]);
					}
				}
				set.add(sb.toString());
			}
			System.out.println(set.size());
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
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() {return Long.parseLong(next()); }
		double nextDouble() {return Double.parseDouble(next()); }
	}

	public static void main(String [] args){
		new Main().doit();
	}
}
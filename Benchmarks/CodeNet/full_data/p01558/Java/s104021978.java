import java.awt.geom.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	//1040 start
	
	//SHAKYO
	private void doit(){
		InStream sc = new InStream();
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			char [] s = sc.next().toCharArray();
			
			long B = 1000000007L;
			long [] bb = new long[n];
			bb[0] = 1L;
			for(int i = 0 ; i < n-1; i++){
				bb[i+1] = bb[i] * B;
			}
			long B1 = 1L;
			long tmp = B;
			for(int i =0; i < 63; i++){
				B1 *= tmp;
				tmp *= tmp;
			}
			int right = 0, left = 0;
			long now = s[0];
			HashSet<Long> set = new HashSet<Long>();
			for(int i = 0; i < m; i++){
				String op = sc.next();
				if(op.charAt(0) == 'R'){
					if(op.charAt(1) == '+'){
						right++;
						long temp = now * B;
						now = temp + s[right];
					}
					else{
						now = now - s[right];
						now = now * B1;
						right--;
					}
				}
				else{
					if(op.charAt(1) == '+'){
						long temp = (long)s[left] * bb[right - left];
						now = now - temp;
						left++;
					}
					else{
						left--;
						long temp = (long)s[left] * bb[right - left];
						now = now + temp;
					}
				}
				set.add(now);
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
		int nextInt() {	return Integer.parseInt(next()); }
		long nextLong() {return Long.parseLong(next());	}
		double nextDouble() {return Double.parseDouble(next());	}
	}
	
	public static void main(String [] args){
		new Main().doit();
	}
}
import java.lang.*; 
import java.io.*; 
import java.util.*; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class atcoder_158_D {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br =  new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while(st==null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
					
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
	static String add_string(String s1,String s2) {
		return s1+s2;
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		String s = ob.next();
		boolean r =false;
		int q = ob.nextInt();
		for(int i=0;i<q;i++) {
			int t = ob.nextInt();
			if(t==1) {
				r=!r;
			}
			else {
				int f =ob.nextInt();
				String s1=ob.next();
				if(r) {
					if(f==2) {
						s=s1+s;
					}
					else {
						s=s+s1;
					}
				}
				else {
					if(f==2) {
						s=s+s1;
					}
					else {
						s=s1+s;
					}
					
				}
			}
		}
		char arr[] = s.toCharArray();
		if(r) {
			for (int i = arr.length-1; i >-1; i--) {
				System.out.print(arr[i]);
			}
		}
		else {
			System.out.println(s);
		}
	}

}

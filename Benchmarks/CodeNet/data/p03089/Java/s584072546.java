import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
	

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
    public static long mod = (long) (1e9+7);
    public final static int MAX = (int) 90000000;
  // static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	   
	 FastReader sc = new FastReader();
	
	 int n = sc.nextInt();
	 List<Integer> list = new ArrayList<>();
	 List<Integer> ans = new ArrayList<>();
	 list.add(0);
	 for(int i=0;i<n;++i) list.add(sc.nextInt());
	 boolean run = true;
	 while(list.size()>1 && run) {
		 run = false;
		 for(int i=list.size()-1;i>0;--i) {
			 if(list.get(i) == i) {
				 run = true;
				 list.remove(i);
				 ans.add(i);
				 break;
			 }
		 }
	 }
//	 out.print(list);
//	 out.print(ans);
	 if(list.size() == 1) {
	 Collections.reverse(ans);
	 for(int x : ans) out.println(x);
	 }else out.print(-1);
	 out.close();
		
	}

}
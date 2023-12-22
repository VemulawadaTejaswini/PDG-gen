import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static class pair implements Comparable<pair> {
		int id;
		int ans;

		pair(int x, int y) {

			id = x;
			ans = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.id - o.id;
		}
	}

//	static int mod = (int) 998244353.;
	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static long ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	// static long dp[];

	public static void main(String[] args) throws IOException {
		int t =1;// sc.nextInt();

		while (t-- > 0) {

			String s=sc.next();
			String t1=sc.next();
			if(s.length()==0 || s.length()>10) {
				out.append("No");
				continue;
			}
			boolean f=true;
			if(t1.length()-1!=s.length()) {
				out.append("No");continue;
			}
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)!=t1.charAt(i)) {
					f=false;
					break;
				}
			}
			if(!f) {
				out.append("No");
				
			}
			else out.append("Yes");
			
			
		}

		System.out.println(out);
	}
}

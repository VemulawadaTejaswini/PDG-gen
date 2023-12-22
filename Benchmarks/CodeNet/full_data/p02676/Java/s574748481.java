	import java.io.DataInputStream;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.PriorityQueue;
	import java.util.*;
	
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
	
				return this.ans - o.ans;
			}
		}
	
	//	static int mod = (int) 998244353.;
		static int mod=(int)1e9+7;
		static ArrayList<Integer> gr[];
		static int  ar[];
		static Scanner sc = new Scanner(System.in);
		static int pri[] = new int[(int) 1e6 + 5];
		static StringBuilder out = new StringBuilder();
	
		static int[] dp;
	
		public static void main(String[] args) throws IOException {
			int t =1;// sc.nextInt();
			
			while (t-- > 0) {
				int k=sc.nextInt();
				String s=sc.next();
				if(s.length()>k) {
					out.append(s.substring(0,k)+"...");
				}
				else out.append(s);
				
			}
			
			System.out.println(out);
		}

    }
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
	
				return this.id - o.id;
			}
		}
	
	//	static int mod = (int) 998244353.;
		static ArrayList<Integer> gr[];
		static long ar[];
		static Scanner sc = new Scanner(System.in);
		static int pri[] = new int[(int) 1e6 + 5];
		static StringBuilder out = new StringBuilder();
	
		//static long dp[];
	
		public static void main(String[] args) throws IOException {
			int t =1;// sc.nextInt();
			
			while (t-- > 0) {
	
				long x=sc.nextLong();
				HashMap<Long,Integer>hm=new HashMap<>();
				for(int i=-1000;i<=1000;i++) {
					
					hm.put((long)Math.pow(i, 5L), i);
					
				}
				long a=-1,b=-1;
				for(int i=-1000;i<1000;i++) {
					long val=(long)Math.pow(i, 5L)-x;
					if(hm.containsKey(val)) {
						a=i;
						b=hm.get(val);
						break;
					}
				}
			System.out.println(a+" "+b);
			}
	
		}

	
    }
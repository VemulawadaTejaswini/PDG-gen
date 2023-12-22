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
	
				int n=sc.nextInt();
				long a=sc.nextLong();
				long b=sc.nextLong();
				long c=sc.nextLong();
				String s1="AB";
				String s2="AC";
				String s3="BC";
				char ans[]=new char[n];
				boolean f=true;
				for(int i=0;i<n;i++) {
					String in=sc.next();
					if(in.equals(s1)) {
						if(a>=b) {
							a--;
							b++;
							ans[i]='B';
							if(a<0) {f=false;
							break;
									
							}
						}
						else {
							b--;
							a++;
							ans[i]='A';
							if(b<0) {f=false;
							break;
									
							}
						}
						
					}
					else if(in.equals(s2)) {
						
						if(a>=c) {
							a--;
							c++;
							ans[i]='C';
							if(a<0) {f=false;
							break;
									
							}
						}
						else {
							c--;
							a++;
							ans[i]='A';
							if(c<0) {f=false;
							break;
									
							}
						}
						
						
					}else {
						
						
						if(c>=b) {
							c--;
							b++;
							ans[i]='B';
							if(c<0) {f=false;
							break;
									
							}
						}
						else {
							b--;
							c++;
							ans[i]='C';
							if(b<0) {f=false;
							break;
									
							}
						}
						
					}
				}
				
				
				if(f) {
					System.out.println("Yes");
					for(int i=0;i<n;i++) {
						System.out.println(ans[i]);
					}
				}
				else {
					System.out.println("No");
				}
				
			}
			
	
		}
    }
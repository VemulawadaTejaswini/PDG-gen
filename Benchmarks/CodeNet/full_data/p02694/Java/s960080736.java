import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class D {

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
	static int[] ar;
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();
 
	//static long dp[];
 
	public static void main(String[] args) throws IOException {
		int t =1;//sc.nextInt();
		
		while (t-- > 0) {
 
			long ru=sc.nextLong();
			long val=100;
			long n=0;
			
			System.out.println(bs(ru));
			
		}
		
		System.out.println(out);
	}
	static long bs (long r) {
		long lo=0;
		long  hi=6000;
		long n=0;
		while(lo<=hi) {
			long mid=(hi+lo)/2;
			long val=(long) ((long)100*(double)Math.pow(101/100, n));
			if(val>=r) {
				n=mid;hi=mid-1;
			}
			else lo=mid+1L;
		}
		return n;
	}
 
	
}
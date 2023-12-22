
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



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
	static int[] ar;
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();
 
	//static long dp[];
 
	public static void main(String[] args) throws IOException {
		int t =1;//sc.nextInt();
		
		while (t-- > 0) {
 
			int n=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a%n==0 || b%n==0) {
				out.append("OK\n");
				continue;
			}
			if(a/n!=b/n ) {
				out.append("OK\n");
				continue;
			}
			out.append("NG\n");
			

		
		}
		
		System.out.println(out);
	}
 
	
}
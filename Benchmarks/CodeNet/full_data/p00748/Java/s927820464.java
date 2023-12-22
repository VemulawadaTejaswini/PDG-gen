import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

public class Main{
	public static int n;
	public static final int max = 1000000;
	public static ArrayList<Integer> all;
	public static ArrayList<Integer> odd;
	public static void main(String[] args){
		all = new ArrayList<Integer>();
		odd = new ArrayList<Integer>();
		for(int i=1; i<=1000; i++){
			long num = (long)i*(i+1)*(i+2)/6;
			if(num > max) break;
			all.add((int)num);
			if(num % 2 == 1){
				odd.add((int)num);
			}
		}
		Scanner in = new Scanner(System.in);
		while(true){
			n = in.nextInt();
			if(n == 0) return;
			resall = max;
			resodd = max;
			dfsall(all.size()-1, 0, 0);
			dfsodd(odd.size()-1, 0, 0);
			System.out.println(resall+" "+resodd);
		}
	}
	
	public static int resodd;
	public static void dfsodd(int start, int sum, int depth){
		if(sum == n){
			resodd = Math.min(resodd, depth);
			return;
		}
		if(sum > n || depth >= resodd) return;
		for(int i=start; i>=0; i--){
			dfsodd(i, sum+odd.get(i), depth+1);
		}
	}
	
	public static int resall;
	public static void dfsall(int start, int sum, int depth){
		if(sum == n){
			resall = Math.min(resall, depth);
			return;
		}
		if(depth >= 5 || sum > n) return;
		for(int i=start; i>=0 && sum+all.get(i)*(5-depth)>=n; i--){
			dfsall(i, sum+all.get(i), depth+1);
		}
	}
}
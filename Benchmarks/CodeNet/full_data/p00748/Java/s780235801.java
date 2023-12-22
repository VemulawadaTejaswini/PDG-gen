import java.util.BitSet;
import java.util.Scanner;

public class Main{
	public static int n;
	public static final int max = 1000000;
	public static BitSet bsall;
	public static BitSet bsodd;
	public static void main(String[] args){
		bsall = new BitSet(max);
		bsodd = new BitSet(max);
		for(int i=1; i<=1000; i++){
			long num = (long)i*(i+1)*(i+2)/6;
			if(num > max) break;
			bsall.set((int)num);
			if(num % 2 == 1){
				bsodd.set((int)num);
			}
		}
		Scanner in = new Scanner(System.in);
		while(true){
			n = in.nextInt();
			if(n == 0) return;
			resall = max;
			resodd = max;
			dfsall(max, 0, 0);
			dfsodd(max, 0, 0);
			System.out.println(resall+" "+resodd);
		}
	}
	
	public static int resodd;
	public static void dfsodd(int start, int sum, int depth){
		if(sum == n){
			resodd = Math.min(resodd, depth);
			return;
		}
		if(sum > n) return;
		for(int i=bsodd.previousSetBit(start); i!=-1; i=bsodd.previousSetBit(i-1)){
			dfsodd(i, sum+i, depth+1);
		}
	}
	
	public static int resall;
	public static void dfsall(int start, int sum, int depth){
		if(sum == n){
			resall = Math.min(resall, depth);
			return;
		}
		if(depth >= 5 || sum > n) return;
		for(int i=bsall.previousSetBit(start)
				; i!=-1 && i*(5-depth)+sum>=n
				; i=bsall.previousSetBit(i-1)){
			dfsall(i, sum+i, depth+1);
		}
	}
}
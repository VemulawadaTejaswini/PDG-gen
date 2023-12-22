
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] w = new int[n];
		for(int i=0;i<n;i++){
			w[i] = sc.nextInt();
		}
		Arrays.sort(w);
		PriorityQueue qu = new PriorityQueue();
		for(int i=0;i<k;i++){
			qu.add(0);
		}
		for(int i=n-1;i>=0;i--){
			int x = (int)qu.poll();
			qu.add(x+w[i]);
		}
		int max = 0;
		for(int i=0;i<k;i++){
			int x = (int)qu.poll();
			max = (int)Math.max(max, x);
		}
		System.out.println(max);
	}
}



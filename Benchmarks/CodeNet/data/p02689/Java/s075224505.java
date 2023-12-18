import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i]=sc.nextInt();
		}
		boolean[] good = new boolean[n];
		for(int i = 0; i < n; i++) {
			good[i]=true;
		}
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(h[a-1] < h[b-1]) {
				good[a-1]=false;
			}
			else if(h[a-1] > h[b-1]) {
				good[b-1] = false;
			}
			else {
				good[a-1]=false;
				good[b-1] = false;
			}
		}
		int count = 0;
		for(int i = 0; i < n; i++) {
			//System.out.println(good[i]);
			if(good[i]==true) {
				count++;
			}
		}
		System.out.println(count);
	 }
}
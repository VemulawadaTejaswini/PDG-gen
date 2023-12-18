
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int n;
	static int [][]d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int R = Integer.parseInt(sc.next());
		
		List <Integer> r = new ArrayList <Integer>();
		
		for(int i = 0 ; i < R ;i++) {
			int a = Integer.parseInt(sc.next())-1;
			r.add(a);
		}
		
		d = new int [n][n];
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < n ;j++) {
				d[i][j] = 1000000000;
			}
		}
		for(int i = 0 ; i < m ;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			int cost = Integer.parseInt(sc.next());
			d[a-1][b-1] = cost;
			d[b-1][a-1] = cost;
		}
		
		Floyd_Warshall();
		int ans = 0;
		int st = r.get(0);
		int next = -1;
		r.remove(0);
		
		while(r.size() > 0) {
			int temp = 1000000000;
			for(int i = 0 ; i < r.size() ;i++) {
				if(temp > d[st][r.get(i)]) {
					next = i;
					temp = d[st][r.get(i)];
				}
			}
			ans += temp;
			st = r.get(next);
			r.remove(next);
			next = -1;
		}
		
		System.out.println(ans);
	}
		static void  Floyd_Warshall() {
			
			for(int i = 0 ; i < n ;i++) {
				for(int j = 0 ; j < n ; j++) {
					for(int k = 0 ; k < n ;k++) {
						d[j][k] = Math.min(d[j][k], d[j][i] + d[i][k]);
					}
				}
			}
		}
	}
class Node{
	private int to;
	private int cost;
	
	public Node (int to , int cost) {
		this.to = to;
		this.cost = cost;
	}
	
	public int To() {
		return to;
	}
	public int cost() {
		return cost;
	}
}

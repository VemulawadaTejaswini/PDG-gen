
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		Point []R = new Point [n];
		Point []B = new Point [n];
		for(int i = 0 ; i < n ;i++) {
			int x = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());
			R[i] = new Point(x,y);
		}
		Arrays.sort(R);
		
		for(int i = 0 ; i < n ;i++) {
			int x = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());
			B[i] = new Point(x,y);
		}
		Arrays.sort(B);
		boolean []cheak = new boolean [n];
		int ans = 0;
		
		for(int i = 0 ; i < n ;i++) { //青
			for(int j = 0 ; j < n ; j++) {//赤
				if(cheak[j]) {
					continue;
				}
				if(R[j].getX() < B[i].getX() && R[j].getY() < B[i].getY()) {
					ans++;
					cheak[j] = true;
					break;
				}
			}
		}
		
		System.out.println(ans);
	
	}

}

class Point implements Comparable <Point> {
	private int x;
	private int y;
	
	public Point (int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	@Override
	public int compareTo(Point o) {
		if(Integer.compare(o.getX(),x) != 0) {
		return Integer.compare(o.getX(), x);
		}
		return Integer.compare(o.getY(), y);
	}
	

}
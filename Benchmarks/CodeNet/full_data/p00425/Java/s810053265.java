
import java.util.*;
class Dice {
	private int c , n , w , e , s , r;
	public Dice(int c, int n, int e, int s, int w, int r) {
		this.c = c;
		this.n = n;
		this.e = e;
		this.w = w;
		this.s = s;
		this.r = r;
	}
	/* ã c@º r
	 * ¶ w@E e
	 *  n@O s */
	public int North() {
		int tmp = this.c;
		this.c = this.s;
		this.s = this.r;
		this.r = this.n;
		this.n = tmp;
		return this.c;
	}
	public int East() {
		int tmp = this.c;
		this.c = this.w;
		this.w = this.r;
		this.r = this.e;
		this.e = tmp;
		return this.c;
	}
	public int South() {
		int tmp = this.c;
		this.c = this.n;
		this.n = this.r;
		this.r = this.s;
		this.s = tmp;
		return this.c;
	}
	public int West() {
		int tmp = this.c;
		this.c = this.e;
		this.e = this.r;
		this.r = this.w;
		this.w = tmp;
		return this.c;
	}
	public int Right() {
		int tmp = this.n;
		this.n = this.w;
		this.w = this.s;
		this.s = this.e;
		this.e = tmp;
		return this.c;
	}
	public int Left() {
		int tmp = this.n;
		this.n = this.e;
		this.e = this.s;
		this.s = this.w;
		this.w = tmp;
		return this.c;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ( !sc.hasNext("0") ) {
			Dice d = new Dice(1,5,3,2,4,6);
			int c = sc.nextInt() , sum = 1;
			for ( int i = 0; i < c; i++ ) {
				String order = sc.next();
				sum += order.equals("South") ? d.South()
						: order.equals("North") ? d.North()
						: order.equals("West") ? d.West()
						: order.equals("East") ? d.East()
						: order.equals("Left") ? d.Left()
						: order.equals("Right") ? d.Right() : 0;
			}
			System.out.println(sum);
		}
	}
}
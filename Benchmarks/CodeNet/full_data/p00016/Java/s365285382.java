import java.util.*;
public class Main {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		String s;
		double x = 0, y = 0;
		double rad = 90 * Math.PI / 180;
		while(true) {
			s = sc.next();
			if(s.equals("0,0")) break;
			String[] st	= s.split(",");
			int len = Integer.parseInt(st[0]);
			int deg = Integer.parseInt(st[1]);
			x += len * Math.cos(rad);
			y += len * Math.sin(rad);
			rad -= deg * Math.PI / 180;
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}
}
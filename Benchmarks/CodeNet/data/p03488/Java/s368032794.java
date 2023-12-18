import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int goal_x = Integer.parseInt(sc.next());
		int goal_y = Integer.parseInt(sc.next());
		
		int x = 0;
		int y = 0;
		int dx = 1;
		int dy = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.substring(i, i + 1).equals("F")) {
				x += dx;
				y += dy;
			} else {
				if(dx != 0) {
					if(y <= goal_y) {
						dy = 1;
					} else {
						dy = -1;
					}
					dx = 0;
				} else {
					if(x <= goal_x) {
						dx = 1;
					} else {
						dx = -1;
					}
					dy = 0;
				}
			}
		}
		if(x == goal_x && y == goal_y) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

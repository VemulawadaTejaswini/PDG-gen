import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		Dolphin dl = new Dolphin(sx, sy);
		while(dl.y != ty) dl.up();
		while(dl.x != tx) dl.right();
		//System.out.println(dl.x+ " " + dl.y);
		while(dl.y != sy) dl.down();
		while(dl.x != sx) dl.left();
		//System.out.println(dl.x+ " " + dl.y);
		dl.left();
		while(dl.y != ty + 1) dl.up();
		while(dl.x != tx) dl.right();
		dl.down();
		//System.out.println(dl.x+ " " + dl.y);
		dl.right();
		while(dl.y != sy - 1) dl.down();
		while(dl.x != sx) dl.left();
		dl.up();
		//System.out.println(dl.x+ " " + dl.y);	
	}
	static class Dolphin{
		int x, y;
		public Dolphin(int x, int y){
			this.x = x;
			this.y = y;
		}
		void up() {
			y++;
			System.out.print("U");
		}
		void down() {
			y--;
			System.out.print("D");
		}
		void left() {
			x--;
			System.out.print("L");
		}
		void right() {
			x++;
			System.out.print("R");
		}
	}
}
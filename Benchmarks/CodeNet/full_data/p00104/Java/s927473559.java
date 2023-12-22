import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int H,W;
	private char[][] tiles;

	private boolean[][] history;

	private void mainrun() {
		scan = new Scanner(System.in);

		while(true) {
			H = scan.nextInt();
			W = scan.nextInt();

			if(H == 0 || W == 0) {
				break;
			}

			tiles = new char[H][W];
			history = new boolean[H][W];

			for(int i = 0;i < H;i++) {
				tiles[i] = scan.next().toCharArray();
				Arrays.fill(history[i], false);
			}

			tileMove();
		}
		scan.close();
	}

	private Point p = new Point(0 , 0);

	private void tileMove() {
		p.x = p.y = 0;

		while(true) {
			if(history[p.y][p.x]) {
				System.out.println("LOOP");
				break;
			}else {
				history[p.y][p.x] = true;

				switch(tiles[p.y][p.x]) {
				case '>'	: p.x++ ; break;
				case '<'	: p.x-- ; break;
				case 'v'	: p.y++ ; break;
				case '^'	: p.y-- ; break;
				case '.'	:
					System.out.println(p.x + " " + p.y);
					return;
				}
			}
		}
	}
}

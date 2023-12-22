import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int space = sc.nextInt();
		char[][] map = new char[H][W];
		for (int i=0; i<H; i++) {
			map[i] = sc.next().toCharArray();
		}

		int total = 0;
		
		for (int i=0; i<H; i++) {
			for (int j=0; j<W; j++) {
				if (map[i][j]=='.') {
					boolean Ver = true;
					for (int k=1; k<space; k++) {
						if (i+k >= H) {Ver = false; break;}
						if (map[i+k][j]=='#') {Ver = false;}
					}
					if (Ver) {total++;}

					boolean Hor = true;
					for (int k=1; k<space; k++) {
						if (j+k >= W) {Hor = false; break;}
						if (map[i][j+k]=='#') {Hor = false;} 
					}
					if (Hor) {total++;}
				}
			}
		}
		
		out.println(total);
	}
}

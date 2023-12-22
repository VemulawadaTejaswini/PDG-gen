import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//
		byte states[] = new byte[10];
		int w, h;
		int x, y, xp, yp;
		byte map[][];
		int count;
		//
		for(;;){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0){
				break;
			}
			map = new byte[h][w];
			count = 0;
			for(y = 0; y < h; y++){
				for(x = 0; x < w; x++){
					map[y][x] = sc.nextByte();
				}
			}
			for(y = 0; y < h; y++){
				for(x = 0; x < w; x++){
					count += Main.checkAround(map, x, y, w, h);
				}
			}
			System.out.println(count);
		}
	}
	public static int checkAround(byte map[][], int px, int py, int w, int h){
		if(px < 0 || w <= px || py < 0 || h <= py || map[py][px] == 0){
			return 0;
		}
		map[py][px] = 0;
		Main.checkAround(map, px - 1, py - 1, w, h);
		Main.checkAround(map, px + 1, py + 1, w, h);
		Main.checkAround(map, px - 1, py + 1, w, h);
		Main.checkAround(map, px + 1, py - 1, w, h);
		//
		Main.checkAround(map, px    , py - 1, w, h);
		Main.checkAround(map, px    , py + 1, w, h);
		Main.checkAround(map, px - 1, py    , w, h);
		Main.checkAround(map, px + 1, py    , w, h);
		return 1;
	}
}
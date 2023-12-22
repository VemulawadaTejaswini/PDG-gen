import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, w;
		
		h = sc.nextInt();
		w = sc.nextInt();
		int[][] tiles = new int[h][w], map = new int[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				tiles[i][j] = sc.nextInt();/* ???????????? */
				map[i][j] = -1;/* ?????£????????\??????????????? */
			}
		}
		sc.nextLine();

		int maxS = 0;
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w;  j++){
				int ret = search(tiles, i, j, 0, map);
				ret *= ret;
				if(ret > maxS){
					maxS = ret;
				}
			}
		}
		System.out.println(maxS);		
	}
	
	public static int search(int[][] tiles, int a, int b, int flag, int[][] map){
		if(tiles[a][b] == 1){
			return -1;
		}else if(map[a][b] != -1){
			return map[a][b];
		}else{
			int ret1, ret2;
			if(a + 1 < tiles.length){
				ret1 = search(tiles, a+1, b, 0, map);
			}else{
				return 0;
			}
			if(b + 1 < tiles[0].length){
				ret2 = search(tiles, a, b+1, 1, map);
			}else{
				return 0;
			}
			if(ret1 == -1 || ret2 == -1){
				map[a][b] = 0;
				return 0;
			}
			if(ret1 < ret2){
				map[a][b] = ret1 + 1;
				return map[a][b];
			}else{
				map[a][b] = ret2 + 1;
				return map[a][b];
			}
		}
	}
}
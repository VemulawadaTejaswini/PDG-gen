import java.util.*;

public class main {
	static int before, w, h;
	static int[][] dir = {{-1,0}, {-1,-1}, {0,-1}, {1,-1}, {1,0}, {1,1}, {0, 1}, {-1,1}};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0){
				break;
			}
			int[][] c = new int[h][w];
			for(int i = 0; i < h; i++){/* ???????????? */
				for(int j = 0; j < w; j++){
					c[i][j] = sc.nextInt();
				}
			}
			
			int count = 0;
			for(int i = 0; i < h; i++){/* ?????¨????????§?????¢?´¢????§? */
				for(int j = 0; j < w; j++){
					before = 4;
					int z = search(c, i, j);/* ?????° */
					if(z == 1){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
	
	public static int search(int[][] c, int i, int j){
		if(c[i][j] == 0){
			return 0;
		}
		c[i][j] = 0;
		
		int d = before + 4/* ????????°????????????????????´???????§???? */;
		if(d > 7){
			d -= 8;
		}
		
		for(int k = 0; k < 7; k++){
			d++;
			if(d > 7){
				d -= 8;
			}
			
			before = d;
			int x = i + dir[d][0], y = j + dir[d][1];
			if((x >= 0) && (x < h) && (y >= 0) && (y < w)){
				int z = search(c, x, y);
			}
		}		
		return 1;
	}
}
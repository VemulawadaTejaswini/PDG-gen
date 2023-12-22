import java.util.Scanner;

public class Main{

	public static int w;
	public static int h;
	public static boolean c[][];
	public static boolean flag[][];

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int island;

		while (true){
			island = 0;
			w = sc.nextInt();
			h = sc.nextInt();
			if (w == 0 && h == 0){
				break;
			}
			c = new boolean[h][w];
			flag = new boolean[h][w];

			for (int y = 0; y < h; y++){
				for (int x = 0; x < w; x++){
					c[y][x] = (sc.nextInt() == 1);
					flag[y][x] = true;
				}
			}

			for (int y = 0; y < h; y++){
				for (int x = 0; x < w; x++){
					if (fill(x, y)){
						island++;
					}
				}
			}

			System.out.println("" + island);
		}
	}

	public static boolean fill(int x, int y){
		if (x < 0 || x >= w || y < 0 || y >= h){
			return false;
		}

		if (c[y][x] && flag[y][x]){
			c[y][x] = false;
			fill(x - 1, y - 1);
			fill(x    , y - 1);
			fill(x + 1, y - 1);
			fill(x - 1, y    );
			fill(x + 1, y    );
			fill(x - 1, y + 1);
			fill(x    , y + 1);
			fill(x + 1, y + 1);
			return true;
		}

		return false;
	}
}
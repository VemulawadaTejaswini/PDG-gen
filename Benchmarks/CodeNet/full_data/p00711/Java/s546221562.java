import java.util.Scanner;


public class Main {
	
	static int w;
	static int h;
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0){
				break;
			}
			sc.nextLine();
			int[][] map = new int[w][h];
			String line;
			int x = 0;
			int y = 0;
			
			for(int i = 0; i < h; i++){
				line = sc.nextLine();
				for(int j = 0; j < w ; j++){
					if(line.charAt(j) == '.'){
						map[j][i] = 1;
					}else if(line.charAt(j) == '#'){
						map[j][i] = 0;
					}else if(line.charAt(j) == '@'){
						map[j][i] = 2;
						x = j;
						y = i;
					}
				}
			}
			
			map = Sosaku(x , y, map);
			
			int sum = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(map[j][i] == 2){
						sum++;
					}
				}
			}
			
			System.out.println(sum);
		}
		
	}

	private static int[][] Sosaku(int x, int y, int[][] map) {
		if(x < w - 1 && map[x + 1][y] == 1){
			map[x + 1][y] = 2;
			map = Sosaku(x + 1, y, map);
		}
		if(x > 0 && map[x -1][y] == 1){
			map[x - 1][y] = 2;
			map = Sosaku(x - 1, y, map);
		}
		if(y < h - 1 && map[x][y + 1] == 1){
			map[x][y + 1] = 2;
			map = Sosaku(x, y + 1, map);
		}
		if(y > 0 && map[x][y - 1] == 1){
			map[x][y - 1] = 2;
			map = Sosaku(x, y - 1, map);
		}
		return map;
	}

}
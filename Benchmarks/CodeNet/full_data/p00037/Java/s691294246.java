import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static boolean map[][] = new boolean[11][11];
	static int x = 1, y = 1, vec = 0;
	static int dir[] = new int[]{3, 0, 1, 2};
	static int dx[][] = new int[][]{{1, 0, -1, 0}, {2, 0, -2, 0}};
	static int dy[][] = new int[][]{{0, 1, 0, -1}, {0, 2, 0, -2}};
	static String opr[] = new String[]{"R", "D", "L", "U"};
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		char str[];
		
		int tmp;
		for(int i = 0; i < 9; i++){
			str = reader.readLine().toCharArray();
			if(i % 2 == 0){
				for(int j = 0; j < 4; j++){
					tmp = str[j] - '0';
					if(tmp == 1){
						map[(i / 2) * 2 + 1][j * 2 + 1] = true;
						map[(i / 2) * 2 + 1][(j + 1) * 2] = true;
						map[(i / 2) * 2 + 1][(j + 1) * 2 + 1] = true;
					}
				}
			}else{
				for(int j = 0; j < 5; j++){
					tmp = str[j] - '0';
					if(tmp == 1){
						map[(i / 2 + 1) * 2][j * 2 + 1] = true;
						map[(i / 2 + 1) * 2 + 1][j * 2 + 1] = true;
					}
				}
			}
		}
		app.solve();
		
		reader.close();
	}
	
	public void solve(){
		int tmp;
		boolean next = true;
		while(next){
			for(int i = 0; i < 3; i++){
				tmp = (dir[vec] + i) % 4;
				if(map[y + dy[0][tmp]][x + dx[0][tmp]]){
					y += dy[1][tmp];
					x += dx[1][tmp];
					
					vec = tmp;
					System.out.print(opr[tmp]);
					if(x == 1 && y == 1) next = false;
					break;
				}
			}
		}
		System.out.println();
	}
}
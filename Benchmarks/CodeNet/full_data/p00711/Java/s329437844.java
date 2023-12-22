import java.util.Arrays;
import java.util.Scanner;
//1130 Red and Black

public class Main {
	int height,width,startx,starty;
	Scanner sc = new Scanner(System.in);
	char[][] field;
	boolean[][] visited;
	int count = 0;
	void run(){
		sc = new Scanner(System.in);
		while(true){
			count = 0;
			width = sc.nextInt();
			height = sc.nextInt();
			if(width == 0 && height == 0){
				break;
			}
			sc.nextLine();
			field = new char[height][width];
			visited = new boolean[height][width];
			for(int i = 0; i < visited.length; i++){
				for(int j = 0; j < visited[i].length; j++){
					visited[i][j] = false;
				}
			}

			for(int i = 0; i < height; i++){
				field[i] = sc.nextLine().toCharArray();
				//System.out.println(field[i]);
			}

			for(int i = 0; i < field.length;i++){
				for(int j = 0; j < field[i].length; j++){
					if(field[i][j] == '@'){
						startx = j;
						starty = i;
					}
				}
			}
			count++;
			dfs(starty,startx);
			System.out.println(count);
		}
	}

	public void dfs(int y, int x){
		if(y + 1 < height && visited[y+1][x] == false && field[y+1][x] == '.'){
			visited[y+1][x] = true;
			count++;
			dfs(y+1,x);
		}
		if(y - 1 > -1 && visited[y-1][x] == false && field[y-1][x] == '.'){

			visited[y-1][x] = true;
			count++;
			dfs(y-1,x);
		}
		if(x + 1 < width && visited[y][x+1] == false && field[y][x+1] == '.'){
			visited[y][x+1] = true;
			count++;
			dfs(y,x+1);
		}
		if(x - 1 > -1 && visited[y][x-1] == false && field[y][x-1] == '.'){
			visited[y][x-1] = true;
			count++;
			dfs(y,x-1);
		}
	}

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().run();
	}

}
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	char[][] map;
	int dir;
	int x;
	int y;
	int h;
	int w;
	public void run(){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int n;
		char[] op;
		for(int data = 0;data < t;data++){
			h = scan.nextInt();
			w = scan.nextInt();
			map = new char[h][w];
			for(int i = 0;i < h;i++){
				map[i] = scan.next().toCharArray();
			}
			n = scan.nextInt();
			op = scan.next().toCharArray();
			boolean fl = false;
			for(int i = 0;i < h;i++){
				for(int j = 0;j < w;j++){
					if(map[i][j] == '^'){
						dir = 0; x = j; y = i;
						fl = true;
						break;
					}else if(map[i][j] == '<'){
						dir = 3; x = j; y = i;
						fl = true;
						break;
					}else if(map[i][j] == '>'){
						dir = 2; x = j; y = i;
						fl = true;
						break;
					}else if(map[i][j] == 'v'){
						dir = 1; x = j; y = i;
						fl = true;
						break;
					}
				}
				if(fl){
					break;
				}
			}
			for(int i = 0;i < n;i++){
				switch(op[i]){
				case 'U': up(); break;
				case 'D': down(); break;
				case 'R': right(); break;
				case 'L': left(); break;
				case 'S': shoot(); break;
				default: break;
				}
			}
			for(int i = 0;i < h;i++){
				for(int j = 0;j < w;j++){
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			if(data != t-1){
				System.out.println();
			}
		}
	}
	public void up(){
		dir = 0;
		if(y != 0){
			if(map[y-1][x] == '.'){
				map[y--][x] = '.';				
			}
		}
		map[y][x] = '^';
	}
	public void down(){
		dir = 1;
		if(y != h-1){
			if(map[y+1][x] == '.'){
				map[y++][x] = '.';
			}
		}
		map[y][x] = 'v';
	}
	public void right(){
		dir = 2;
		if(x != w-1){
			if(map[y][x+1] == '.'){
				map[y][x++] = '.';
			}
		}
		map[y][x] = '>';
	}
	public void left(){
		dir = 3;
		if(x != 0){
			if(map[y][x-1] == '.'){
				map[y][x--] = '.';
			}
		}
		map[y][x] = '<';
	}
	public void shoot(){
		if(dir == 0){
			for(int i = y;i >= 0;i--){
				if(map[i][x] == '#'){
					break;
				}else if(map[i][x] == '*'){
					map[i][x] = '.';
					break;
				}
			}
		}else if(dir == 1){
			for(int i = y;i < h;i++){
				if(map[i][x] == '#'){
					break;
				}else if(map[i][x] == '*'){
					map[i][x] = '.';
					break;
				}
			}
		}else if(dir == 2){
			for(int i = x;i < w;i++){
				if(map[y][i] == '#'){
					break;
				}else if(map[y][i] == '*'){
					map[y][i] = '.';
					break;
				}
			}
		}else if(dir == 3){
			for(int i = x;i >= 0;i--){
				if(map[y][i] == '#'){
					break;
				}else if(map[y][i] == '*'){
					map[y][i] = '.';
					break;
				}
			}
		}
	}
}
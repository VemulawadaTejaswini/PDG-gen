import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int T = sc.nextInt();
		
		for(int i = 0; i < T; i++){
			if(i != 0){
				System.out.println();
				System.out.println();
			}
			
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			
			char[][] map = new char[H+2][W+2];
			
			int p_x = 0, p_y = 0;
			
			for(int j = 0; j < (H + 2); j++){
				char[] str = null;
				if(!(j == 0 || j == H + 1)){
					str = sc.next().toCharArray();
				}
				
				for(int k = 0; k < (W + 2); k++){
					if(j == 0 || j == H + 1 || k == 0 || k == W + 1){
						map[j][k] = '#';
					}else{
						map[j][k] = str[k-1];
						
						if(map[j][k] == '<' || map[j][k] == '>' || map[j][k] == '^' || map[j][k] == 'v'){
							p_x = k;
							p_y = j;
						}
					}
				}
			}
			sc.next();
			char[] input = sc.next().toCharArray();
			for(char c : input){
				if(c == 'U'){
					map[p_y][p_x] = '^';
					if(map[p_y-1][p_x] == '.'){
						map[p_y-1][p_x] = '^';
						map[p_y][p_x] = '.';
						p_y--;
					}
				}else if(c == 'D'){
					map[p_y][p_x] = 'v';
					if(map[p_y+1][p_x] == '.'){
						map[p_y+1][p_x] = 'v';
						map[p_y][p_x] = '.';
						p_y++;
					}
				}else if(c == 'L'){
					map[p_y][p_x] = '<';
					if(map[p_y][p_x-1] == '.'){
						map[p_y][p_x-1] = '<';
						map[p_y][p_x] = '.';
						p_x--;
					}
				}else if(c == 'R'){
					map[p_y][p_x] = '>';
					if(map[p_y][p_x+1] == '.'){
						map[p_y][p_x+1] = '>';
						map[p_y][p_x] = '.';
						p_x++;
					}
				}else if(c == 'S'){
					int s_x = 0, s_y = 0;
					
					if(map[p_y][p_x] == '^'){
						s_y = -1;
					}else if(map[p_y][p_x] == 'v'){
						s_y = 1;
					}else if(map[p_y][p_x] == '<'){
						s_x = -1;
					}else if(map[p_y][p_x] == '>'){
						s_x = 1;
					}
					
					int xx = p_x + s_x;
					int yy = p_y + s_y;
					
					while(!(map[yy][xx] == '*' || map[yy][xx] == '#')){
						yy += s_y;
						xx += s_x;
					}
					
					if(map[yy][xx] == '*'){
						map[yy][xx] = '.';
					}
				}
			}
			
			for(int j = 1; j < H + 1; j++){
				for(int k = 1; k < W + 1; k++){
					System.out.print(map[j][k]);
				}
				
				if(j != H){
					System.out.println();
				}
			}
		}
	}

}
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final int RIGHT = 0;
	public static final int BELOW = 1;
	public static final int LEFT = 2;
	public static final int ABOVE = 3;
	public static final int X = 0;
	public static final int Y = 1;
	public static final int DIR = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();
		//test();
	}
	public static void test(){
		String s = "abcdefg";
		int l = s.length();
		for(int i = 0; i < l; i++){
			char c = s.charAt(i);
			System.out.println(c);
		}
	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
			int h = sc.nextInt();
			int w = sc.nextInt();
			//make field 
			char[][] field = new char[w][h];
			//x,y,direction
			int[] tank = new int[3];
			for(int j = 0; j < h; j++){
				String str = sc.next();
				//System.out.println(str);
				for(int k = 0; k < w; k++){
					char c = str.charAt(k);
					//System.out.println(c);
					field[k][j] = c;
					if(c == '^'){
						tank[X] = k;
						tank[Y] = j;
						tank[DIR] = ABOVE;
					}
					else if(c == 'v'){
						tank[X] = k;
						tank[Y] = j;
						tank[DIR] = BELOW;
					}
					else if(c == '<'){
						tank[X] = k;
						tank[Y] = j;
						tank[DIR] = LEFT;
					}
					else if(c == '>'){
						tank[X] = k;
						tank[Y] = j;
						tank[DIR] = RIGHT;
					}
				}
			}
			int n = sc.nextInt();
			String input = sc.next();
			//execute input
			for(int j = 0; j < n; j++){
				char c = input.charAt(j);
				int x = tank[X];
				int y = tank[Y];
				switch(c)
				{
				case 'U':
					tank[DIR] = ABOVE;
					field[x][y] = '^';
					y -= 1;
					if(y >= 0 && field[x][y] == '.'){
						tank[Y] = y;
						field[x][y] = '^';
						field[x][y + 1] = '.';
					}
					break;
				case 'D':
					tank[DIR] = BELOW;
					field[x][y] = 'v';
					y += 1;
					if(y < h && field[x][y] == '.'){
						tank[Y] = y;
						field[x][y] = 'v';
						field[x][y - 1] = '.';
					}
					break;
				case 'L':
					tank[DIR] = LEFT;
					field[x][y] = '<';
					x -= 1;
					if(x >= 0 && field[x][y] == '.'){
						tank[X] = x;
						field[x][y] = '<';
						field[x + 1][y] = '.';
					}
					break;
				case 'R':
					tank[DIR] = RIGHT;
					field[x][y] = '>';
					x += 1;
					if(x < w && field[x][y] == '.'){
						tank[X] = x;
						field[x][y] = '>';
						field[x - 1][y] = '.';
					}
					break;
				case 'S':
					if(tank[DIR] == ABOVE){
						for(int k = y - 1; k >= 0; k--){
							//レンガの壁だったら
							if(field[x][k] == '*'){
								field[x][k] = '.';
								break;
							}
							else if(field[x][k] == '#'){
								break;
							}
						}
					}
					else if(tank[DIR] == BELOW){
						for(int k = y + 1; k < h; k++){
							//レンガの壁だったら
							if(field[x][k] == '*'){
								field[x][k] = '.';
								break;
							}
							else if(field[x][k] == '#'){
								break;
							}
						}
					}
					else if(tank[DIR] == RIGHT){
						for(int k = x + 1; k < w; k++){
							//レンガの壁だったら
							if(field[k][y] == '*'){
								field[k][y] = '.';
								break;
							}
							else if(field[k][y] == '#'){
								break;
							}
						}
					}
					else if(tank[DIR] == LEFT){
						for(int k = x - 1; k >= 0; k--){
							//レンガの壁だったら
							if(field[k][y] == '*'){
								field[k][y] = '.';
								break;
							}
							else if(field[k][y] == '#'){
								break;
							}
						}
					}
				default:
					break;
				}
				//System.out.println("j = " + j + ", c = " + c);
				//System.out.println("x = " + tank[X] + ", y = " + tank[Y]);
				//print(field, false);
			}
			if(i != t - 1){
				print(field, false);
			}
			else{
				print(field, true);
			}
		}
	}
	public static void print(char[][] field, boolean bLast){
		int w = field.length;
		int h = field[0].length;
		for(int j = 0; j < h; j++){
			for(int k = 0; k < w - 1; k++){
				System.out.print(field[k][j]);
			}
			System.out.println(field[w - 1][j]);
		}
		if(bLast == false){
			System.out.println("");
		}
	}

}
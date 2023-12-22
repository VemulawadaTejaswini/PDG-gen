
import java.util.Scanner;

public class BattleTown {
	public static void main (String args[]){

		//??\??????????????????????????????Scanner???????????§???????????????
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i = 0;

		for(i = 0; i < T; i++){

			int H = sc.nextInt();
			int W = sc.nextInt();
			char[][] map = new char[H][W];

			//???0??????1??????2??????3
			char tank;


			for(int j = 0; j < H; j++){
				String line = sc.next();

				for(int k = 0; k < W; k++){
					map[j][k] = line.charAt(k);

					if(map[j][k] == '^' || map[j][k] == 'v' || map[j][k] == '<' || map[j][k] == '>'){
						if(map[j][k] == '^'){
							tank = '^';
						}else if(map[j][k] == 'v'){
							tank = 'v';
						}else if(map[j][k] == '<'){
							tank = '<';
						}else{
							tank = '>';
						}
						int t = j;
						int y = k;
						Battle BT = new Battle(t,y,tank,map);
					}
				}
			}

			int N = sc.nextInt();
			String com = sc.next();
			char[] command = new char[N];

			for(int j = 0; j < N; j++){
				Battle.check(command[j] = com.charAt(j));
			}

			System.out.print(Battle.output());

			if(i != T){
				System.out.println("");
			}
		}
		sc.close();
	}
}

class Battle{
	static int tate;
	static int yoko;
	static char tank;
	static char[][] map;

	//????????\??????
	Battle(int t, int y, char tankk, char[][] mapp){
		tate = t;
		yoko = y;
		map = mapp;
		tank = tankk;
	}

	public static String output(){
		StringBuffer str = new StringBuffer();

		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				str.append(map[i][j]);
			}
			str.append(System.getProperty("line.separator"));
		}
		String ans = new String(str);
		return ans;
	}

	public static void check(char command){

		switch (command){

		case 'U':
			tank = '^';
			if(tate > 0){
				if(map[tate-1][yoko] == '.'){
					tate = tate - 1;
					map[tate][yoko] = '^';
					map[tate+1][yoko] = '.';
				}
			}
			break;

		case 'D':
			tank = 'v';
			if((map.length - (tate+1)) > 0){
				if(map[tate+1][yoko] == '.'){
					tate = tate + 1;
					map[tate][yoko] = 'v';
					map[tate-1][yoko] = '.';
				}
			}
			break;

		case 'L':
			tank = '<';
			if(yoko > 0){
				if(map[tate][yoko-1] == '.'){
					yoko = yoko - 1;
					map[tate][yoko] = '<';
					map[tate][yoko+1] = '.';
				}
			}
			break;

		case 'R':
			tank = '>';
			if((map[tate].length - (yoko+1)) > 0){
				if(map[tate][yoko+1] == '.'){
					yoko = yoko + 1;
					map[tate][yoko] = '>';
					map[tate][yoko-1] = '.';
				}
			}
			break;

		case 'S':
			switch (tank){
			case '^':
				for(int i = tate; i >= 0; i--){
					if(map[i][yoko] == '#'){
						i = 0;
					}else if(map[i][yoko] == '*'){
						map[i][yoko] = '.';
						i = 0;
					}
				}
				break;

			case 'v':
				for(int i = tate; i < map.length; i++){
					if(map[i][yoko] == '#'){
						i = map.length +1;
					}else if(map[i][yoko] == '*'){
						map[i][yoko] = '.';
						i = map.length +1;
					}
				}
				break;

			case '<':
				for(int i = yoko; i >= 0; i--){
					if(map[tate][i] == '#'){
						i = -1;
					}else if(map[tate][i] == '*'){
						map[tate][i] = '.';
						i= -1;
					}
				}
				break;

			case '>':
				for(int i = yoko; i < map[tate].length; i++){
					if(map[tate][i] == '#'){
						i = map[tate].length +1;
					}else if(map[tate][i] == '*'){
						map[tate][i] = '.';
						i = map.length +1;
					}
				}
				break;

			default:
				break;
			}

		default:
			break;
		}
	}
}
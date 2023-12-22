import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
			int h = sc.nextInt();
			int w = sc.nextInt();
			String[][] map = new String[h][w];
			int[] x = new int[2];
			sc.nextLine();
			for(int j = 0; j < h; j++){
				String s = sc.nextLine();
				for(int k = 0; k < w; k++){
					map[j][k] = String.valueOf(s.charAt(k));
					String _s = map[j][k];
					if(_s.equals("^") || _s.equals("v") || _s.equals("<") || _s.equals(">")){
						x[0] = j;
						x[1] = k;
					}
				}
			}
			int n = sc.nextInt();
			String[] command = new String[n];
			sc.nextLine();
			String s = sc.nextLine();
			for(int j = 0; j < n; j++){
				command[j] = String.valueOf(s.charAt(j));
			}
			play(map, x, command);
			if(i < t-1){
				System.out.println();
			}
		}
		sc.close();
	}
	static void play(String[][] map, int[] x, String[] command){
		for(int i = 0; i < command.length; i++){
			if(command[i].equals("S")){
				shoot(map, x);
			}else{
				move(map, x, command[i]);
			}
		}
		printMap(map);
	}
	static void move(String[][] map,int[] x, String s){
		int[] v = new int[2];
		if(s.equals("U")){
			v[0] = -1;
		}else if(s.equals("D")){
			v[0] = 1;
		}else if(s.equals("L")){
			v[1] = -1;
		}else{
			v[1] = 1;
		}
		int[] nx = {x[0]+v[0], x[1]+v[1]};
		if(isInMap(map, nx) && map[nx[0]][nx[1]].equals(".")){
			map[nx[0]][nx[1]] = v2p(v);
			map[x[0]][x[1]] = ".";
			x[0] = nx[0];
			x[1] = nx[1];
		}else{
			map[x[0]][x[1]] = v2p(v);
		}

	}
	static String v2p(int[] v){
		if(v[0] == 0){
			if(v[1] == 1){
				return ">";
			}else{
				return "<";
			}
		}else if(v[0] == -1){
			return "^";
		}else{
			return "v";
		}
	}
	static void shoot(String[][] map, int[] x){
		int[] v = new int[2];
		String s = map[x[0]][x[1]];
		if(s.equals("^")){
			v[0] = -1;
		}else if(s.equals("v")){
			v[0] = 1;
		}else if(s.equals("<")){
			v[1] = -1;
		}else{
			v[1] = 1;
		}
		int[] bx = {x[0], x[1]};
		while(isInMap(map, bx) && (!map[bx[0]][bx[1]].equals("*") && !map[bx[0]][bx[1]].equals("#"))){
			bx[0] += v[0];
			bx[1] += v[1];
		}
		if(isInMap(map, bx)){
			if(map[bx[0]][bx[1]].equals("*")){
				map[bx[0]][bx[1]] = ".";
			}
		}
	}
	static boolean isInMap(String[][] map, int[] x){
		return 0 <= x[0] && x[0] < map.length && 0 <= x[1] && x[1] < map[0].length;
	}
	static void printMap(String[][] map){
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[0].length; j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}
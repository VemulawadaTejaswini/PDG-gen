import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		
		h = sc.nextInt();
		w = sc.nextInt();
		n = sc.nextInt();
		calc();
		
	}
	int h;
	int w;
	int n;
	public void calc(){
		String[][] map = new String[h][w];
		for(int i = 0; i < h; i++){
			String line = sc.next();
			for(int j = 0; j < w; j++){
				map[i][j] = line.substring(j, j+1);
			}
		}
		
		boolean t = false;
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w-1; j++){
				String[][] checkMap = new String[h][w];
				for(int a = 0; a < h; a++){
					for(int b = 0; b < w; b++){
						checkMap[a][b] = map[a][b];
					}
				}
				if(!(checkMap[i][j].equals(".") && checkMap[i][j+1].equals("."))){
					String s = checkMap[i][j];
					checkMap[i][j] = checkMap[i][j+1];
					checkMap[i][j+1] = s;
					fallFirst(checkMap, i, j);
					t = check(checkMap);
					if(t) break;
				}
			}
			if(t) break;
		}
		if(t) System.out.println("YES");
		else System.out.println("NO");
	}

	public void fallFirst(String[][] map, int i, int j){
		for(int k = i+1; k < h; k++){
			if(map[k][j].equals(".")){
				map[k][j] = map[k-1][j];
				map[k-1][j] = ".";
			}
			if(map[k][j+1].equals(".")){
				map[k][j+1] = map[k-1][j+1];
				map[k-1][j+1] = "."; 
			}
		}
	}
	
	public boolean check(String[][] map){
		boolean t = true;
		while(t){
			t = delete(map);
			fall(map);
		}
		for(int i = 0;i < h; i++){
			for(int j = 0; j < w; j++){
				if(!map[i][j].equals(".")) return false;
			}
		}
		return true;
	}
	
	public boolean delete(String[][] map){
		ArrayList<Integer[]> wlist = new ArrayList<Integer[]>();
		for(int i = 0; i < h; i++){
			String s = map[i][0];
			int yoko = 1;
			int x = i;
			int y = 0;
			for(int j = 1; j < w; j++){
				if(map[i][j].equals(s) && !s.equals(".")){
					yoko++;
				}
				else{
					if(yoko >= n) 
						wlist.add(new Integer[]{x,y,yoko});
					s = map[i][j];
					yoko = 1;
					x = i;
					y = j;
				}
			}
			if(yoko >= n)
				wlist.add(new Integer[]{x,y,yoko});
		}

		ArrayList<Integer[]> hlist = new ArrayList<Integer[]>();
		for(int j = 0; j < w; j++){
			String s = map[0][j];
			int tate = 1;
			int x = 0;
			int y = j;
			for(int i = 1; i < h; i++){
				if(map[i][j].equals(s) && !s.equals(".")){
					tate++;
				}
				else{
					if(tate >= n) hlist.add(new Integer[]{x,y,tate});
					s = map[i][j];
					tate = 1;
					x = i;
					y = j;
				}
			}
			if(tate >= n) hlist.add(new Integer[]{x,y,tate});
		}

		if(wlist.size() == 0 && hlist.size() == 0) return false;
		while(wlist.size() != 0){
			Integer[] item = wlist.get(0);
			wlist.remove(0);
			int x = item[0];
			int y = item[1];
			for(int i = 0; i < item[2]; i++){
				map[x][y] = "0";
				y++;
			}
		}
		while(hlist.size() != 0){
			Integer[] item = hlist.get(0);
			hlist.remove(0);
			int x = item[0];
			int y = item[1];
			for(int i = 0; i < item[2]; i++){
				map[x][y] = "0";
				x++;
			}
		}
		return true;
	}
	
	public void fall(String[][] map){
		int x = -1;
		int y = -1;
		int mx = -1;
		int my = -1;
		for(int j = 0; j < w; j++){
			for(int i = 0; i < h; i++){
				if(map[i][j].equals("0")){
					x = i;
					y = j;
				}
				if(!map[i][j].equals("0") && !map[i][j].equals(".") && mx == -1 && my == -1){
					mx = i;
					my = j;
				}
			}
			if(x != -1 && y != -1){
				while(x >= 0){
					if(mx >= 0){
						map[x][y] = map[mx][my];
						x--;
						mx--;
					}
					else{
						map[x][y] = ".";
						x--;
					}
				}
			}
			x = -1; y = -1; mx = -1; my = -1;
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
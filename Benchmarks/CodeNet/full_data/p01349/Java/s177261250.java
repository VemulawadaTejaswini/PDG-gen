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
					fall(checkMap);
					t = check(checkMap);
					if(t) break;
				}
			}
			if(t) break;
		}
		if(t) System.out.println("YES");
		else System.out.println("NO");
	}


	public boolean check(String[][] map){
		boolean t = true;
		while(t){
			t = delete(map);
			fall(map);
			t=t;
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
				map[x][y] = ".";
				y++;
			}
		}
		while(hlist.size() != 0){
			Integer[] item = hlist.get(0);
			hlist.remove(0);
			int x = item[0];
			int y = item[1];
			for(int i = 0; i < item[2]; i++){
				map[x][y] = ".";
				x++;
			}
		}
		return true;
	}
	public void fall(String[][] map){
		for(int j = 0; j < w; j++){
			int sum = 0;
			for(int i = h-1; i >= 0; i--){
				String s = map[i][j];
				if(s.equals(".")) sum++;
				else if(sum != 0){
					map[i+sum][j] = map[i][j];
					map[i][j] = ".";
					i = i+sum;
					sum = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
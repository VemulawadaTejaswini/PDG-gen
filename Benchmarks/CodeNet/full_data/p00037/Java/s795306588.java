import java.util.*;

public class Main{
	//1110 start
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int mapsize = 9;
		while(sc.hasNext()){
			int [][] pass = new int[mapsize][mapsize];
			for(int i = 0; i < mapsize; i++){
				String s = sc.next();
				if(i % 2 == 0){
					Arrays.fill(pass[i], 1);
					for(int j = 0; j < 4; j++){
						int c = s.charAt(j) - '0';
						pass[i][j * 2 + 1] = c;
					}
				}
				else{
					for(int j = 0; j < 5; j++){
						int c = s.charAt(j) - '0';
						pass[i][j * 2] = c;
					}
				}
			}
			
			int [] vx = {-1,0,1,0};
			int [] vy = {0,-1,0,1};
			String [] word = {"L", "U", "R", "D"};
			int nowx = 0, nowy = 0;
			int dir = 2;
			StringBuilder sb = new StringBuilder();
			while(true){
				for(int i = 3; i < 7; i++){
					int xx = nowx + vx[(i + dir) % 4];
					int yy = nowy + vy[(i + dir) % 4];
					int xxx = xx + vx[(i + dir) % 4];
					int yyy = yy + vy[(i + dir) % 4];
					if(! isOK(xx, yy, mapsize)) continue;
					if(! isOK(xxx, yyy, mapsize)) continue;
					if(pass[yy][xx] == 0) continue;
					if(pass[yyy][xxx] == 0) continue;
					nowx = xxx;
					nowy = yyy;
					dir = (i + dir) % 4;
					sb.append(word[(dir)]);
					break;
				}
				if(nowx == 0 && nowy == 0){
					break;
				}
			}
			System.out.println(sb.toString());
		}
	}
	
	private boolean isOK(int x,int y,int mapsize){
		if(0 <= x && x < mapsize && 0 <= y && y < mapsize){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		new Main().doit();
	}
}
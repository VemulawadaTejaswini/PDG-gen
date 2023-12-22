import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static char[][] map;
	public static int w, h;
	public static boolean[][] used;
//	public static int turn;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			w = in.nextInt();
			h = in.nextInt();
			if(w == 0) break;
			map = new char[h][w];
			used = new boolean[h][w];
//			turn = 1;
			ans = new ArrayList<Integer>();
			for(int i=0; i<h; i++){
				map[i] = in.next().toCharArray();
			}
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					if(Character.isAlphabetic(map[i][j])
							|| used[i][j]) continue;
					dfs(j, i, new ArrayList<Integer>());
				}
			}
			for(int i: ans){
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static final int[] dx = {1, 0};
	public static final int[] dy = {0, 1};
	public static List<Integer> ans;
	public static void dfs(int x, int y, List<Integer> num){
		num.add(map[y][x]-'0');
		used[y][x] = true;
		boolean exp = false;
		for(int i=0; i<2; i++){
			int ny = y+dy[i];
			int nx = x+dx[i];
			if(ny < 0 || ny >= h || nx < 0 || nx >= w) continue;
			if('A' <= map[ny][nx] && map[ny][nx] <= 'Z') continue;
			exp = true;
			dfs(nx, ny, num);
		}
		if(!exp){
			int idx = 0;
			while(idx < num.size() && num.get(idx) == 0) idx++;
			if(ans.size() < num.size()-idx){
				ans = listing(idx, num);
			}else if(ans.size() == num.size()-idx){
				for(int i=0; i<ans.size(); i++){
					if(ans.get(i) < num.get(i+idx)){
						ans = listing(idx, num);
						break;
					}else if(ans.get(i) > num.get(i+idx))
						break;
				}
			}
		}
		num.remove(num.size()-1);
		
	}
	
	public static List<Integer> listing(int idx, List<Integer> num){
		List<Integer> ans = new ArrayList<Integer>();
		for(; idx<num.size(); idx++){
			ans.add(num.get(idx));
		}
		return ans;
	}
}
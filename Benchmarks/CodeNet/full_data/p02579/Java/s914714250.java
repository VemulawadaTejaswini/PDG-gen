import java.util.*;

public class Main {

	static int[][] map;
	static int[][] vis;
	static int dh;
	static int dw;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int w = s.nextInt();
		int ch = s.nextInt();
		int cw = s.nextInt();
		dh = s.nextInt();
		dw = s.nextInt();
		map = new int[h][w];	
		vis = new int[h][w];
		String tmp = "";
		
		tmp = s.nextLine();
		map[ch-1][cw-1] = 2;
		map[dh-1][dw-1] = 3;
		
		for(int i = 0; i < h; i++) {
			
			tmp = s.nextLine();
			
			for(int j = 0; j < w; j++) {
				
				map[i][j] = (tmp.charAt(j) == '.') ? 0 : 1;
				vis[i][j] = -1;
				
			}
			
		}
		
		System.out.println(dfs(ch-1, cw-1, 0));	
		
	}
	
	static long dfs(int h, int w, int j) {
								
		long ret = -1;
		long tmp = 0;
		
		vis[h][w] = j;
		
		if(h == dh-1 && w == dw-1) {
			
			return j;	
			
		}	
				
		for(int i = -2; i <= 2; i++) {
			
			for(int k = -2; k <= 2; k++) {
				
				if((Math.abs(i) == 1 && k == 0) || (Math.abs(k) == 1 && i == 0)) {
					
					if(i == -1 && h > 0 && map[h-1][w] != 1 && (vis[h-1][w] > j || vis[h-1][w] == -1)) {
											
						tmp = dfs(h-1, w, j);
						if(ret == -1)
							ret = tmp;
						else {
							if(tmp != -1) {
								ret = Math.min(tmp, ret);
							}
						}
						
					}
					
					if(k == -1 && w > 0 && map[h][w-1] != 1 && (vis[h][w-1] > j || vis[h][w-1] == -1)) {
												
						tmp = dfs(h, w-1, j);	
						if(ret == -1)
							ret = tmp;
						else {
							if(tmp != -1) {
								ret = Math.min(tmp, ret);
							}
						}
						
					}
					
					if(i == 1 && h < map.length-1 && map[h+1][w] != 1 && (vis[h+1][w] > j || vis[h+1][w] == -1)) {
												
						tmp = dfs(h+1, w, j);
						if(ret == -1)
							ret = tmp;
						else {
							if(tmp != -1) {
								ret = Math.min(tmp, ret);
							}
						}
						
					}
					
					if(k == 1 && w < map[0].length -1 && map[h][w+1] != 1 && (vis[h][w+1] > j || vis[h][w+1] == -1)) {
												
						tmp = dfs(h, w+1, j);
						if(ret == -1)
							ret = tmp;
						else {
							if(tmp != -1) {
								ret = Math.min(tmp, ret);
							}
						}
						
					}
					
				}else {
					
					if(h + i > 0 && h + i < map.length && w + k > 0 && w + k < map[0].length) {
						
						if(map[h+i][w+k] != 1 && (vis[h+i][w+k] > j+1 || vis[h+i][w+k] == -1)) {
							
							tmp = dfs(h+i, w+k, j+1);
							if(ret == -1)
								ret = tmp;
							else {
								if(tmp != -1)
									if(tmp != -1) {
										ret = Math.min(tmp, ret);
									}
							}
							
						}
						
					}
					
				}			
				
			}
			
		}
		
		return ret;
		
	}

}
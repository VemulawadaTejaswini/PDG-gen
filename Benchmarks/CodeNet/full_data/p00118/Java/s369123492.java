import java.util.*;

public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h==0 && w==0) break;
			
			char[][] map = new char[h][w];
			for(int i=0;i<h;i++) map[i] = sc.next().toCharArray();
			
			ArrayList<int[]> list = new ArrayList<int[]>();	
			int cnt = 0;
			
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(map[i][j]!='.'){
						cnt++;
						char c = map[i][j];
						map[i][j] = '.';
						list.add(new int[]{i, j});
						while(!list.isEmpty()){
							ArrayList<int[]> next = new ArrayList<int[]>();
							for(int[] xy : list){
								int y = xy[0];
								int x = xy[1];
								
								if(x!=0 && map[y][x-1]==c){
									map[y][x-1] = '.';
									next.add(new int[]{y, x-1});
								}
								if(x!=w-1 && map[y][x+1]==c){
									map[y][x+1] = '.';
									next.add(new int[]{y, x+1});
								}
								if(y!=0 && map[y-1][x]==c){
									map[y-1][x] = '.';
									next.add(new int[]{y-1, x});
								}
								if(y!=h-1 && map[y+1][x]==c){
									map[y+1][x] = '.';
									next.add(new int[]{y+1, x});
								}
							}
							list = next;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}	
}
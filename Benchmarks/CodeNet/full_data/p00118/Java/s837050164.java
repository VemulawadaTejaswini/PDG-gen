import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int map[][];
	int dx[] = {1,-1,0,0};
	int dy[] = {0,0,1,-1};
	void dfs(int h,int w,int cost,int H,int W){
		map[h][w] = 0;
		if(cost > 0){
			for(int i = 0;i < 4;i++){
				int ax = w + dx[i];
				int ay = h + dy[i];
				if(ax >= 0 && ax < W && ay >= 0 && ay < H){
					if(map[ay][ax] == cost){
						dfs(ay,ax,map[ay][ax],H,W);
					}
				}
			}
		}
	}
	void doIt() { 
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			ArrayList<Character> array= new ArrayList<Character>();
			if(H + W == 0)break;
			map = new int[H][W];
			for(int h = 0;h < H;h++){
				String str = sc.next();
				char ctr[] = str.toCharArray();
				for(int w = 0;w < W;w++){
					for(int k = 0;k < array.size();k++){
						if(ctr[w] == array.get(k)){
							map[h][w] = k + 1;
						}
					}if(map[h][w] == 0){
						array.add(ctr[w]);
						map[h][w] = array.size();
					}
				}
			}
			int cnt = 0;
			for(int h = 0;h < H;h++){
				for(int w = 0;w < W;w++){
					if(map[h][w] > 0){
						cnt++;
						dfs(h,w,map[h][w],H,W);
					}
				}
			}
			System.out.println(cnt);
		}
     }
    public static void main(String[] args) {
    	new Main().doIt();
    }
}
public class Game{
	int answer = 11;
	int w, h;
	int[][] map;
	int[][] v = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
	Game(int iw, int ih){
		w = iw;
		h = ih;
		map = new int[h][w];
	}
	void search(int x, int y, int k){
		if(k >= answer)
			return;
		int p, q;
		for(int i = 0; i < v.length; i++){
			p = x + v[i][0];
			q = y + v[i][1];
			if(p < 0 || p >= h || q < 0 || q >= w || map[p][q] == 1)
				continue;
			while(p >= 0 && p < h && q >= 0 && q < w){
				if(map[p][q] == 1){
					map[p][q] = 0;
					search(p-v[i][0], q-v[i][1], k+1);
					map[p][q] = 1;
					break;
				}
				if(map[p][q] == 3){
					if(k+1 < answer)
						answer = k + 1;
					break;
				}
				p += v[i][0];
				q += v[i][1];
			}
		}
		return;
	}
}
class Game{
	int answer = 11;
	int w, h;
	int[][] map;
	int[][] v = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
	Game(int iw, int ih){
		w = iw;
		h = ih;
		map = new int[h][w];
	}
	boolean isInRange(int x, int y){
		return (x >= 0 && x < h && y >= 0 && y < w);
	}
	void search(int x, int y, int k){
		if(k >= answer)
			return;
		int p, q;
		for(int i = 0; i < v.length; i++){
			p = x + v[i][0];
			q = y + v[i][1];
			if(!isInRange(p, q) || map[p][q] == 1)
				continue;
			while(isInRange(p, q)){
				if(map[p][q] == 1){
					map[p][q] = 0;
					search(p-v[i][0], q-v[i][1], k+1);
					map[p][q] = 1;
					break;
				}
				if(map[p][q] == 3){
					if(k+1 < answer)
						answer = k + 1;
					break;
				}
				p += v[i][0];
				q += v[i][1];
			}
		}
		return;
	}
}

import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	int ni[] ={-1,0,1,0};
	int nj[] ={0,-1,0,1};
	int h ;
	int w ;
	int c ;
	
	void label2(int i , int j , int prev, int post, int [][] map){
		for(int z=  0; z < 4; z++){
			int nni = i + ni[z];
			int nnj = j + nj[z];
			
			if(nni < 0){
				continue;
			}
			if(nni  >= h ){
				continue;
			}
			if(nnj < 0){
				continue;
			}
			if(nnj  >= w ){
				continue;
			}
			
			if(map[nni][nnj] != prev){
				continue;
			}
			map[nni][nnj] = post;
			label2(nni,nnj,prev,post,map);
		}
	}
	
	void fill(int prev,int post, int map[][]){
		for(int i = 0; i < h ; i ++){
			for(int j= 0; j < w ; j++){
				if(map[i][j] == prev){
					map[i][j] = post;
				}
			}
		}
	}
	
	void label(int [][] map, int color){
		int prev1 = map[0][0];
		map[0][0] = -1;
		this.label2(0, 0, prev1, -1, map);
		fill(-1,color,map);
	}
	int count( int map[][]){
		int ret = 0;
		for(int i = 0; i < h ; i ++){
			for(int j= 0; j < w ; j++){
				if(map[i][j] ==-1){
					ret++;
				}
			}
		}
		return ret;
	}
	
	int labelz(int [][] map, int color){
		
		int prev1 = map[0][0];
		map[0][0] = -1;
		this.label2(0, 0, prev1, -1, map);
		this.fill(-1, color, map);
		map[0][0] = -1;
		this.label2(0, 0,color, -1, map);
		return count(map);
	}

	int[][] clone(int map[][]){
		int[][] ret = new int[map.length][];
		for(int i = 0; i < map.length; i++){
			ret[i] = map[i].clone();
		}
		return ret;
	}
	
	void run(){
		for(;;){
			h =sc.nextInt();
			w = sc.nextInt();
			c = sc.nextInt();
			if((h|w|c) == 0){
				break;
			}
			int map [][] = new int[h][w];
			c--;
			for(int i = 0; i < h ; i ++){
				for(int j = 0 ; j < w ; j++){
					map[i][j] = sc.nextInt() -1;
				}
			}
			
			int res = 0;
			
			for(int g = 0; g < 6; g++){
				int mapg[][] = clone(map);
				label(map,g);
				for(int f = 0 ; f < 6 ; f++){
					int mapf[][] = clone(map);
					label(map,f);
					for(int e = 0; e < 6; e++){
						int mape[][] = clone(map);
						label(map,e);
						for(int d = 0 ; d < 6 ; d++){
							int mapd[][] = clone(map);
							label(map,d);
								
							res = Math.max(labelz(map,c),res);
							
							map = mapd;
						}
						map = mape;
					}
					map = mapf;
				}
				map = mapg;
			}
			System.out.println(res);
			
		}		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}
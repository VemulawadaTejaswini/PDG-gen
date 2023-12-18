import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		new Main().run();
	}

	boolean[][] org, ans1, ans2, tmp1, tmp2;
	int h, w;
	int[] a = new int[]{1,0,-1,0};
	int[] b = new int[]{0,1,0,-1};
	
	void run(){
		Scanner sc = new Scanner(System.in);

		h = sc.nextInt();
		w = sc.nextInt();
		org = new boolean[h][w];
		ans1 = new boolean[h][w];
		ans2 = new boolean[h][w];
		tmp1 = new boolean[h][w];
		tmp2 = new boolean[h][w];
		for(int i=0;i<h;i++){
			String s = sc.next();
			for(int j=0;j<w;j++){
				if(s.charAt(j)=='#'){
					org[i][j] = true;
					ans2[i][j] = true;
				}
			}
		}
		
		fnc();
		
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(ans1[i][j]){
					System.out.print('#');
				}else{
					System.out.print('.');
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(ans2[i][j]){
					System.out.print('#');
				}else{
					System.out.print('.');
				}
			}
			System.out.println();
		}
	}

	void fnc(){
		boolean f = false;
		for(int i=1;i<h-1;i++){
			for(int j=1;j<w-1;j++){
				if(org[i][j] && !ans1[i][j]){
					tmp1 = new boolean[h][w];
					block(i, j);
					if(f){
						con(i, j);
						for(int u=1;u<h-1;u++){
							for(int v=1;v<w-1;v++){
								if(tmp1[u][v]){
									ans1[u][v] = tmp1[u][v];
								}
							}
						}
					}else{
						f = true;
						for(int u=1;u<h-1;u++){
							for(int v=1;v<w-1;v++){
								ans1[u][v] = tmp1[u][v];
							}
						}
					}
				}
			}
		}
		
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(!ans1[i][j]){
					ans2[i][j] = true;
				}
			}
		}
		
	}
	
	void block(int sy, int sx){
		ArrayDeque<Integer> y = new ArrayDeque<Integer>();
		ArrayDeque<Integer> x = new ArrayDeque<Integer>();
		y.offer(sy);
		x.offer(sx);
		tmp1[sy][sx] = true;
		while(!y.isEmpty()){
			int yy = y.poll();
			int xx = x.poll();
			for(int k=0;k<4;k++){
				int ny = yy + a[k];
				int nx = xx + b[k];
				if(org[ny][nx] && !tmp1[ny][nx]){
					y.offer(ny);
					x.offer(nx);
					tmp1[ny][nx] = true;
				}
			}
		}
	}
	
	void con(int sy, int sx){
		int[][] cost = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				cost[i][j] = Integer.MAX_VALUE;
			}
		}
		cost[sy][sx] = 0;
		
		ArrayDeque<Integer> y = new ArrayDeque<Integer>();
		ArrayDeque<Integer> x = new ArrayDeque<Integer>();
		y.offer(sy);
		x.offer(sx);

		while(!y.isEmpty()){
			int yy = y.poll();
			int xx = x.poll();
			if(ans1[yy][xx]){
				x.clear();
				y.clear();
				x.offer(xx);
				y.offer(yy);
				break;
			}
			for(int k=0;k<4;k++){
				int ny = yy + a[k];
				int nx = xx + b[k];
				if(ny>0 && ny<h-1 && nx>0 && nx<w-1 && cost[yy][xx] + 1 < cost[ny][nx]){
					y.offer(ny);
					x.offer(nx);
					cost[ny][nx] = cost[yy][xx] + 1;
				}
			}
		}
		
		while(!y.isEmpty()){
			int yy = y.poll();
			int xx = x.poll();
			if(cost[yy][xx]==0){
				break;
			}
			for(int k=0;k<4;k++){
				int ny = yy + a[k];
				int nx = xx + b[k];
				if(ny>0 && ny<h-1 && nx>0 && nx<w-1 && cost[yy][xx]-1==cost[ny][nx]){
					y.offer(ny);
					x.offer(nx);
					ans1[ny][nx] = true;
					break;
				}
			}
		}
		
	}
	
}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int h = sc.nextInt();
			int w = sc.nextInt();

			if (h == 0 || w == 0) {
				break;
			}

			int map[][] = new int[h][w];
			for(int i = 0 ;i < h ; i++){
				for(int j = 0 ; j < w;  j++){
					map[i][j] = sc.nextInt();
				}
			}
		
			int max = 0;
			for(int d = 1 ;d <= 9 ; d++){
				max = Math.max(findMax(map,d),max);
			}
			System.out.println(max);
		}
	}
	
	int findMax(int[][] map, int d){
		int max = 0;
		for(int i = 1; i < map.length-1; i ++){
			for(int j = 1 ; j < map[0].length-1;j++){
				for(int k = i; k < map.length-1; k++){
					for(int l = j ; l < map[0].length-1;l++){
						int value = makePond(map,i,j,k,l,d);
		//				System.out.println(i+" "+j+" "+k+" "+l+" "+d+" "+value);
						max = Math.max(max, value);
					}
				}
			}
		}
		return max;
	}
	
	int makePond(int map[][],int i,int j, int k,int l,int d){
		int[] x = {i-1,k+1};
		int[] y = {j-1,l+1};
		int res = 0;
		for(int xx : x){
			for(int jj = j -1; jj <= l+1;jj++){
				if(map[xx][jj] < d){
					return 0;
				}
			}
		}
		for(int yy: y){
			for(int ii = i - 1; ii <= k+1; ii++){
				if(map[ii][yy] < d){
					return 0;
				}
			}
		}
		
		for(int ii = i; ii <= k;ii++){
			for(int jj = j ; jj <= l;jj++){
				if(map[ii][jj]>=d){
					return 0;
				}
				res += d-map[ii][jj];
			}
		}
	
		return res;
	}

}


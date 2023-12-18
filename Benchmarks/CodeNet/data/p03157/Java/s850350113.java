import java.math.BigInteger;
import java.util.*;

public class Main {
	int INF = 1 << 29;
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int h = sc.nextInt();
			int w = sc.nextInt();
			char [][] data = new char[h][w];
			for(int i = 0; i < h; i++){
				data[i] = sc.next().toCharArray();
			}
			long [][] pass = new long[h*w][h*w];
			for(int i = 0; i < pass.length; i++){
				Arrays.fill(pass[i], INF);
				pass[i][i] = 0;
			}
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
		
					if(j != w-1 && data[i][j] != data[i][j+1]){
						pass[i * w + j][i * w + j + 1] = 1;
						pass[i * w + j+1][i * w + j] = 1;
					}
					if(i != h - 1 && data[i][j] != data[i+1][j]){
						pass[i * w + j][(i+1) * w + j] = 1;
						pass[(i+1) * w + j][i * w + j] = 1;
					}
				}
			}
			
			int n = pass.length;
			for(int j = 0; j < n; j++){
				for(int i = 0; i < n; i++){
					for(int k = 0; k < n; k++){
						pass[i][k] = Math.min(pass[i][k], pass[i][j] + pass[j][k]);
					}
				}
			}
			
			
			long count = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(data[i][j] == '.') continue;
					for(int yy = 0; yy < h; yy++){
						for(int xx = 0; xx < w; xx++){
							if(data[yy][xx] == data[i][j]) continue;
							if((Math.abs(yy - i) + Math.abs(xx - j)) % 2 == 0) continue;
							if(pass[i * w + j][yy * w + xx] < INF){
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
			
		}
	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}

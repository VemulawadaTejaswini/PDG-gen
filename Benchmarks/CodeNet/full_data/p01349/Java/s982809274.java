import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			char [][] data = new char[h][w];
			for(int i = 0; i < h; i++){
				data[i] = sc.next().toCharArray();
			}
			boolean flg = false;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w-1; j++){
					if(data[i][j] == data[i][j + 1])continue;
					
					char c = data[i][j];
					data[i][j] = data[i][j +1];
					data[i][j + 1] = c;
					
					boolean res = check(data,w,h,n);
					if(res){
						flg = true;
					}
					
					c = data[i][j];
					data[i][j] = data[i][j +1];
					data[i][j + 1] = c;
				}
			}
			System.out.println(flg ? "YES" : "NO");
		}
	}
	
	private boolean check(char[][] data, int w, int h, int n) {
		char [][] work = new char[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				work[i][j] = data[i][j];
			}
		}
		boolean update = true;
		while(update){
			update = false;
			boolean [][] iserase = new boolean[h][w];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(work[i][j] == '.') continue;
					int count = 0;
					for(int k = j; k < w; k++){
						if(work[i][j] == work[i][k]){
							count++;
						}
						else{
							break;
						}
					}
					if(count >= n){
						for(int k = j; k < w; k++){
							if(work[i][j] == work[i][k]){
								iserase[i][k] = true;
							}
							else{
								break;
							}
						}
					}
					
					count = 0;
					for(int k = i; k < h; k++){
						if(work[i][j] == work[k][j]){
							count++;
						}
						else{
							break;
						}
					}
					if(count >= n){
						for(int k = i; k < h; k++){
							if(work[i][j] == work[k][j]){
								iserase[k][j] = true;
							}
							else{
								break;
							}
						}
					}
				}
			}
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(iserase[i][j]){
						update = true;
						work[i][j] = '.';
					}
				}
			}
			
			for(int i = 0; i < w; i++){
				int ind = h-1;
				for(int j = h-1; j >= 0; j--){
					if(work[j][i] != '.'){
						work[ind][i] = work[j][i];
						ind--;
					}
				}
				for(; ind >= 0; ind--){
					work[ind][i] = '.';
				}
			}
		}
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(work[i][j] != '.') return false;
			}
		}
		
		return true;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}
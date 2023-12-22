import java.util.*;

public class Main{
	
	int [] vx = {0,0,1,0,-1, 1, 1, -1, -1};
	int [] vy = {0,1,0,-1,0, 1, -1, -1, 1};
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		int n = 9;
		boolean first = true;
		while(dataset-- > 0){
			if(first){
				first = false;
			}
			else{
				System.out.println();
			}
			int [][] data = new int[n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					data[i][j] = sc.nextInt();
				}
			}
			boolean [][] illegal = new boolean[n][n];
			//よこ
			for(int i = 0; i < n; i++){
				int [] freq = new int[10];
				for(int j = 0; j < n; j++){
					int nownum = data[i][j];
					freq[nownum]++; 
				}
				for(int j = 1; j <= 9; j++){
					if(freq[j] >= 2){
						for(int k = 0; k < n; k++){
							if(data[i][k] == j){
								illegal[i][k] = true;
							}
						}
					}
				}
			}
			
			
			//たて
			for(int w = 0; w < n; w++){
				int [] freq = new int[10];
				for(int h = 0; h < n; h++){
					freq[data[h][w]]++;
				}
				for(int j = 1; j <= 9; j++){
					if(freq[j] >= 2){
						for(int hh = 0; hh < n; hh++){
							if(data[hh][w] == j){
								illegal[hh][w] = true;
							}
						}
					}
				}
			}
			
			
			//エリア
			for(int y = 1; y < n; y += 3){
				for(int x = 1; x < n; x+= 3){
					int [] freq = new int[10];
					for(int i = 0; i < vx.length; i++){
						int xx = x + vx[i];
						int yy = y + vy[i];
						freq[data[yy][xx]]++;
					}
					
					for(int j = 1; j <= 9; j++){
						if(freq[j] >= 2){
							for(int k = 0; k < vx.length; k++){
								int xx = x + vx[k];
								int yy = y + vy[k];
								if(data[yy][xx] == j){
									illegal[yy][xx] = true;
								}
							}
						}
					}
				}
			}
			
			
			//print
			StringBuilder ans = new StringBuilder();
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(illegal[i][j]){
						ans.append("*");
					}
					else{
						ans.append(" ");
					}
					ans.append(data[i][j]);
				}
				ans.append("\n");
			}
			System.out.print(ans.toString());
		}
	}
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}
import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int u = sc.nextInt();
			int v = sc.nextInt();
			int m = sc.nextInt();
			int [][] hash = new int[2][1000000 + 1];
			for(int i = 0; i < 2; i++){
				Arrays.fill(hash[i], -1);
			}
			for(int i = 0; i < 2; i++){
				for(int j = 0; j < n; j++){
					for(int k = 0; k < n; k++){
						int num = sc.nextInt();
						hash[i][num] = j * n +  k;
					}
				}
			}
			int [] count = new int[2];
			int [][] hcount = new int[2][n];
			int [][] wcount = new int[2][n];
			int [][] crossC = new int[2][2];
			boolean flg = false;
			while(m-- > 0){
				int mi = sc.nextInt();
				for(int i = 0; i < 2; i++){
					int pos = hash[i][mi];
					if(pos == -1) continue;
					int xpos = pos % n;
					int ypos = pos / n;
					hcount[i][ypos]++;
					if(hcount[i][ypos] == n){
						count[i]++;
					}
					wcount[i][xpos]++;
					if(wcount[i][xpos] == n){
						count[i]++;
					}
					if(xpos == ypos){
						crossC[i][0]++;
						if(crossC[i][0] == n){
							count[i]++;
						}
					}
					if(xpos + ypos == n-1){
						crossC[i][1]++;
						if(crossC[i][1] == n){
							count[i]++;
						}
					}
					if(n == 1 && count[i] >= 2){
						count[i] = 1;
					}
				}
				
				if(count[0] >= u && count[1] >= v){
					System.out.println("DRAW");
					flg = true;
					break;
				}
				else if(count[0] >= u){
					System.out.println("USAGI");
					flg = true;
					break;
				}
				else if(count[1] >= v){
					System.out.println("NEKO");
					flg = true;
					break;
				}
			}
			if(! flg){
				System.out.println("DRAW");
			}
			while(m-- > 0){
				sc.next();
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}
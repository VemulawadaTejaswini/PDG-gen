import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int h, w;
	public void run(){
		h = sc.nextInt();
		w = sc.nextInt();
		solve();
	}
	public void solve(){
		boolean ans = true;
		char memo[][] = new char [h][w];
		for(int i = 0; i < h; i++){
			String line = sc.next();
			for(int j = 0; j < w; j++){
				String s = line.substring(j, j+1);
				if(s.equals(".")){
					memo[i][j] = 0;
				}
				else{
					memo[i][j] = 1;
				}
			}
		}
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(memo[i][j] == 1){
					int flag = 0;
					int x[] = {i-1, i, i, i+1};
					int y[] = {j, j-1, j+1, j};
					for(int k = 0; k < 4; k++){
						int ii = x[k];
						int jj = y[k];
						if(ii > -1 && jj > -1 && ii < h && jj < w){
							if(memo[ii][jj] == 1){
								flag = 1;
								break;
							}
						}
					}
					if(flag == 0){
						ans = false;
						break;
					}
				}
			}
			if(!ans) break;
		}
		if(ans) System.out.println("Yes");
		else System.out.println("No");
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
	static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }	
}

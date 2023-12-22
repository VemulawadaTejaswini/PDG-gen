import java.util.*;

public class Main {
	int r, c, ans;
	int[][] map;
	
	void loop(int z){
		if(z==r) check();
		else{
			loop(z+1);
			for(int i=0;i<c;i++) map[z][i] = 1-map[z][i];
			loop(z+1);
			for(int i=0;i<c;i++) map[z][i] = 1-map[z][i];
		}
	}
	
	void check(){
		int temp;
		int sum = 0;
		for(int i=0;i<c;i++){
			temp = 0;
			for(int j=0;j<r;j++){
				temp += map[j][i];
			}
			if(temp<=r/2) temp = r-temp;
			sum += temp;
		}
		ans = Math.max(ans, sum);
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			r = sc.nextInt();
			c = sc.nextInt();
			if(r==0 && c==0) break;
			
			map = new int[r][c];
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					map[i][j] = sc.nextInt();
				}
			}
			ans = 0;
			loop(0);
			System.out.println(ans);
		}	
	}
	
	public static void main(String[] args) {
		new Main().solve();	
	}	
}
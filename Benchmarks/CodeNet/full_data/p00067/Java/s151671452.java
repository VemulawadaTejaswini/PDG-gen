import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(sc.hasNext()){
			new aoj0067().doIt();
		}
	}
	class aoj0067 {
		boolean map[][] = new boolean [12][12];
		int movex[] ={0,1,0,-1};
		int movey[] ={1,0,-1,0};
		void dfs(int x,int y){
			map[y][x] = false;
			for(int i = 0;i < 4;i++){
				if(x + movex[i] >= 0 && x + movex[i] < 12 && y + movey[i] >= 0 && y + movey[i] < 12){
					if(map[y + movey[i]][x + movex[i]] == true)dfs(x + movex[i],y + movey[i]);
				}
			}
		}
		void doIt() {
			int result = 0;
			for(int i = 0;i < 12;i++){
				String str = sc.next();
				char ctr[] = str.toCharArray();
				for(int j = 0;j < 12;j++){
					if(ctr[j] == '1')map[i][j] = true;
					else map[i][j] = false;
				}
			}
			for(int i = 0;i < 12;i++){
				for(int j = 0;j < 12;j++){
					if(map[i][j] == true){
						dfs(j,i);
						result++;
					}
				}
			}
			System.out.println(result);
		}
	}
}
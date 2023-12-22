import java.util.*;

public class Main{
	
	//1420 start
	
	HashSet<String> appear;
	char [][] data;
	String ans;
	int h,w;
	int [] vx = {0,1,0,-1,1,1,-1,-1};
	int [] vy = {1,0,-1,0,1,-1,-1,1};
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			h = sc.nextInt();
			w = sc.nextInt();
			if((h|w) == 0) break;
			
			data = new char[h][w];
			for(int i = 0; i < h; i++){
				String s = sc.next();
				data[i] = s.toCharArray();
			}
			ans = "";
			appear = new HashSet<String>();
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					
					solve(i, j);
				}
			}
			System.out.println(ans.equals("") ? 0 : ans);
		}
	}

	private void solve(int y, int x) {
		
		for(int i = 0; i < 8; i++){
			StringBuilder sb = new StringBuilder();
			sb.append(data[y][x]);
			int xx = x, yy = y;
			while(true){
				xx = (xx + vx[i] + w) % w;
				yy = (yy + vy[i] + h) % h;
				if(xx == x && yy == y){
					break;
				}
				sb.append(data[yy][xx]);
				
				if(appear.contains(sb.toString())){
					
					String now = sb.toString();
					//System.out.println("now = " + now);
					if(now.length() > ans.length()){
						ans = now;
					}
					else if(now.length() == ans.length() && now.compareTo(ans) < 0){
						ans = now;
					}
				}
				else{
					appear.add(sb.toString());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().doit();
	}
}
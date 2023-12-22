
import java.util.*;
public class Main {
	int INF = 1 <<24;
	class C{
		int x,y;

		public C(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if((w|h) == 0)break;
			int sx = -1, sy = -1, gx = -1, gy = -1;
			ArrayList<ArrayList<C>> data = new ArrayList<ArrayList<C>>();
			for(int i = 0; i <= 5; i++){
				data.add(new ArrayList<Main.C>());
			}
			for(int i = 0; i < h; i++){
				String s = sc.next();
				for(int j=0; j < w; j++){
					char c = s.charAt(j);
					if(Character.isDigit(c)){
						data.get(c - '0').add(new C(j, i));
					}
					else if(c == 'S'){
						sx = j;
						sy = i;
					}
					else if(c == 'G'){
						gy = i;
						gx = j;
					}
				}
			}
			
			//NA
			int co = 0;
			int capa = 0;
			for(int i = 1; i < data.size(); i++){
				if(data.get(i).size() > 0){
					co++;
				}
				capa = Math.max(capa, data.get(i).size());
			}
			if(co < 4){
				System.out.println("NA");
				continue;
			}
			
			int min = INF;
			int minind = -1;
			for(int first = 1; first <= 5; first++){
				int [][] dp = new int[6][capa];
				for(int i = 0; i < 6; i++){
					Arrays.fill(dp[i], INF);
				}
				int len = (first == 5 ? 1 : first + 1);
				for(int i = 0; i < data.get(len).size();i++){
					int dis = Math.abs(sx - data.get(len).get(i).x) + Math.abs(sy - data.get(len).get(i).y);
					dp[len][i] = dis;
				}
				
				for(int times = 1; times <= 3; times++){
					int next = (len + times  > 5 ? len + times - 5 : len + times);
					int prev = (next - 1 == 0 ? 5 : next - 1);
					for(int i = 0; i < data.get(prev).size(); i++){
						if(dp[prev][i] == INF) continue;
						for(int j = 0; j < data.get(next).size(); j++){
							int nextdis = dis(data.get(prev).get(i), data.get(next).get(j));
							dp[next][j] = Math.min(dp[next][j], nextdis + dp[prev][i]);
						}
					}
				}
				
				int last = (first - 1 == 0 ? 5 : first  -1);
				int res = INF;
				for(int i = 0; i < data.get(last).size(); i++){
					C pos = data.get(last).get(i);
					int  value = Math.abs(pos.x - gx) + Math.abs(pos.y - gy);
					res = Math.min(res, dp[last][i] + value);
				}
				
				if(res < min){
					minind = first;
					min = res;
				}
			}
			System.out.println(minind + " " + min);
		}
	}


	private int dis(C c, C c2) {
		int res = Math.abs(c.x - c2.x) + Math.abs(c.y - c2.y);
		return res;
	}


	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}
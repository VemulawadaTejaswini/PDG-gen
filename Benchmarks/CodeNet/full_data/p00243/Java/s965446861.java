import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new AOJ0243().doIt();
	}

	class AOJ0243{
		int w,h;
		char[][] map;
		boolean isCome[][];
		HashSet<String> set;
		int sx[]={1,0,-1,0};
		int sy[]={0,1,0,-1};
		void input(String a){
			int num = 0;
			for(int i=0;i<h;i++)for(int s=0;s<w;s++){
				map[i][s] = a.charAt(num);num++;
			}
		}
		void push(int x,int y,char color,char before){
			if(map[y][x]!=before)return;
			if(isCome[y][x])return;
			isCome[y][x] = true;
			map[y][x] = color;
			for(int i=0;i<4;i++){
				int nx = x+sx[i];
				int ny = y+sy[i];
				if(nx<0||nx>=w||ny<0||ny>=h)continue;
				if(map[ny][nx]!=before)continue;
				push(nx, ny, color,before);
			}
		}
		boolean isGoal(){
			char a = map[0][0];
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)if(a!=map[i][s])return false;
			return true;
		}

		void print(char[][] a){
			for(int i=0;i<h;i++){
				for(int s=0;s<w;s++)System.out.print(a[i][s]);
				System.out.println();
			}
		}

		int dfs(int cost){
			if(cost>20)return Integer.MAX_VALUE/2;
			if(isGoal())return cost;
			int result = Integer.MAX_VALUE/2;
			String memo = "";for(int i=0;i<h;i++)for(int s=0;s<w;s++)memo += map[i][s];
			if(set.contains(memo))return Integer.MAX_VALUE;
			set.add(memo);
			if(map[0][0]!='R'){
				isCome = new boolean[h][w];
				push(0, 0, 'R', memo.charAt(0));
//				System.out.println("R=");
//				print(map);System.out.println();
				result = Math.min(result, dfs(cost+1));
				input(memo);
			}
			if(map[0][0]!='G'){
				isCome = new boolean[h][w];
				push(0, 0, 'G', memo.charAt(0));
//				System.out.println("G=");
//				print(map);System.out.println();
				result = Math.min(result, dfs(cost+1));
				input(memo);
			}
			if(map[0][0]!='B'){
				isCome = new boolean[h][w];
				push(0, 0, 'B', memo.charAt(0));
//				System.out.println("B=");
//				print(map);System.out.println();
				result = Math.min(result, dfs(cost+1));
				input(memo);
			}
			return result;
		}
		
		void solved(){
			set = new HashSet<String>();
			System.out.println(dfs(0));
		}

		void doIt(){
			while(in.hasNext()){
				w = in.nextInt();
				h = in.nextInt();
				if(w+h==0)break;
				map = new char[h][w];
				for(int i=0;i<h;i++)for(int s=0;s<w;s++)map[i][s] = in.next().charAt(0);
				solved();
			}
		}

		class State{
			String field;
			int cost;
			public State(char[][] map,int cost){
				field = "";
				for(int i=0;i<h;i++)for(int s=0;s<w;s++)field += map[i][s];
				this.cost = cost;
			}
		}
	}

}
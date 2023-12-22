import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new A().doIt();
	}

	class A{
		int w,h;
		char[][] map;
		char[][] memo;
		boolean wsw,bsw;
		boolean come[][];
		int sx[] = {1,0,-1,0};
		int sy[] = {0,1,0,-1};
		void dfs(int x,int y){
			if(map[y][x]=='W'){
				wsw=true;return;
			}else if(map[y][x]=='B'){
				bsw=true;return;
			}
			if(come[y][x])return;
			come[y][x]=true;
			for(int i=0;i<4;i++){
				int nx=x+sx[i];
				int ny=y+sy[i];
				if(nx<0||nx>=w||ny<0||ny>=h)continue;
				dfs(nx,ny);
			}
		}
		
		void dfs2(int x,int y,char a){
			if(map[y][x]=='W'||map[y][x]=='B')return;
			if(memo[y][x]=='w'||memo[y][x]=='b'||memo[y][x]=='.')return;
			memo[y][x]=a;
			for(int i=0;i<4;i++){
				int nx=x+sx[i];
				int ny=y+sy[i];
				if(nx<0||nx>=w||ny<0||ny>=h)continue;
				dfs2(nx,ny,a);
			}
		}
		
		void solve(){
			memo = new char[h][w];
			for(int i=0;i<h;i++)Arrays.fill(memo[i], ' ');
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)if(memo[i][s]==' '){
				wsw = false;bsw = false;
				come = new boolean[h][w];
				dfs(s,i);
				char target = '.';
				if(wsw&&!bsw)target='w';
				else if(!wsw&&bsw)target='b';
				dfs2(s, i, target);
			}
			
//			for(int i=0;i<h;i++){
//				for(int s=0;s<w;s++)System.out.print(memo[i][s]);
//				System.out.println();
//			}
//			
			int white=0,black=0;
			for(int i=0;i<h;i++)for(int s=0;s<w;s++){
				if(memo[i][s]=='w')white++;
				else if(memo[i][s]=='b')black++;
			}
			System.out.println(black+" "+white);
		}
		
		void doIt(){
			while(in.hasNext()){
				w = in.nextInt(); h = in.nextInt();
				if(w+h==0)break;
				map = new char[h][w];
				for(int i=0;i<h;i++)map[i]= in.next().toCharArray(); 
				solve();
			}


		}
	}

}
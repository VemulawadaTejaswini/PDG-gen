import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;
public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		//		new AOJ0534();
		new AOJ1118();
	}

	class AOJ0534{
		int n;
		int[] memo;
		ArrayList<Integer> list;
		public AOJ0534() {
			while(true){
				n=in.nextInt();
				if(n==0)break;
				doIt();
			}
		}

		void Spoint(){
			for(int i=1;i<n-2;i++){
				if(memo[i]!=memo[i-1]&&memo[i-1]==memo[i+1]&&memo[i+1]==memo[i+2])list.add(i);
			}
			for(int i=2;i<n-1;i++){
				if(memo[i]!=memo[i-1]&&memo[i-1]==memo[i-2]&&memo[i+1]==memo[i-1])list.add(i);
			}
		}

		int bfs(int m[]){
			ArrayList<Integer> l2 = new ArrayList<Integer>();
			for(int i=0;i<m.length;i++)l2.add(m[i]);
			while(true){
				boolean sw=false;
				for(int i=0;i<l2.size()-3;i++){
					//					System.out.println(l2+" "+i);
					if(l2.get(i)==l2.get(i+1)&&l2.get(i)==l2.get(i+2)&&l2.get(i)==l2.get(i+3)){
						int color=l2.get(i);
						//						System.out.println(l2+"::"+i+";;"+color);
						for(;l2.get(i)==color;){
							l2.remove(i);
							if(l2.size()-1==i)break;
						}
						i=0;
					}
					if(l2.size()-4==i)sw=true;
				}
				if(sw)break;
				if(m.length<4)break;
			}
			return l2.size();
		}

		void doIt(){
			list = new ArrayList<Integer>();
			memo = new int[n];
			for(int i=0;i<n;i++)memo[i]=in.nextInt();
			Spoint();
			int cnt=Integer.MAX_VALUE;
			for(int i=0;i<list.size();i++){
				int[] m = memo.clone();
				m[list.get(i)]=m[list.get(i)-1];
				cnt=Math.min(cnt,bfs(m));
			}
			if(cnt==Integer.MAX_VALUE||list.size()==0)System.out.println(n);
			else System.out.println(cnt);
		}
	}

	class AOJ1118{
		int top,bottom,east,west,north,south;
		int[][] map;
		public AOJ1118() {
			int n = in.nextInt();
			while(n-->0)doIt();
		}

		void doIt(){
			top=-1;bottom=-1;east=-1;west=-1;north=-1;south=-1;
			map = new int[5][5];
			boolean used[] = new boolean[7];
			used[0]=true;
			int cnt=0;
			for(int s=0;s<5;s++)for(int i=0;i<5;i++){
				map[s][i]=in.nextInt();
				if(map[s][i]>0){
					if(!used[map[s][i]]){
						used[map[s][i]]=true;
						++cnt;
					}
					else used[0]=false;
				}
			}
			if(!used[0]){
				System.out.println("false");
				return;
			}else if(!(used[1]&&used[2]&&used[3]&&used[4]&&used[5]&&used[6])){
				System.out.println("false");
				return;
			}else if(cnt!=6){
				System.out.println("false");
				return;
			}
			Dice dice = new Dice(1, 3);
			int sx=-1,sy=-1;
			for(int y=0;y<5;y++)for(int x=0;x<5;x++)if(map[y][x]>0&&sx==-1&&sy==-1){
				sx=x;sy=y;
			}
			bfs(sx, sy, dice);
			if(dice.IsDice())System.out.println("true");
			else System.out.println("false");
		}


		void bfs(int x,int y,Dice dice){
//			System.out.println(x+" "+y+" "+dice.toString());
			if(dice.bottom!=-1)return;
			dice.bottom=map[y][x];
			map[y][x]=0;
			int[] nx={1,0,-1,0};//右、下、左、上
			int[] ny={0,1,0,-1};
			for(int i=0;i<4;i++){
				int sx=nx[i]+x;
				int sy=ny[i]+y;
				if(sy>=0&&sy<5&&sx>=0&&sx<5)if(map[sy][sx]>0){
					switch(i){
					case 0:dice.rotateEast();
					       bfs(sx, sy, dice);dice.rotateWest();break;
					case 1:dice.rotateSouth();
					       bfs(sx, sy, dice);dice.rotateNorth();break;
					case 2:dice.rotateWest();
					       bfs(sx, sy, dice);dice.rotateEast();break;
					case 3:dice.rotateNorth();
					       bfs(sx, sy, dice);dice.rotateSouth();break;
					}
				}
			}
			return;
		}

		class Dice{
			private int top=-1,bottom=-1,east=-1,west=-1,north=-1,south=-1;
			public Dice(int t,int s) {
				switch(t){
				case 1: break;
				case 2: rotateEast(); break;
				case 3: rotateNorth(); break;
				case 4: rotateSouth(); break;
				case 5: rotateWest(); break;
				case 6: reverse(); break;
				}
			}
			boolean IsDice(){
				return north+south==7&&top+bottom==7&&west+east==7;
			}
			Dice copy(){
				Dice d = new Dice(top,south);
				d.bottom=bottom;
				d.east=east;
				d.west=west;
				return d;
			}
			Dice rotateEast(){
				int temp=east;east=top;top=west;west=bottom;bottom=temp;
				return this;
			}
			Dice rotateWest(){
				int tmp=west; west=top; top=east; east=bottom; bottom=tmp;
				return this;
			}
			Dice rotateSouth(){
				int tmp=south; south=top; top=north; north=bottom; bottom=tmp;
				return this;
			}
			Dice rotateNorth(){
				int tmp=north; north=top; top=south; south=bottom; bottom=tmp;
				return this;
			}
			Dice reverse(){
				rotateNorth(); rotateNorth(); rotateCW(); rotateCW();
				return this;
			}
			Dice rotateCW(){
				int tmp=north; north=west; west=south; south=east; east=tmp;
				return this;
			}
			Dice rotateCCW(){
				int tmp=north; north=east; east=south; south=west; west=tmp;
				return this;
			}
			int getTop(){
				return top;
			}
			int getBottom(){
				return bottom;
			}
			int getEast(){
				return east;
			}
			int getWest(){
				return west;
			}
			int getSourth(){
				return south;
			}
			int getNorth(){
				return north;
			}
			@Override public String toString(){
				return "top"+top+" north"+north+" east"+east+" south"+south+" west"+west+" bottom"+bottom;
			}
			@Override public boolean equals(Object obj){
				if(obj==this)return true;
				if(!(obj instanceof Dice))return false;
				Dice d = (Dice)obj;
				if(this.top==d.getTop()&&this.bottom==d.getBottom()&&
						this.east==d.getWest()&&this.west==d.getWest()&&
						this.north==d.getNorth()&&this.south==d.getSourth())return true;
				return false;
			}
		}
	}


	class AOJ1156{
		public AOJ1156() {
			while(true){
				int w = in.nextInt();
				int h = in.nextInt();
				if(w+h==0)break;
				int[][] map = new int[h+1][w+1];
				for(int i=1;i<=h;i++)for(int s=1;s<=w;s++)map[i][s]=in.nextInt();
				//直進　右折　反転　左折
				int meirei[] = new int[4];
				for(int i=0;i<4;i++)meirei[i]=in.nextInt();
				Robot robot = new Robot(w, h);
				while(true){//シミュレートしてみる
					int x = robot.x;
					int y = robot.y;
					System.out.println(x+" "+y+" "+map[y][x]);
					if(map[y][x]==0)robot.fd();
					else if(map[y][x]==1)robot.right();
					else if(map[y][x]==2)robot.back();
					else if(map[y][x]==3)robot.left();
					else if(map[y][x]==4)break;
					robot.cost++;
					robot.map[y][x]=robot.cost;
				}

				//				for(int i=1;i<=h;i++){
				//					for(int s=1;s<=w;s++)System.out.print(robot.map[i][s]+" ");
				//					System.out.println();
				//				}


			}
		}

		class Robot{
			int x,y,muki,cost;
			//0左 1下 2右 3上
			int nx[] = {-1,0,1,0};
			int ny[] = {0,1,0,-1};
			int[][] map;
			public Robot(int w,int h) {
				muki=2;
				x=1;y=1;
				cost=0;
				map = new int[h+1][w+1];
			}

			void fd(){
				x+=nx[muki];
				y+=ny[muki];
			}
			void right(){
				muki=(muki+3)%4;
				fd();
			}
			void left(){
				muki=(muki+1)%4;
				fd();
			}
			void back(){
				muki=(muki+2)%4;
				fd();
			}

		}
	}
}
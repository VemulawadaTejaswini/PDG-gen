import java.awt.geom.Point2D;
import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ1032().doIt();
	}
	
	class AOJ1032{
		int n;
		Pair[] pair;
		int[] sx = {-1,0,1,-2,-2,-2,2,2,2,-1,0,1};
		int[] sy = {-2,-2,-2,-1,0,1,-1,0,1,2,2,2};
		void doIt(){
			while(true){
				int x = in.nextInt();
				int y = in.nextInt();
				if(x==0&&y==0)return;
				n = in.nextInt();
				pair = new Pair[n];
				for(int i=0;i<n;i++)pair[i] = new Pair(in.nextInt(), in.nextInt());
				System.out.println(solve(x, y)?"OK":"NA");
			}
		}
		
		boolean dfs(int x,int y,int index){
//			System.out.println(x+" "+y+" "+index);
			if(index==n)return true;
			for(int i=0;i<sx.length;i++){
				int nx = x+sx[i];
				int ny = y+sy[i];
				if(nx<0||nx>=10||ny<0||ny>=10)continue;
//				System.out.println(nx+" "+ny);
//				System.out.println(new Point2D.Double(nx, ny).distance(new Point2D.Double(x,y)));
				if(new Point2D.Double(nx, ny).distance(new Point2D.Double(pair[index].x,pair[index].y))<1.5){
					if(dfs(nx, ny, index+1))return true;
				}
			}
			return false;
		}
		
		boolean solve(int x,int y){
			if(dfs(x, y, 0))return true;
			return false;
		}
		
		class Pair{
			int x,y;
			public Pair(int x,int y) {
				this.x = x;
				this.y =y;
			}
		}
	}
	
}
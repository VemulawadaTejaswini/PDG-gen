import java.util.Scanner;
public class Main{
	static int n;
	static int gx,ex;
	static int gy,ey;
	static int[][][] memo;
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		while(true){
			n =sc.nextInt();	
			if(n==0)break;
			String start=sc.next();
			String end=sc.next();
			String not=sc.next();
			int room[][][]=new int[n][2][2];
			int x=0,y=0;
			if(start.equals("B"))
				x=1;
			else if(start.equals("C"))
				x=2;
			else if(start.equals("D"))
				x=1;
			else if(start.equals("E")){
				x=1;y=1;
			}else if(start.equals("F")){
				x=1;y=2;
			}else if(start.equals("G"))
				x=2;
			else if(start.equals("H")){
				x=2;y=1;
			}else if(start.equals("I")){
				x=2;y=2;
			}
			gx=0;gy=0;
			if(end.equals("B"))
				gx=1;
			else if(end.equals("C"))
				gx=2;
			else if(end.equals("D"))
				gx=1;
			else if(end.equals("E")){
				gx=1;gy=1;
			}else if(end.equals("F")){
				gx=1;gy=2;
			}else if(end.equals("G"))
				gx=2;
			else if(end.equals("H")){
				gx=2;gy=1;
			}else if(end.equals("I")){
				gx=2;gy=2;
			}
			ex=0;ey=0;
			if(not.equals("B"))
				ex=1;
			else if(not.equals("C"))
				ex=2;
			else if(not.equals("D"))
				ex=1;
			else if(not.equals("E")){
				ex=1;ey=1;
			}else if(not.equals("F")){
				ex=1;ey=2;
			}else if(not.equals("G"))
				ex=2;
			else if(not.equals("H")){
				ex=2;ey=1;
			}else if(not.equals("I")){
				ex=2;ey=2;
			}
			memo=new int[3][3][n+1];
			System.out.printf("%.9f\n",(double)dfs(x,y,0)/Math.pow(4, n));
//			Math.pow(4, n)
			
		}
	}
	static int sx[]={1,0,-1,0};
	static int sy[]={0,1,0,-1};
	
	static int dfs(int x, int y, int battery){
//		System.out.println(x+" "+y+" "+battery);
		
		if(memo[x][y][battery]>0)return memo[x][y][battery];
		int result = 0;
		if(battery==n){
			if(gx==x&&gy==y)return 1;
			else return 0;
		}
		for(int i=0;i<4;i++){
			int nx=x+sx[i];int ny=y+sy[i];
			if(nx<0||nx>2||ny<0||ny>2||(nx==ex&&ny==ey))result+=dfs(x,y,battery+1);
			else result+=dfs(nx,ny,battery+1);
		}
		return memo[x][y][battery]=result;
	}
}
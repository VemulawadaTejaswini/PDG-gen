import java.util.*;
public class Main {
	static int[][] map = new int[10][10];
	static void syou(int x,int y){
		int xhou[]={-1,0,1,0};
		int yhou[]={0,-1,0,1};
		for(int i=0;i<4;i++){
			int nx=xhou[i]+x;
			int ny=yhou[i]+y;
			if(nx<0||nx>=10||ny<0||ny>=10)continue;
			map[ny][nx]+=1;
		}
		map[y][x]+=1;
	}
	static void tyuu(int x,int y){
		for(int i=-1;i<=1;i++){
			for(int s=-1;s<=1;s++){
				int nx=x+s;
				int ny=y+i;
				if(nx<0||nx>=10||ny<0||ny>=10)continue;
				map[ny][nx]+=1;
			}
		}
	}
	static void dai(int x,int y){
		for(int i=-1;i<=1;i++){
			for(int s=-1;s<=1;s++){
				int nx=x+s;
				int ny=y+i;
				if(nx<0||nx>=10||ny<0||ny>=10)continue;
				map[ny][nx]+=1;
			}
		}
		int xhou[]={-2,0,2,0};
		int yhou[]={0,-2,0,2};
		for(int i=0;i<4;i++){
			int nx=xhou[i]+x;
			int ny=yhou[i]+y;
			if(nx<0||nx>=10||ny<0||ny>=10)continue;
			map[ny][nx]+=1;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(int i=0;i<10;i++)for(int s=0;s<10;s++)map[i][s]=0;
		while(in.hasNext()){
			String text=in.next();
			int x=text.charAt(0)-'0';
			int y=text.charAt(2)-'0';
			int kosa =text.charAt(4)-'0';
			switch(kosa){
			case 1:
				syou(x,y);
				break;
			case 2:
				tyuu(x,y);
				break;
			case 3:
				dai(x,y);
				break;
			}
		}
		int cnt=0,big=0;
		for(int i=0;i<10;i++){
			for(int s=0;s<10;s++){
				if(map[i][s]==0)cnt++;
				big=Math.max(big, map[i][s]);
			}
		}
		System.out.println(cnt);
		System.out.println(big);
	}
}
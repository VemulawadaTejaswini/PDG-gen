import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static byte h,w,c;
	static int max;
	static byte[][] panel;
	static byte[] v1={0,1,0,-1};
	static byte[] v2={1,0,-1,0};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			h=cin.nextByte();
			w=cin.nextByte();
			c=cin.nextByte();
			max=-1;
			if(h+w+c==0)break;
			panel=new byte[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					panel[i][j]=cin.nextByte();
				}
			}
			bt(0);
			System.out.println(max);
		}
	}
	static void bt(int depth){
		if(depth==4){
			if(panel[0][0]==c){
				max=Math.max(count(),max);
				return;
			}
			byte[][] cp = new byte[h][w];
			for(int k=0;k<h;k++){
				for(int j=0;j<w;j++){
					cp[k][j]=panel[k][j];
				}
			}
			int color=panel[0][0];
			Queue<byte[]> q=new LinkedList<byte[]>();
			q.add(new byte[]{0,0});
			while(!q.isEmpty()){
				byte[] aaa=q.poll();
				byte x=aaa[0];
				byte y=aaa[1];
				if(panel[x][y]!=color)continue;
				panel[x][y]=c;
				for(int j=0;j<4;j++){
					byte xx=(byte) (x+v1[j]);
					byte  yy=(byte) (y+v2[j]);
					if(xx<0||yy<0||xx>=h||yy>=w)continue;
					if(panel[xx][yy]!=color)continue;
					q.add(new byte[]{xx,yy});
				}
			}
			max=Math.max(count(),max);
			for(int k=0;k<h;k++){
				for(int j=0;j<w;j++){
					panel[k][j]=cp[k][j];
				}
			}
			return;
			
		}
		for(byte i=1;i<=6;i++){
			if(panel[0][0]==i)continue;
			byte[][] cp = new byte[h][w];
			for(int k=0;k<h;k++){
				for(int j=0;j<w;j++){
					cp[k][j]=panel[k][j];
				}
			}
			int color=panel[0][0];
//			int count=count();
			Queue<byte[]> q=new LinkedList<byte[]>();
			q.add(new byte[]{0,0});
			while(!q.isEmpty()){
				byte[] aaa=q.poll();
				byte x=aaa[0];
				byte y=aaa[1];
				if(panel[x][y]!=color)continue;
				panel[x][y]=i;
				for(int j=0;j<4;j++){
					byte xx=(byte) (x+v1[j]);
					byte  yy=(byte) (y+v2[j]);
					if(xx<0||yy<0||xx>=h||yy>=w)continue;
					if(panel[xx][yy]!=color)continue;
					q.add(new byte[]{xx,yy});
				}
			}
//			if(count!=count())
				bt(depth+1);
			for(int k=0;k<h;k++){
				for(int j=0;j<w;j++){
					panel[k][j]=cp[k][j];
				}
			}
			
		}
	}
	static int count(){
		int ans=0;
		byte[][] cp = new byte[h][w];
		for(int k=0;k<h;k++){
			for(int j=0;j<w;j++){
				cp[k][j]=panel[k][j];
			}
		}
		Queue<byte[]> q=new LinkedList<byte[]>();
		q.add(new byte[]{0,0});
		while(!q.isEmpty()){
			
			byte[] aaa=q.poll();
			byte x=aaa[0];
			byte y=aaa[1];
			if(cp[x][y]==-1)continue;
			cp[x][y]=-1;
			ans++;
			for(int j=0;j<4;j++){
				byte xx=(byte) (x+v1[j]);
				byte yy=(byte) (y+v2[j]);
				if(xx<0||yy<0||xx>=h||yy>=w)continue;
				if(cp[xx][yy]!=c)continue;
				q.add(new byte[]{xx,yy});
			}
		}
		return ans;
	}
}
import java.util.*;
import java.text.*;

public class Main {
	static class Status{
		int nx,ny,gx,gy,step;
		int[][] field;
		public Status(int x1,int y1,int x2,int y2,int st,int[][] fld){
			nx = x1;
			ny = y1;
			gx = x2;
			gy = y2;
			step = st;
			field = fld;
		}
	}
	
	public static int[][] makefield(Scanner in, int[][] field, int h, int w){
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				field[i][j] = in.nextInt();
			}
		}
		return field;
	}
		
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int w = in.nextInt();
			int h = in.nextInt();
			if((w|h)==0) break;
			int[][] field = new int[h][w];
			field = makefield(in,field,h,w);
			LinkedList<Status> queue = new LinkedList<Status>();
			int sx=0,sy=0,gx=0,gy=0;
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					if(field[i][j]==2){
						sx=i;
						sy=j;
					}else if(field[i][j]==3){
						gx=i;
						gy=i;
					}
				}
			}
			queue.add(new Status(sx,sy,gx,gy,0,field));
			int minstep = Integer.MAX_VALUE;
			while(!queue.isEmpty()){
				Status now = queue.poll();
				if(now.step<10){
					//x++
					boolean checked = false;
					for(int i=1; now.nx+i<h; i++){
						if(now.field[now.nx+i][now.ny]==1){
							if(i!=1){
								int[][] fld = now.field.clone();
								fld[now.nx+i][now.ny] = 0;
								queue.add(new Status(now.nx+i-1,now.ny,gx,gy,now.step+1,fld));
							}
							checked = true;
						}else if(now.field[now.nx+i][now.ny]==3){
							minstep = now.step+1;
							checked = true;
						}
						if(checked) break;
					}
					checked = false;
					//x--
					for(int i=1; now.nx-i>=0; i++){
						if(now.field[now.nx-i][now.ny]==1){
							if(i!=1){
								int[][] fld = now.field.clone();
								fld[now.nx-i][now.ny] = 0;
								queue.add(new Status(now.nx-i+1,now.ny,gx,gy,now.step+1,fld));
							}
							checked = true;
						}else if(now.field[now.nx-i][now.ny]==3){
							minstep = now.step+1;
							checked = true;
						}
						if(checked) break;
					}
					checked = false;
					//y++
					for(int i=1; now.ny+i<w; i++){
						if(now.field[now.nx][now.ny+i]==1){
							if(i!=1){
								int[][] fld = now.field.clone();
								fld[now.nx][now.ny+i] = 0;
								queue.add(new Status(now.nx,now.ny+i-1,gx,gy,now.step+1,fld));
							}
							checked = true;
						}else if(now.field[now.nx][now.ny+i]==3){
							minstep = now.step+1;
							checked = true;
						}
						if(checked) break;
					}
					checked = false;
					//y--
					for(int i=1; now.ny-i>=0; i++){
						if(now.field[now.nx][now.ny-i]==1){
							if(i!=1){
								int[][] fld = now.field.clone();
								fld[now.nx][now.ny-i] = 0;
								queue.add(new Status(now.nx,now.ny-i+1,gx,gy,now.step+1,fld));
							}
							checked = true;
						}else if(now.field[now.nx][now.ny-i]==3){
							minstep = now.step+1;
							checked = true;
						}
						if(checked) break;
					}					
				}
			}
			if(minstep == Integer.MAX_VALUE) System.out.println("-1");
			else System.out.println(minstep);
		}
	}
}
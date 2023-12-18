import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int h,w;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h=sc.nextInt();
		w=sc.nextInt();
		char[][] array = new char[h][w];
		for(int i=0;i<h;i++) 	array[i] = sc.next().toCharArray();
		sc.close();
		int max=0;
		int[] dx={-1,0,1,0}, dy={0,1,0,-1};
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(array[i][j]=='#') continue;
				Queue<Integer> q = new ArrayDeque<>();
				Set<Integer> closed = new HashSet<>();
				int[][] distarray = new int[h][w];
				int distance=0;
				q.add(id(i,j));
				distarray[i][j]=0;
				while(!q.isEmpty()) {
					int now = q.poll();
					if(now>=h*w) break;
					closed.add(now);
					int y = now%w;
					int x = (now-y)/w;
					for(int k=0;k<4;k++) {
						if(x+dx[k]>=0 && x+dx[k]<h && y+dy[k]>=0 && y+dy[k]<w) {
							if(array[x+dx[k]][y+dy[k]]=='.') {
								int id = id(x+dx[k],y+dy[k]);
								if(!closed.contains(id)) {
									q.add(id);
									distarray[x+dx[k]][y+dy[k]]=distarray[x][y]+1;
									if(distarray[x][y]+1>distance) distance=distarray[x][y]+1;
								}
							}
						}
					}
				}
				if(distance>max) max = distance;
			}
		}
		System.out.println(max);
	}
	static int id(int x, int y) {
		return x*w+y;
	}
}
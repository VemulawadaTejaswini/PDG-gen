import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int w = sc.nextInt();
			int h = sc.nextInt();
			int[][] map = new int[h][w];
			int ty = -1;
			int tx = -1;
			for(int i=0;i<h;i++){
				String s = sc.next();
				for(int j=0;j<w;j++){
					if(s.charAt(j)=='.') map[i][j] = -1;
					else if(s.charAt(j)=='#') map[i][j] = -2;
					else {
						map[i][j] = -1;
						ty = i;
						tx = j;
					}
				}
			}
			
			int n = sc.nextInt();
			int[][] xy = new int[n+1][2];
			for(int i=1;i<=n;i++){
				xy[i][0] = sc.nextInt();
				xy[i][1] = sc.nextInt();
			}
			
			ArrayDeque<Integer> x = new ArrayDeque<Integer>();
			ArrayDeque<Integer> y = new ArrayDeque<Integer>();
			int ans = -1;
			int[] a = new int[]{1,-1,0,0};
			int[] b = new int[]{0,0,1,-1};
			for(int z=0;z<=n;z++){
				x.offer(xy[z][0]);
				y.offer(xy[z][1]);
				while(!x.isEmpty()){
					int px = x.poll();
					int py = y.poll();
					map[py][px] = z;			
					for(int k=0;k<4;k++){
						int qx = px + a[k];
						int qy = py + b[k];
						if(0<=qy && qy<h && 0<=qx && qx<w && map[qy][qx]!=-2){
							if(map[qy][qx]==-1){
								y.offer(qy);
								x.offer(qx);
							}else if(map[qy][qx]!=z){
								int tmp = map[qy][qx];
								for(int i=0;i<h;i++){
									for(int j=0;j<w;j++){
										if(map[i][j]==tmp) map[i][j] = z;
									}
								}
							}
						}
					}
				}
				if(map[0][0]==map[ty][tx]){
					ans = z;
					break;
				}
			}
			System.out.println(ans);
		}
	}

}
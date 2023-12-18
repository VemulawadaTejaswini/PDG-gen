import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		execute2();
	}
	
	private static void execute2() {
		try (Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			String[] a = new String[H];
			int[] di = {0,-1,1,0};
			int[] dj = {1,0,0,-1};
			
			for(int i=0; i<H;i++) {
				a[i] = sc.next();
			}
			
			
			
			int ans = 0;
			for(int i =0; i<W; i++) {
				for(int j=0;j<H;j++) {
					int maxdist = 0;
					int dist[][] = new int[H][W];
					for(int m=0;m<H;m++) {
						for(int n=0;n<W;n++) dist[m][n]=Integer.MAX_VALUE;
					}
					
					char c = a[j].charAt(i);
					if(c=='#') continue;
					Queue<List<Integer>> q = new ArrayDeque<>();
					q.add(Arrays.asList(j,i));
					dist[j][i]=0;
					while(!q.isEmpty()) {
						List<Integer> l=q.poll();
						int nj= l.get(0);
						int ni = l.get(1);
						maxdist = Math.max(maxdist, dist[nj][ni]);
						for(int d=0;d<4;++d) {
							int mj=nj+dj[d];
							int mi=ni+di[d];
							if(mj>=H||mj<0||mi>=W||mi<0) continue;
							if(a[mj].charAt(mi)=='.' && dist[mj][mi]==Integer.MAX_VALUE) {
								q.add(Arrays.asList(mj,mi));
								dist[mj][mi] = dist[nj][ni]+1;
							}
						}
					}
					ans = Math.max(ans, maxdist);
				}
			}
			System.out.println(ans);
		}
	}
}
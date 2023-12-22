import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0) break;
			
			int[][] map = new int[h][w];
			int gx = -1;
			int gy = -1;
			for(int i=0;i<h;i++){
				char[] c = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					if(c[j]=='#') map[i][j] = 1;
					else if(c[j]=='&'){
						gx = j;
						gy = i;
					}
				}
			}
			
			int[][] cnt = new int[h][w];
			for(int i=0;i<h;i++) Arrays.fill(cnt[i], Integer.MAX_VALUE);
			
			LinkedList<Integer> sxlist = new LinkedList<Integer>();
			LinkedList<Integer> sylist = new LinkedList<Integer>();
			for(int i=0;i<h;i++){
				sxlist.add(0);
				sxlist.add(w-1);
				sylist.add(i);
				sylist.add(i);
			}
			for(int i=1;i<w-1;i++){
				sxlist.add(i);
				sxlist.add(i);
				sylist.add(0);
				sylist.add(h-1);
			}
			
			int[] a = new int[]{0,0,1,-1};
			int[] b = new int[]{1,-1,0,0};
			while(sxlist.size()!=0){
				boolean[][] vst = new boolean[h][w];
				int p = sxlist.pollLast();
				int q = sylist.pollLast();
				ArrayDeque<Integer> x = new ArrayDeque<Integer>();
				ArrayDeque<Integer> y = new ArrayDeque<Integer>();
				x.offer(p);
				y.offer(q);
				cnt[q][p] = map[q][p];
				while(x.size()!=0){
					p = x.poll();
					q = y.poll();
					if(p==gx && q==gy) break;
					vst[q][p] = true;
					for(int i=0;i<4;i++){
						int u = p+a[i];
						int v = q+b[i];
						if(0<=u && u<w && 0<=v && v<h){
							if(vst[v][u]==false && cnt[v][u] > cnt[q][p] + map[v][u]){
								x.offer(u);
								y.offer(v);
								cnt[v][u] = cnt[q][p] + map[v][u];
							}
						}
					}
				}
			}
			System.out.println(cnt[gy][gx]);
		}	
	}	
}
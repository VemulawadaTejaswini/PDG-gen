import java.util.*;

public class Main {
	ArrayList<int[]> list;
	ArrayDeque<int[]> que;
	int[] a = new int[]{1,-1,0,0};
	int[] b = new int[]{0,0,1,-1};
	int[] c = new int[]{1,-1};
	
	boolean contain(int[] a){
		for(int[] b : list){
			if(a[0]==b[0] && a[1]==b[1] && a[2]==b[2] && a[3]==b[3]) return true;
		}
		return false;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0) break;
			int tx = sc.nextInt()-1;
			int ty = sc.nextInt()-1;
			int kx = sc.nextInt()-1;
			int ky = sc.nextInt()-1;
			boolean[][] map = new boolean[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					int tmp = sc.nextInt();
					if(tmp==1) map[i][j] = true;
				}
			}
			list = new ArrayList<int[]>();
			que = new ArrayDeque<int[]>();
			list.add(new int[]{tx,ty,kx,ky,0});
			que.add(new int[]{tx,ty,kx,ky,0});
			boolean f = false;
			int[] x = new int[2];
			int[] y = new int[2];
			while(!que.isEmpty()){
				int[] tmp = que.poll();
				if(tmp[0]==tmp[2] && tmp[1]==tmp[3]){
					f = true;
					System.out.println(tmp[4]);
					break;
				}
				if(tmp[4]>=100) continue;
				
				for(int i=0;i<4;i++){
					for(int j=0;j<2;j++){
						x[j] = tmp[0+2*j]+a[i]*c[j];
						y[j] = tmp[1+2*j]+b[i]*c[j];
						if(x[j]<0 || x[j]>w-1 || y[j]<0 || y[j]>h-1 || map[y[j]][x[j]]){
							x[j] = tmp[0+2*j];
							y[j] = tmp[1+2*j];
						}
					}
					int[] tmp2 = new int[]{x[0],y[0],x[1],y[1],tmp[4]+1};
					if(!contain(tmp2)){
						list.add(tmp2);
						que.offer(tmp2);
					}
				}
			}
			if(!f) System.out.println("NA");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static class VLine{
		long sx;
		long ex;
		long y;
		VLine(int a , int b , int y){
			sx = Math.min(a, b);
			ex = Math.max(a, b);
			this.y = y;
		}		
	}
	static class HLine{
		long sy;
		long ey;
		long x;
		HLine(int a , int b , int x){
			sy = Math.min(a, b);
			ey = Math.max(a, b);
			this.x = x;
		}
	}
	static class Point{
		int x;
		int y;
		Point(int a , int b){
			x = a;
			y = b;
		}
	}
	
	static long[] getXgrid(VLine vs[] , HLine hs[]){
		TreeSet<Long> xs = new TreeSet<Long>();
		xs.add(0L);
		for(VLine v : vs){
			xs.add(v.sx);
			xs.add(v.ex);
		}
		for(HLine h : hs){
			xs.add(h.x);
		}
		long ret[] = new long[xs.size()];
		int cnt = 0;
		for(long x : xs){
			ret[cnt++] = x;
		}		
		return ret;
	}
	static long[] getYgrid(VLine vs[] , HLine hs[]){
		TreeSet<Long> ys = new TreeSet<Long>();
		ys.add(0L);
		for(VLine v : vs){
			ys.add(v.y);
		}
		for(HLine h : hs){
			ys.add(h.sy);
			ys.add(h.ey);
		}
		long ret[] = new long[ys.size()];
		int cnt = 0;
		for(long y : ys){
			ret[cnt++] = y;
		}		
		return ret;
	}

	static class GridHandler{
		VLine vlines[];
		HLine hlines[];
		long xs[];
		long ys[];
		public GridHandler(VLine vs[] , HLine hs[] , long xs[] , long ys[]) {
			this.xs = xs;
			this.ys = ys;
			vlines = new VLine[vs.length];
			hlines = new HLine[hs.length];
			for(int i = 0 ; i < vs.length ; ++i){
				int sx = Arrays.binarySearch(xs, vs[i].sx);
				int ex = Arrays.binarySearch(xs, vs[i].ex);
				int y  = Arrays.binarySearch(ys, vs[i].y);				
				VLine v = new VLine(sx , ex , y);
				vlines[i] = v;
			}
			for(int i = 0 ; i < hs.length ; ++i){
				int sy = Arrays.binarySearch(ys, hs[i].sy);
				int ey = Arrays.binarySearch(ys, hs[i].ey);
				int x  = Arrays.binarySearch(xs, hs[i].x);				
				HLine h = new HLine(sy , ey , x);
				hlines[i] = h;
			}

		}
		boolean canPass(Point cp , Point np){
			if(cp.x == np.x){
				int ty = 0;
				if(cp.y < np.y){
					ty = np.y;
				}else{
					ty = cp.y;
				}
				for(VLine v : vlines){
					if(v.y != ty)continue;
					if(v.sx <= cp.x && cp.x < v.ex){
						return false;
					}
				}
				return true;
			}else{
				int tx = cp.x < np.x ? np.x : cp.x;
				for(HLine h : hlines){
					if(h.x != tx)continue;
					if(h.sy <= cp.y && cp.y < h.ey){
						return false;
					}
				}
				return true;
			}
		}
		long area(Point cp){
//			System.out.println(cp.x+" "+cp.y);
			long w = xs[cp.x + 1] - xs[cp.x];
			long h = ys[cp.y + 1] - ys[cp.y];
			return w * h;
		}
	}
	static long moveArea(VLine vs[] , HLine hs[]){
		long xs[] = getXgrid(vs, hs);
		long ys[] = getYgrid(vs, hs);
//		System.out.println(Arrays.toString(xs));
//		System.out.println(Arrays.toString(ys));
		int vis[][] = new int[ys.length - 1][xs.length - 1];
		int xstart = Arrays.binarySearch(xs, 0);
		int ystart = Arrays.binarySearch(ys, 0);
		if(xstart == 0 || xstart == xs.length - 1){
			return -1;
		}
		if(ystart == 0 || ystart == xs.length - 1){
			return -1;
		}
		int dx[] = { 1 , -1 , 0 , 0};
		int dy[] = { 0 , 0 ,  1 , -1};
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(xstart , ystart));
		vis[ystart][xstart] = 1;
		long result = 0;
		GridHandler gh = new GridHandler(vs, hs , xs , ys);
		while(!q.isEmpty()){
			Point cp = q.poll();
			result += gh.area(cp);
			for(int k = 0 ; k < dx.length ; ++k){
				int nx = cp.x + dx[k];
				int ny = cp.y + dy[k];
				if(nx >= 0 && ny >= 0 && nx < vis[0].length && ny < vis.length && vis[ny][nx] == 1){
					continue;
				}
				Point np = new Point(nx , ny);
				// check can pass
				if(!gh.canPass(cp, np)){
//					System.out.println("B"+ cp.x+" "+cp.y+" "+np.x+" "+np.y);
					continue;
				}else{
//					System.out.println("P"+ cp.x+" "+cp.y+" "+np.x+" "+np.y);					
				}
				if(np.x < 0 || np.y < 0){
					return -1;
				}
				if(np.x >= vis[0].length || np.y >= vis.length){
					return -1;
				}
				vis[np.y][np.x] = 1;
				q.add(np);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		VLine vs[] = new VLine[N];
		for(int i = 0 ; i < N ; ++i){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			vs[i] = new VLine(a, b, c);
		}
		HLine hs[] = new HLine[M];
		for(int j = 0 ; j < M ; ++j){
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			hs[j] = new HLine(e , f , d);
		}
		sc.close();
		long ret = moveArea(vs, hs);
		if(ret < 0){
			System.out.println("INF");						
		}else{
			System.out.println(ret);			
		}
	}
}

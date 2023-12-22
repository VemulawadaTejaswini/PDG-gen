import java.util.BitSet;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	public static int[] dx = {1, 0, -1, 0};
	public static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int h = in.nextInt();
			int w = in.nextInt();
			int c = in.nextInt();
			if(h==0) break;
			int[][] p = new int[h][w];
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					p[i][j] = in.nextInt();
				}
			}
			if(h*w <= 5){
				System.out.println(h*w);
				continue;
			}
			init(p[0][0], c);
			Deque<Integer> qu;
			BitSet conb = new BitSet(h*w);
			BitSet next = new BitSet(h*w);
			BitSet inqu = new BitSet(h*w);
			int res = 0;
			do{
				qu = new LinkedList<Integer>();
				qu.add(0);
				int idx = 0;
				conb.clear();
				next.clear();
				inqu.clear();
				inqu.set(0);
				while(!qu.isEmpty()){
					int panel = qu.poll();
					inqu.clear(panel);
					int x = panel % w;
					int y = panel / w;
					if(p[y][x] != counter[idx]){
						if(next.get(panel)){
							if(idx == 5) break;
							idx++;
							next.clear();
							qu.add(panel);
							inqu.set(panel);
							continue;
						}
						inqu.set(panel);
						next.set(panel);
						qu.add(panel);
						continue;
					}
					conb.set(panel);
					for(int i=0; i<4; i++){
						int nx = x+dx[i];
						int ny = y+dy[i];
						if(nx < 0 || nx >= w || ny < 0 || ny >= h) continue;
						int np = ny*w+nx;
						if(inqu.get(np) || conb.get(np)) continue;
						qu.push(np);
						inqu.set(np);
					}
				}
//				if(conb.cardinality() == 15){
//					for(int i=0; i<h; i++){
//						for(int j=0; j<w; j++){
//							System.out.print(conb.get(i*w+j)?1:0);
//						}
//						System.out.println();
//					}
//					System.out.println();
//				}
				res = Math.max(res, conb.cardinality());
			}while(!incCount());
			System.out.println(res);
		}
	}

	public static int[] debug = {1,6,3,4,2,5};
	public static boolean debug(){
		for(int i=0; i<6; i++){
			if(debug[i] != counter[i]) return false;
		}
		return true;
	}

	public static void init(int begin, int end){
		counter = new int[6];
		counter[0] = begin;
		counter[5] = end;
	}

	public static int[] counter;
	public static boolean incCount(){
		for(int i=1; i<5; i++){
			counter[i]++;
			if(counter[i] <= 6) break;
			counter[i] = 0;
			if(i==4) return true;
		}
		return false;
	}
}
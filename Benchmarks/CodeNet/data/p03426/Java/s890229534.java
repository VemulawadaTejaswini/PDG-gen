
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair{
		int h;
		int w;
		Pair(int h, int w){
			this.h=h;
			this.w=w;
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int D=sc.nextInt();
		int a[][] = new int[H][W];
		Map<Integer, Pair> m = new HashMap<>();
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				int v=sc.nextInt();
				v--;
				a[i][j]=v;
				m.put(v, new Pair(i,j));
			}
		}
		int sum[] = new int[H*W+1];
		for(int i=0; i<H*W; i++) {
			if(i<D) {
				sum[i+1] = 0;
			}else {
				Pair p1 = m.get(i-D);
				Pair p2 = m.get(i);
				sum[i+1] = sum[i-D+1] + Math.abs(p1.h-p2.h)+Math.abs(p1.w-p2.w);
			}

		}

		int Q = sc.nextInt();
		for(int i=0; i<Q; i++) {
			int l = sc.nextInt();
			int r =sc.nextInt();
			int ans = sum[r]-sum[l];
			System.out.println(ans);
		}
		sc.close();
	}

}

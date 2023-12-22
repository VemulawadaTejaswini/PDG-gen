import java.util.*;

public class Main {
	static class Count {
		int pos;
		int count;
		public Count(int pos, int count) {
			this.pos = pos;
			this.count = count;
		}
		public void add() {
			count++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int M = sc.nextInt();
		long[] t = new long[M];
		Count[] ycount = new Count[H];
		for(int i=0; i<H; i++)
			ycount[i] = new Count(i, 0);
		Count[] xcount = new Count[W];
		for(int i=0; i<W; i++)
			xcount[i] = new Count(i, 0);
		for(int i=0; i<M; i++) {
			int h = sc.nextInt()-1;
			int w = sc.nextInt()-1;
			t[i] = (long)h*W+w;

			ycount[h].add();
			xcount[w].add();
		}
		
		Arrays.sort(t);
		Arrays.sort(ycount, new Comparator<Count>() {
			public int compare(Count c1, Count c2) {
				return - Integer.compare(c1.count, c2.count); 
			}
		});
		Arrays.sort(xcount, new Comparator<Count>() {
			public int compare(Count c1, Count c2) {
				return - Integer.compare(c1.count, c2.count); 
			}
		});
		
		int ycand = 1;
		for(; ycand<H; ycand++)
			if(ycount[ycand].count < ycount[0].count)
				break;
		int xcand = 1;
		for(; xcand<W; xcand++)
			if(xcount[xcand].count < xcount[0].count)
				break;
		
		boolean found = false;
		for(int i=0; i<ycand; i++) {
			for(int j=0; j<xcand; j++) {
				if(Arrays.binarySearch(t, (long)ycount[i].pos * W + xcount[j].pos)<0) {
					found = true;
					break;
				}
			}
			if(found)
				break;
		}
		System.out.println(ycount[0].count + xcount[0].count + (found ? 0 : -1));
		
		sc.close();
	}
	
}


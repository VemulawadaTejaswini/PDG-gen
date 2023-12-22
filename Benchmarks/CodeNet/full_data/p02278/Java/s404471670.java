import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		//??????https://www.ipsj.or.jp/07editj/promenade/4506.pdf
		int n = sc.nextInt();
		
		Weight[] w = new Weight[n];
		for(int i=0; i<n; i++) {
			w[i] = new Weight(sc.nextInt());
		}
		
		int min_all = 0;
		for(int i=0; i<n; i++) {
			int idx = i;
			boolean flag = false;
			for(int j=0; j<n; j++) {
				if(i != j && w[i].num > w[j].num) {
					w[i].idx_sort++;
					flag = true;
				}				
			}
			
			if(!flag) {
				min_all = w[idx].num;
			}
			
//			System.out.println(i + " " + w[i].num + " " + w[i].idx_sort);
		}
		
//		System.out.println(min_all);
		
		
		int cost = 0;
		for(int i=0; i<n; i++) {
			int min_cycle = Integer.MAX_VALUE;
			int sum_cycle = 0;
			int n_cycle = 0;
			int j = i;
			
			if(!w[j].flag) {
				if(w[j].idx_sort == j) {
					w[j].flag = true;
				} else {
					while(w[j].flag == false) {
						sum_cycle += w[j].num;
						n_cycle++;
						if(w[j].num < min_cycle) {
							min_cycle = w[j].num;
						}
						w[j].flag = true;
						j = w[j].idx_sort;	
					}
					
					int cost_1 = sum_cycle + (n_cycle - 2) * min_cycle;
					int cost_2 = sum_cycle + min_cycle + (n_cycle + 1) * min_all;
					
					cost += Math.min(cost_1, cost_2);
					
//					System.out.println(i + " " + n_cycle + " " + sum_cycle + " " + min_cycle + " " + cost_1 + " " + cost_2);
				}
			}
		}
		
		System.out.println(cost);
	}
	
	static class Weight {
		int num;
		boolean flag = false;
		int idx_sort = 0;
		Weight(int num) {
			this.num = num;
		}
	}

	static class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;
	    private boolean hasNextByte() {
	        if (ptr < buflen) {
	            return true;
	        }else{
	            ptr = 0;
	            try {
	                buflen = in.read(buffer);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            if (buflen <= 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
	    public String next() {
	        if (!hasNext()) throw new NoSuchElementException();
	        StringBuilder sb = new StringBuilder();
	        int b = readByte();
	        while(isPrintableChar(b)) {
	            sb.appendCodePoint(b);
	            b = readByte();
	        }
	        return sb.toString();
	    }
	    public long nextLong() {
	        return Long.parseLong(next());
	    }
	    public int nextInt(){
	    	return Integer.parseInt(next());
	    }
	}
}
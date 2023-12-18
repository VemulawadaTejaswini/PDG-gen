import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		
		int[] address = new int[N];
		for(int i=0; i<N; i++) {
			int p = sc.nextInt() - 1;
			address[p] = i;
		}
		
		PriorityQueue<Integer> iq = new PriorityQueue<>();
		for(int i=0; i<N; i++) {
			iq.add(i);
		}
		
		int[] ans = new int[N];
		int[] zoubun = new int[N];
		int[] group = new int[N];
		int groupnum = 1;
		
		ArrayList<Integer> temp = new ArrayList<>();
		int pos = 0;
		while(!iq.isEmpty()) {
			int i = iq.poll();
//			System.out.println(address[i] + " " +  zoubun[1]);
			if(address[i] == -1) continue;
			if((address[i] + zoubun[address[i]])%2 == 0) {
				for(int j=0; j<N; j++) {
					if(address[j] != -1 && group[address[i]] == group[address[j]] && (address[j] + zoubun[address[j]])%2 == 1 && address[i] < address[j]) {
						for(int k=address[i]; k<address[j]; k++) {
							if(k != -1) {
								zoubun[k]++;
								group[k] = groupnum;
							}
						}
						groupnum++;
						ans[pos] = i;
						address[i] = -1;
						pos++;
						ans[pos] = j;
						address[j] = -1;
						pos++;
						
						for(int x : temp) {
							iq.add(x);
						}
						temp.clear();
						break;
					}
				}
			} else {
				temp.add(i);
			}
			if(pos == N) break;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(ans[i] + 1);
			if(i != N-1) sb.append(" ");
		}
		System.out.println(sb);
	}
	
	static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
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
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}

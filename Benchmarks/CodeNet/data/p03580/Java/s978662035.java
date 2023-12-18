import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	private static int ans = 0;
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		String s = sc.next();
		while(s.length() > 0) {
			if(s.charAt(0) == '0') {
				s = s.substring(1);
			} else {
				break;
			}
		}
		while(s.length() > 0) {
			if(s.charAt(s.length()-1) == '0') {
				s = s.substring(0, s.length()-1);
			} else {
				break;
			}
		}
		solve(s);
		System.out.println(ans);
	}
	
	static void solve(String s) {
		int z = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '0') {
				z++;
			} else {
				if(z >= 2) {
					String s1 = s.substring(0, i-z);
					String s2 = s.substring(i, s.length());
					solve(s1);
					solve(s2);
					return;
				}
				z = 0;
			}
		}
		
		ArrayList<Zero> list = new ArrayList<>();
		PriorityQueue<Zero> zeros = new PriorityQueue<>((a, b) -> a.maxone != b.maxone ? b.maxone - a.maxone : a.pos - b.pos);
		int ones = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '0') {
				int rightone = 0;
				for(int j=i+1; j<s.length(); j++) {
					if(s.charAt(j) == '1') {
						rightone++;
					} else {
						break;
					}
				}
				Zero zero = new Zero(i, ones, rightone, Math.max(ones, rightone));
				list.add(zero);
				zeros.add(zero);
				ones = 0;
			} else {
				ones++;
			}
		}
		
		while(!zeros.isEmpty() && !list.isEmpty()) {
			Zero max = zeros.poll();
			ans++;
			int id = list.indexOf(max);
			if(id != 0) {
				Zero zero = list.get(id-1);;
				zero.rightone--;
				zero.maxone = Math.max(zero.leftone, zero.rightone);
				if(zero.maxone == 0) {
					list.remove(zero);
					zeros.remove(zero);
				}
			}
			if(id != list.size()-1) {
				Zero zero = list.get(id+1);
				list.remove(id+1);
				zero.leftone--;
				zero.maxone = Math.max(zero.leftone, zero.rightone);
				if(zero.leftone == 0) {
					list.remove(zero);
					zeros.remove(zero);
				}
			}
			
			if(max.leftone > 1) {
				Zero zero = new Zero(max.pos-1, max.leftone-1, 1, max.leftone-1);
				zeros.add(zero);
				list.add(id, zero);
			}
			if(max.rightone > 1) {
				Zero zero = new Zero(max.pos+1, max.rightone-1, 1, max.rightone-1);
				zeros.add(zero);
				list.add(id+1, zero);
			}
		}
		
//		System.out.println(s + " " + ans);
	}
	
	static class Zero {
		int pos;
		int leftone;
		int rightone;
		int maxone;
		Zero(int pos, int leftone, int rightone, int maxone) {
			this.pos = pos;
			this.leftone = leftone;
			this.rightone = rightone;
			this.maxone = maxone;
		}
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

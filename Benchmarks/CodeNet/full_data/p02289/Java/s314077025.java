import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();
	static final int MAX_NODE = 2000000;

	public static void main(String[] args) {
		
		int H = 0;
		
		NodeCBT[] nod = new NodeCBT[MAX_NODE+1];
		for(int i=1; i<=MAX_NODE; i++) {
			nod[i] = new NodeCBT(i);
		}
		
		StringBuilder ans = new StringBuilder();
		while(true) {
			String cmd = sc.next();
			
			if(cmd.equals("insert")) {
				int key = sc.nextInt();
				H++;
				nod[H].key = key;
				
				nod[H].insertChange(nod);
				
			} else if(cmd.equals("extract")) {
				
				ans.append(nod[1].key);
				ans.append("\n");
				
				int temp = nod[1].key;
				nod[1].key = nod[H].key;
				nod[H].key = temp;
				H--;
				
				nod[1].extractChange(nod, H);
				
			} else {
				break;
			}
		}
		System.out.print(ans);
	}

	static class NodeCBT {
		int id;
		int key;
		int parent;
		int left;
		int right;
		
		NodeCBT(int id) {
			this.id = id;
			if(id != 1) {
				parent = id / 2;
			} else {
				parent = -1;
			}
			left = 2 * id;
			right = 2 * id + 1;
			
		}
		
		void insertChange(NodeCBT[] nod) {
			if(id != 1 && key > nod[parent].key) {
				int temp = key;
				key = nod[parent].key;
				nod[parent].key = temp;
				nod[parent].insertChange(nod);
			}
		}
		
		void extractChange(NodeCBT[] nod, int H) {
			if(left <= H && right <= H) {
				if(nod[left].key > nod[right].key && nod[left].key > key) {
					int temp = key;
					key = nod[left].key;
					nod[left].key = temp;
					nod[left].extractChange(nod, H);
				} else if(nod[right].key > nod[left].key && nod[right].key > key) {
					int temp = key;
					key = nod[right].key;
					nod[right].key = temp;
					nod[right].extractChange(nod, H);
				}
			} else if(left <= H) {
				if(nod[left].key > key) {
					int temp = key;
					key = nod[left].key;
					nod[left].key = temp;
				}
			}
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
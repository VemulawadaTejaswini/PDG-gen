import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int H = sc.nextInt();
		
		NodeCBT[] nod = new NodeCBT[H+1];
		for(int i=1; i<=H; i++) {
			int key = sc.nextInt();
			nod[i] = new NodeCBT(i, key, H);
		}
		
		for(int i=H/2; i>=1; i--) {
			nod[i].maxHeapify(nod);
		}
		
		StringBuilder ans = new StringBuilder();
		for(int i=1; i<=H; i++) {
			ans.append(" ");
			ans.append(nod[i].key);
		}
		System.out.println(ans);
	}

	static class NodeCBT {
		int id;
		int key;
		int parent;
		int left;
		int right;
		
		NodeCBT(int id, int key, int H) {
			this.id = id;
			this.key = key;
			if(id != 1) {
				parent = id / 2;
			} else {
				parent = -1;
			}
			if(2 * id <= H) {
				left = 2 * id;
			} else {
				left = -1;
			}
			if(2 * id + 1 <= H) {
				right = 2 * id + 1;
			} else {
				right = -1;
			}
			
		}
		
		void maxHeapify(NodeCBT[] nod) {
			int largest = key;
			if(left != -1 && nod[left].key > key && nod[left].key > largest) {
				largest = nod[left].key;		
			}
			if(right != -1 && nod[right].key > largest) {
				largest = nod[right].key;
				
			}
			
			if(left != -1 && largest == nod[left].key) {
				int temp = key;
				key = nod[left].key;
				nod[left].key = temp;
				nod[left].maxHeapify(nod);
			} else if(right != -1 && largest == nod[right].key) {
				int temp = key;
				key = nod[right].key;
				nod[right].key = temp;
				nod[right].maxHeapify(nod);
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
import java.util.HashMap;
import java.util.Map.Entry;
 
public class Main{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>(n);
        for(int i = 0;i<n;i++){
            map.put(sc.nextInt(),2);
        }
         
        int q = sc.nextInt();
        HashMap<Integer, Integer> map2 = new HashMap<>(q);
        for(int i = 0;i<q;i++){
            map2.put(sc.nextInt(),2);
        }
         
        int t = 0;
        if(n>q){
            for (Entry<Integer, Integer> m : map2.entrySet()) {
                if(map.get(m.getKey())!=null){
                    t++;
                     
                }
            }
        }else{
            for (Entry<Integer, Integer> m : map.entrySet()) {
                if(map2.get(m.getKey())!=null){
                    t++;
                }
            }
        }
        System.out.println(t);
         
    }
}


class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) { return false; }
		}
		return true;
	}
	
	private byte readByte() {
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			System.out.println("poyo");
			return -1;
		}
	}
	
	private boolean isPrintableChar(int c) {
		return '!' <= c && c <= '~';
	}
	
	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
	}
	
	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}
	
	public int nextInt() {
		if (!hasNext()) { throw new NoSuchElementException(); }
		int n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) { throw new NumberFormatException(); }
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	
}
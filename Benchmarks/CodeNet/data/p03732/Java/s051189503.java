import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
		
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		int W = sc.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i <= 3; i++) list.add(new ArrayList<Integer>());
		
		int w1 = sc.nextInt();
		list.get(0).add(sc.nextInt());
		for(int i = 1; i < N; i++){
			int w = sc.nextInt() - w1;
			int v = sc.nextInt();
			list.get(w).add(v);
		}
		
		for(int i = 0; i <= 3; i++){
			Collections.sort(list.get(i), Collections.reverseOrder());
		}
		
		long ans = 0;
		
		for(int i = 0; i <= list.get(0).size(); i++){
			long sumW0 = w1 * i;
			if(sumW0 > W) continue;
			for(int j = 0; j <= list.get(1).size(); j++){
				long sumW1 = sumW0 + (w1 + 1) * j;
				if(sumW1 > W) continue;
				for(int k = 0; k <= list.get(2).size(); k++){
					long sumW2 = sumW1 + (w1 + 2) * k;
					if(sumW2 > W) continue;
					for(int m = 0; m <= list.get(3).size(); m++){
						long sumW3 = sumW2 + (w1 + 3) * m;
						if(sumW3 > W) continue;
						
						long res = 0;
						for(int ii = 0; ii < i; ii++) res += list.get(0).get(ii);
						for(int ii = 0; ii < j; ii++) res += list.get(1).get(ii);
						for(int ii = 0; ii < k; ii++) res += list.get(2).get(ii);
						for(int ii = 0; ii < m; ii++) res += list.get(3).get(ii);
						ans = Math.max(ans, res);
					}
				}
			}
		}
		
		System.out.println(ans);
		
	}//end main
	
}//end Main

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
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
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
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
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}

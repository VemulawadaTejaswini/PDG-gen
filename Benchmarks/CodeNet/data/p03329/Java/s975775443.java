import java.util.*;
import java.io.*;

public class Main {
		static List<Integer> list = new ArrayList<>();
		static int min;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		min = Integer.MAX_VALUE / 10;

		for(int num = 6; num <= n; num *= 6) {
			list.add(num);
		}
		for(int num = 9; num <= n; num *= 9) {
			list.add(num);
		}
		Collections.sort(list, Collections.reverseOrder());
		
		dfs(0, n);
		out.println(min);
				
		out.close();
	} 
	static void dfs (int cnt, int deposit) {
		if (deposit < 6) {
			min = Math.min(min, cnt + deposit);
		} else {
			int count = 0;
			for(int i = 0; i < list.size(); i++) {
				int num = list.get(i);
				if (num <= deposit) {
					dfs(cnt + 1, deposit - num);
					count++;
				}
				if (count >= 2)
					break;
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
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
    public double nextDouble() { return Double.parseDouble(next());}
}
}

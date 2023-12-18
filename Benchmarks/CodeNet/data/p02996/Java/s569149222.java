import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		boolean flag = true;
		long hour = 0;
		List<Work> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			list.add( new Work(A, B) );
		}
		Collections.sort(list);
		/*
		for(int i = 0; i < list.size(); i++) {
			Work work = list.get(i);
			out.println(work.time + " " + work.limit);
		}*/
		for(int i = 0; i < list.size(); i++) {
			Work work = list.get(i);
			if( work.limit < hour) {
				flag = false;
				break;
			}
			hour += work.time;
		}
		if (flag) out.println("Yes");
		else out.println("No");
		
		out.close();
	}
	static class Work implements Comparable<Work>{
		Integer time;
		Integer outLimit;
		Integer limit;
		
		Work(int time, int outLimit) {
			this.time = time;
			this.outLimit = outLimit;
			this.limit = this.outLimit - this.time;
		}

		@Override
		public int compareTo(Work o) {
			int r =  this.limit.compareTo(o.limit);
			if(r != 0)
				return r;
			else {
				return this.outLimit.compareTo(o.outLimit);
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

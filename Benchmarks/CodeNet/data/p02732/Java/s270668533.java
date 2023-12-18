import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import static java.util.stream.Collectors.*;
import static java.util.function.Function.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
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

class Main {
	public static void main(String[] args) {
		FastScanner in = new FastScanner();
		int n = in.nextInt();
		Integer[] ary = new Integer[n];
		for(int i=0; i<n; i++){
			ary[i] = in.nextInt();
		}
		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.asList(ary);
		Map<Integer, Long> map = list
		.stream()
		.collect(groupingBy(identity(), counting()));

		// 重複なしのkeyを削除
		Iterator<Map.Entry<Integer, Long>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
    		Map.Entry<Integer, Long> e = iterator.next();
    		if (e.getValue() == 1) {
				iterator.remove();
			}
		}

		// 全ての通りを計算
		long total = 0;
		for (Long count : map.values()) {
            total += combination(count, 2);
		}

		for(int i=0; i<n; i++){
			long ans = total;
			if(map.containsKey(ary[i])){
				long tmp = map.get(ary[i]);
				ans = total - combination(tmp, 2) + combination(tmp-1, 2);
			}
			System.out.println(ans);
		}
	}
	public static long factorial(long n) {
		if (n <= 1)
			return 1;
		else {
			return n * factorial(n - 1);
		}
	}
	public static long combination(long n, long r) {
		long top = n;
		for (int i = 0; i < r - 1; i++) {
			top = top * (--n);
		}
		long bottom = factorial(r);
		return top / bottom;
	}
}

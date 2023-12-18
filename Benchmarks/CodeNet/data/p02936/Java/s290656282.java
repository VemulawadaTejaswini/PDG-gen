import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int i=0; i<n-1; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(map.get(a) == null){
				List<Integer> list = new ArrayList<>();
				list.add(b);
				map.put(a, list);
			} else {
				List<Integer> list = map.get(a);
				list.add(b);
				map.put(a, list);
			}
			if(map.get(b) == null){
				List<Integer> list = new ArrayList<>();
				list.add(a);
				map.put(b, list);
			} else {
				List<Integer> list = map.get(b);
				list.add(a);
				map.put(b, list);
			}
		}
		long[] ans = new long[n+1];
		for(int i=0; i<q; i++){
			int c = sc.nextInt();
			int d = sc.nextInt();
			ans[c] += d;
		}
		List<Integer> parents = new ArrayList<>();
		parents.add(-1);
		dfs(1, parents, map, ans);
		for(int i=1; i<ans.length; i++){
			out.print(ans[i]+ " ");
		}
		out.flush();
	}

	public static void dfs(int i, List<Integer> parents, Map<Integer, List<Integer>> map, long[] ans){
		List<Integer> list = map.get(i);
		if(list == null) return;
		parents.add(i);
		for(int j: list){
			if(parents.contains(j)) continue;
			ans[j] += ans[i];
			dfs(j, parents, map, ans);
		}
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

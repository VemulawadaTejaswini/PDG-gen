import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		String str = sc.next();
		int k = sc.nextInt();
		List<Character> list = new ArrayList<>();
		for(int index = 0; index < str.length(); index++) {
			char c = str.charAt(index);
			if (!list.contains(c))
				list.add(c);
		}
		Collections.sort(list);
		int cnt = 0;	
		HashSet<String> set = new HashSet<>(); //宣言済みの文字列
		String ans = " ";
		
		while(cnt < k) {
			char c = list.get(0);
			list.remove(0);
			List<Integer> start = new ArrayList<>();
			for(int index = 0; index < str.length(); index++) {
				if (str.charAt(index) == c)
					start.add(index);
			}
			List<String> strings = new ArrayList<>();
			for(int i = 0; i < start.size(); i++) {
				String s = str.substring(start.get(i));
				strings.add(s);
			}
			Collections.sort(strings);
			
			for(int i = 0; i < strings.size(); i++) {
				String substr = strings.get(i);
				String s = "";
				for(int j = 0; j < substr.length(); j++) {
					s = s + substr.charAt(j);
					if (! set.contains(s)) {
						set.add(s);
						cnt++;
					}
					if (cnt == k) {
						ans = s;
						break;
					}
				}
				if (cnt == k)
					break;
			}		
		}
		out.println(ans);
		
		out.close();
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

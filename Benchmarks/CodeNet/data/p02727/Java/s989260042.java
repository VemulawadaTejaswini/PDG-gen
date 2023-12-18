import java.io.*;
import java.util.*;

public class Main {
	
	public static final FastScanner sc = new FastScanner();
	
	static int w, h;
	static boolean[][] ice;
	
	public static void main(String[] args) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] red = ni(a);
		int[] green = ni(b);
		int[] empty = ni(c);
		Arrays.sort(red);
		Arrays.sort(green);
		Arrays.sort(empty);
		List<Integer> list = new LinkedList<>();
		for(int i = 0;i < x;i ++) list.add(red[a - i - 1]);
		for(int i = 0;i < y;i ++) list.add(green[b - i - 1]);
		for(int i = 0;i < Math.min(x + y, c);i ++) list.add(empty[c - i - 1]);
		Collections.sort(list, Collections.reverseOrder());
		long sum = 0;
		int num = 0;
		for(int n : list) {
			sum += n;
			num ++;
			if(num >= x + y) break;
		}
		println(sum);
	}
	
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static String ns() { return sc.next();}
	public static long nl() { return sc.nextLong();}
	public static int ni() { return sc.nextInt();}
	
	public static String[] ns(int n) { 
		String[] ret = new String[n]; 
		for(int i = 0;i < n;i ++) ret[i] = ns();
		return ret;
	}
	public static long[] nl(int n) {
		long[] ret = new long[n]; 
		for(int i = 0;i < n;i ++) ret[i] = nl();
		return ret;
	}
	public static int[] ni(int n) { 
		int[] ret = new int[n];
		for(int i = 0;i < n;i ++) ret[i] = ni();
		return ret;
	}
	
	public static int max(int a, int b) { return Math.max(a, b);}
	public static long max(long a, long b) { return Math.max(a, b);}
	public static double max(double a, double b) { return Math.max(a, b);}
	
	public static int min(int a, int b) { return Math.min(a, b);}
	public static long min(long a, long b) { return Math.min(a, b);}
	public static double min(double a, double b) { return Math.min(a, b);}
	
	public static void println(String s) { System.out.println(s);}
	public static void println(double s) { System.out.println(s);}
	public static void println(long s) { System.out.println(s);}
	public static void println(int s) { System.out.println(s);}
	
	public static void print(String s) { System.out.print(s);}
	public static void print(double s) { System.out.print(s);}
	public static void print(long s) { System.out.print(s);}
	public static void print(int s) { System.out.print(s);}
}

enum Color {
	red, green, empty;
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

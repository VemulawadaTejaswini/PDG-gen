import java.io.*;
import java.util.*;

public class Main {
	
	static int w, h;
	static boolean[][] ice;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		TreeSet<Apple> sort = new TreeSet<Apple>();
		for(int i = 0;i < a;i ++) {
			sort.add(new Apple(Color.red, sc.nextLong()));
		}
		for(int i = 0;i < b;i ++) {
			sort.add(new Apple(Color.green, sc.nextLong()));
		}
		for(int i = 0;i < c;i ++) {
			sort.add(new Apple(Color.empty, sc.nextLong()));
		}
		int rn = 0, gn = 0;
		int nn = 0;
		long sum = 0;
		for(Apple apple : sort) {
			//System.out.println(apple.value);
			if(apple.c == Color.red) {
				if(rn >= x) continue;
				rn ++;
				sum += apple.value;
			} else if (apple.c == Color.green) {
				if(gn >= y) continue;
				gn ++;
				sum += apple.value;
			} else {
				sum += apple.value;
			}
			nn ++;
			if(nn >= x + y) break;
		}
		println(sum);
	}
	
	public static void print(int[] dist) {
		for(int i = 1;i < dist.length;i ++) {
			println(dist[i]);
		}
	}
	
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static void println(String s) {System.out.println(s);}
	public static void println(long s) {System.out.println(s);}
	public static void println(int s) {System.out.println(s);}
	
	public static void prt(String s) {
		System.out.print(s);
	}
}

enum Color {
	red, green, empty;
}

class Apple implements Comparable<Apple> {
	
	Color c;
	long value;
	
	Apple(Color c, long value){
		this.c = c;
		this.value = value;
	}

	public int compareTo(Apple a) {
		return -Long.compare(value, a.value);
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

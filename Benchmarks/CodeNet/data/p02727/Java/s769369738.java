import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		PriorityQueue<Apple> queR= new PriorityQueue<>();
		PriorityQueue<Apple> queG = new PriorityQueue<>();	
		ArrayList<Long> listC = new ArrayList<>();
		long X = sc.nextLong();  //食べる個数
		long Y = sc.nextLong();  //食べる個数
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		for(int i = 0; i < a; i++) {
			Apple apple = new Apple('R', sc.nextLong());
			queR.offer(apple);
		}
		for(int i = 0; i < b; i++) {
			Apple apple = new Apple('G', sc.nextLong());
			queG.offer(apple);			
		}
		for(int i = 0; i < c; i++) {
		listC.add(sc.nextLong());
		}
		ArrayList<Long> list = new ArrayList<>();
		long sum = 0;
		for(int i = 0; i <X; i++) {
			long num = queR.poll().number;
			list.add(num);
			sum += num;
		}
		for(int i = 0; i < Y; i++) {
			long num = queG.poll().number;
			list.add(num);
			sum += num;
		}
		Collections.sort(listC);	
		Collections.sort(list);
		int num = listC.size();
		for(int i = 0; i < num; i++) {
			if(listC.size() == 0) break;
			if(list.get(i) < listC.get(listC.size() - 1)) {
				sum = sum + listC.get(listC.size() - 1) - list.get(i);
				listC.remove(listC.size() - 1);
			}
		}
		
		out.println(sum);
		
		out.close();
	}

static class Apple implements Comparable<Apple>{
		char color;
		Long number;
		
		Apple(char color, Long number){
			this.color = color;
			this.number = number;
		}

		@Override
		public int compareTo(Apple o) {			
			return - ( this.number.compareTo(o.number) );
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

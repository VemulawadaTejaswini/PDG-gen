
import java.awt.geom.Point2D;
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;



public class Main {

	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static Scanner stdIn = new Scanner(System.in);

	static int nowp = 0;
	static int INF = 2 << 29;
	static HashMap<String,Integer> map = new HashMap<String,Integer>();
	public static void main(String[] args) {
		bfs();
		while(sc.hasNext()) {
			System.out.println(map.get(sc.next() + sc.next() + sc.next() + sc.next() + sc.next() + sc.next() + sc.next() + sc.next()));
		}
		out.flush();
		
	}
	static String swap(String a ,int f, int t) {
		char[] in = a.toCharArray();
		char tmp = in[f];
		in[f] = in[t];
		in[t] = tmp;
		
		
		return String.valueOf(in);
	}
	static class Data {
		String a;
		int i;
		int c;
		Data(String a, int b, int c) {
			this.a = a;
			this.i = b;
			this.c = c;
		}
	}
	static ArrayDeque<Data> stack = new ArrayDeque<Data>();
	
	static void bfs() {
		stack.push(new Data("01234567",0,0));
		while(!stack.isEmpty()) {
			solv(stack.pollLast());
		}
	}
	static void solv(Data k) {
		String a = k.a;
		int i = k.i;
		int c = k.c;
		if(map.containsKey(a)) {
			if(map.get(a) >= c) {
				map.put(a, c);
			}
			else {
				return;
			}
		}
		else if(!map.containsKey(a)) {
			map.put(a, c);
		}
		if(i == 0) {
			stack.push(new Data(swap(a,i,1),1,c+1));
			stack.push(new Data(swap(a,i,4),4,c+1));
		}
		if(i == 1 || i == 2) {
			stack.push(new Data(swap(a,i,i+1),i+1,c+1));
			stack.push(new Data(swap(a,i,i-1),i-1,c+1));
			stack.push(new Data(swap(a,i,i+4),i+4,c+1));
		}
		if(i == 3) {
			stack.push(new Data(swap(a,i,2),2,c+1));
			stack.push(new Data(swap(a,i,7),7,c+1));
		}
		if(i == 4) {
			stack.push(new Data(swap(a,i,5),5,c+1));
			stack.push(new Data(swap(a,i,0),0,c+1));
		}
		if(i == 5 || i == 6) {
			stack.push(new Data(swap(a,i,i+1),i+1,c+1));
			stack.push(new Data(swap(a,i,i-1),i-1,c+1));
			stack.push(new Data(swap(a,i,i-4),i-4,c+1));
		}
		if(i == 7) {
			stack.push(new Data(swap(a,i,6),6,c+1));
			stack.push(new Data(swap(a,i,3),3,c+1));
		}
	}
}
//------------------------------//
//-----------//
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
    	 if (!hasNext()) throw new NoSuchElementException();
         int n = 0;
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
    
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
    

}
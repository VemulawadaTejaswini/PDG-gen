
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		Scanner stdIn = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(sc.hasNext()) {
			int[] list = new int[1000];
			while(true) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(a == 0 && b == 0) break;
				list[a]++;
				list[b]++;
			}
			int e = 0;
			int o = 0;
			for(int i = 0; i < list.length; i++) {
				if(list[i] % 2 == 0) {
					e++;
				}
				else {
					o++;
				}
				if(o > 2) break;
			}
			out.println((list[1] % 2 == 1 && list[2] % 2 == 1)?"OK":"NG");
		}
		out.flush();
	}
}
class LL {
	int size;
	Node now;
	LL(int n) {
		now = new Node(null,null,1);
		Node tmp = new Node(null,null,2);
		now.next = tmp;
		now.prev = tmp;
		tmp.next = now;
		tmp.prev = now;
		size = n;
		now = tmp;
		for(int i = 2; i < n; i++) {
			add(i+1);
		}
	}
	
	void add(int a) {
		Node tmp = new Node(null,null,a);
		tmp.next = now.next;
		tmp.prev = now;
		now.next.prev = tmp;
		now.next = tmp;
		now = tmp;
	}
	
	void remove() {
		now.prev.next = now.next;
		now.next.prev = now.prev;
		now = now.next;
		size--;
	}
}

class Node {
	Node next;
	Node prev;
	int id;
	Node(Node a, Node b, int c) {
		next = a;
		prev = b;
		id = c;
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
    	return (int)nextLong();
    }
    

}
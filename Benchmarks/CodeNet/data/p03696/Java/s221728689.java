import java.io.*;
import java.util.*;

public class Main {
		
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		Deque<String> stack = new ArrayDeque<String>();
		Deque<String> deque = new ArrayDeque<String>();
		
		for(int i = 0; i < S.length; i++){
			int s = S[i];
			if(s == '('){
				stack.addLast("(");
			}else{
				//')'
				if(stack.isEmpty()){
					deque.addFirst("(");
					deque.addLast(")");
				}else{
					deque.addLast("()");
					stack.pollLast();
				}				
			}
		}
		
		StringBuilder ans = new StringBuilder();
		while(!deque.isEmpty()){
			ans.append(deque.removeFirst());
		}
		if(!stack.isEmpty()){
			int num = stack.size();
			for(int i = 0; i < num; i++) ans.append("(");
			for(int i = 0; i < num; i++) ans.append(")");
		}
		
		System.out.println(ans);
		
		/*
		if(ans.toString().equals(sc.next())) System.out.println("true");
		else System.out.println("false");
		*/
		
	}//end main
	
}//end Main

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
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
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
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
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}

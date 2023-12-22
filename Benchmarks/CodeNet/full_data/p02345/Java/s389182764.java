
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main{

    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static long[] num;

    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int q = sc.nextInt();
        int count = 1;
        while(true){
        	if((int)Math.pow(2,count)-(int)Math.pow(2,count-1)>=n){
        		n = (int)Math.pow(2,count);
        		break;
        	}
        	count++;
        }
        int z = (int)Math.pow(2,count) - (int)Math.pow(2,count-1);
        num = new long[n];
        Arrays.fill(num,(long)Math.pow(2,31)-1);
        for(int i=0;i<q;i++){
        	int com = sc.nextInt();
        	int x = sc.nextInt();
        	long y = sc.nextLong();
            if(com == 0){
        		int a = n - z + x;
                out.flush();
        		num[a] = y;
        		while(a!=1){
        			a = a/2;
        			num[a] = Math.min(num[a*2],num[a*2+1]);
        		}
        	}
        	else{
                out.println(get(x,1+(int)y,1,0,z));
        		out.flush();
        	}
        }
        sc.close();
        out.close();
    }

    public static long get(int begin,int end,int idx,int left,int right){
        if(right<=begin || end<=left){
    		return (long)Math.pow(2,31)-1;
    	}
    	if(begin<=left && right<=end){
    		return num[idx];
    	}

    	long vleft = get(begin,end,idx*2,left,(left+right)/2);
    	long vright = get(begin,end,idx*2+1,(left+right)/2,right);
    	return Math.min(vleft,vright);
    }

    static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}

class Reader {
    private final InputStream sc;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    public Reader() { this(System.in);}
    public Reader(InputStream source) { this.sc = source;}

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try{
            buflen = sc

.read(buf);
        }catch (IOException e) {e.printStackTrace();}
        if (buflen <= 0) return false;
        return true;
    }

    private int readByte() { if (hasNextByte()) return buf[ptr++]; else return -1;}

    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}

    private void skip() { while(hasNextByte() && !isPrintableChar(buf[ptr])) ptr++;}

    public boolean hasNext() {skip(); return hasNextByte();}

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        boolean minus = false;
        long num = readByte();

        if(num == '-'){
            num = 0;
            minus = true;
        }else if (num < '0' || '9' < num){
            throw new NumberFormatException();
        }else{
            num -= '0';
        }
        
        while(true){
            int b = readByte();
            if('0' <= b && b <= '9')
                num = num * 10 + (b - '0');
            else if(b == -1 || !isPrintableChar(b))
                return minus ? -num : num;
            else
                throw new NoSuchElementException();
        }
    }

    public int nextInt() {
        long num = nextLong();
        if (num < Integer.MIN_VALUE || Integer.MAX_VALUE < num)
            throw new NumberFormatException();
        return (int)num;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public char nextChar() {
        if (!hasNext()) throw new NoSuchElementException();
        return (char)readByte();
    }

    public String nextLine() {
        while (hasNextByte() && (buf[ptr] == '\n' || buf[ptr] == '\r')) ptr++;
        if (!hasNextByte()) throw new NoSuchElementException();

        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (b != '\n' && b != '\r') {
            sb.appendCodePoint(b);
            b = readByte();
        }

        return sb.toString();
    }

    public int[] nextIntArray(int n) {
        int[] res = new int[n];
        for (int i=0; i<n; i++) res[i] = nextInt();
        return res;
    }

    public char[] nextCharArray(int n) {
        char[] res = new char[n];
        for (int i=0; i<n; i++) res[i] = nextChar();
        return res;
    }

    public void close() {try{ sc.close();}catch(IOException e){ e.printStackTrace();}};
}
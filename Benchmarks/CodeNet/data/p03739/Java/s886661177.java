import java.util.*;
import java.io.*;
 
public class Main{
    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);
 
    public static void main(String[] args) throws Exception {
    	int n = sc.nextInt();
    	long[] a = new long[n];
    	for(int i=0;i<n;i++){
    		a[i] = sc.nextLong();
    	}
    	long counter = 0;
    	long total = a[0];
    	if(a[0]==0){
    		total++;
    		counter++;
    	}
    	for(int i=1;i<n;i++){
    		if(total>0 && total+a[i]<0){
    			total += a[i];
    		}
    		else if(total<0 && total+a[i]>0){
    			total += a[i];
    		}
    		else{
    			long x = 0;
    			if(total>0){
    				x = -1 - total - a[i];
    				total = -1;
    			}
    			else{
    				x = 1 - total - a[i];
    				total = 1;
    			}
    			counter += (long)Math.abs(x);
    		}
    		//out.println(total+" "+counter);
    	}

    	long total1 = 0;
    	long counter1 = 0;
    	if(a[0]<0){
    		total1 = 1;
    		counter1 = 1 - a[0];
    	}
    	else if(a[0]>0){
    		total1 = -1;
    		counter1 = 1 + a[0];
    	}
    	else{
    		total1 = -1;
    		counter1 = 1;
    	}
    	for(int i=1;i<n;i++){
    		if(total1>0 && total1+a[i]<0){
    			total1 += a[i];
    		}
    		else if(total1<0 && total1+a[i]>0){
    			total1 += a[i];
    		}
    		else{
    			long x = 0;
    			if(total1>0){
    				x = -1 - total1 - a[i];
    				total1 = -1;
    			}
    			else{
    				x = 1 - total1 - a[i];
    				total1 = 1;
    			}
    			counter1 += (long)Math.abs(x);
    		}
    		//out.println(total+" "+counter);
    	}

    	if(counter>counter1){
    		out.println(counter1);
    	}
    	else{
    		out.println(counter);
    	}
    	out.flush();
        sc.close();
        out.close();
    }

    static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}
 
class Reader {
 
    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
 
    public Reader() { this(System.in);}
    public Reader(InputStream source) { this.in = source;}
 
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try{
            buflen = in.read(buf);
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
 
    public void close() {try{ in.close();}catch(IOException e){ e.printStackTrace();}};
}
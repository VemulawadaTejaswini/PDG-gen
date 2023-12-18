
import java.util.*;
import java.io.*;

public class Main{
    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
    	int n = sc.nextInt();
    	long x = sc.nextLong();
    	long[] a = new long[n];
    	boolean[] flag = new boolean[n];
    	Arrays.fill(flag,true);
    	long ans = 0;
    	long min = 1000000001;
    	int now = -1; 
    	for(int i=0;i<n;i++){
    		a[i] = sc.nextLong();
    		if(min>a[i]){
    			min =  a[i];
    			now = i;
    		}
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(now);
    	flag[now] = false;
    	int count = 1;
    	long[] b = new long[n];
    	b[now] = a[now];
    	while(count<n){
    		ArrayList<Integer> list2 = new ArrayList<Integer>();
    		for(int i=0;i<list.size();i++){
    			if(flag[(n+list.get(i)+1)%n]){
    				list2.add((n+list.get(i)+1)%n);
    			}
    		}
    		long change = 0;
    		long sum = 0;
    		for(int i=0;i<list2.size();i++){
    			sum += a[list2.get(i)];
    			change += b[(n+list2.get(i)-1)%n];
    		}
    		if(sum>=change+x+ans){
    			ans += x;
    			for(int i=0;i<list2.size();i++){
    				b[list2.get(i)] = b[(n+list2.get(i)-1)%n];
    				list.add(list2.get(i));
    				flag[list2.get(i)] = false;
    				count++;
    			}
    		}
    		else{
    			now = -1;
    			min = 1000000001;
    			for(int i=0;i<n;i++){
    				if(flag[i]){
    					if(min>a[i]){
    						now = i;
    						min = a[i];
    					}
    				}
    			}
    			b[now] = a[now];
    			list.add(now);
    			count++;
    			flag[now] = false;
    		}
    	}
    	for(int i=0;i<n;i++){
    		ans += b[i];
    	}
    	out.println(ans);
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
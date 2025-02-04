
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main{

    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
        boolean flag = true;
        while(true){
        	int n = sc.nextInt();
        	if(n==0){
        		break;
        	}
            if(!flag){
                System.out.println();
            }
            flag = false;
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int c = sc.nextInt();
        	int d = sc.nextInt();
        	int amin = 100;
        	int bmin = 100;
        	int cmin = 100;
        	int dmin = 100;
            int aa = 20;
            int bb = 20;
            int cc = 20;
            int dd = 20;

        	for(int i=0;i<=a;i++){
        		int acount = a - i;
        		for(int j=0;j<=b;j++){
        			int bcount = b - j;
        			for(int k=0;k<=c;k++){
        				int ccount = c - k;
        				for(int l=0;l<=d;l++){
        					int dcount = d - l;
        					if(500*l+100*k+50*j+10*i-n<0){
        						break;
        					}
        					int x = 500*l+100*k+50*j+10*i-n;
                            dcount += x/500;
        					x %= 500;
        					ccount += x/100;
        					x %= 100;
        					bcount += x/50;
        					x %= 50;
        					acount += x/10;
        					if(amin+bmin+cmin+dmin>acount+bcount+ccount+dcount){
        						amin = acount;
        						bmin = bcount;
        						cmin = ccount;
        						dmin = dcount;
                                aa = i;
                                bb = j;
                                cc = k;
                                dd = l;
        					}
        				}
        			}
        		}
        	}

        	if(aa!=0){
        		out.println("10 "+aa);
        	}
        	if(bb!=0){
        		out.println("50 "+bb);
        	}
        	if(cc!=0){
        		out.println("100 "+cc);
        	}
        	if(dd!=0){
        		out.println("500 "+dd);
        	}
        	out.flush();
        	System.out.println();
        }
        sc.close();
        out.close();
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

import java.util.*;
import java.io.*;

public class Main{
    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
    	while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            int[][] t = new int[n][n+1];
    	    for(int i=0;i<n;i++){
    		   for(int j=0;j<n+1;j++){
    			  t[i][j] = sc.nextInt();
    		   }
    	    }
            int x = (int)Math.pow(2,n);
    	    int[] dp = new int[x];
            Arrays.fill(dp,100000000);
            dp[0] = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<x;j++){
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    for(int k=n-1;k>=0;k--){
                        if((j>>k)%2==1){
                            list.add(k);
                        }
                    }
                    if(list.size()!=i){
                        continue;
                    }
                    for(int k=n-1;k>=0;k--){
                        boolean flag = true;
                        for(int l=0;l<list.size();l++){
                            if(list.get(l)==k){
                                flag = false;
                                break;
                            }
                            if(list.get(l)<k){
                                break;
                            }
                        }
                        if(flag){
                            int min = t[k][0];
                            for(int m=0;m<list.size();m++){
                                min = Math.min(min,t[k][list.get(m)+1]);
                            }
                            dp[j+(int)Math.pow(2,k)] = Math.min(dp[j+(int)Math.pow(2,k)],dp[j]+min);
                        }
                    }
                }
            }
            /*for(int i=0;i<x;i++){
                out.println(dp[i]);
            }*/
            out.println(dp[x-1]);
            out.flush();
        }
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
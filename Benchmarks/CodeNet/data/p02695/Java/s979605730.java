import java.util.*;
import java.io.*;

public class Main {
    static int max = 0, n, m, q;
    static List<List<Integer>> list = new ArrayList<>();

    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);
    static public void main(String args[]) {
        n = sc.nextInt(); m = sc.nextInt(); q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            List<Integer> temp = new ArrayList<>();
            temp.add(a);
            temp.add(b);
            temp.add(c);
            temp.add(d);
            list.add(temp);
        }
        dfs(0, new ArrayList<Integer>());
        out.println(max);
        out.flush();
        sc.close();
        out.close();
    }

    static void dfs(int now, ArrayList<Integer> a) {
        if (now == n - 1) {
            int temp = 0;
            for (int i = a.get(n - 2); i <= m; i++) {
                temp = 0;
                a.add(i);
                for (List<Integer> j: list) {
                    if (a.get(j.get(1) - 1) - a.get(j.get(0) - 1) == j.get(2)) {
                        temp += j.get(3);
                    }
                }
                a.remove(n - 1);
            }
            max = Math.max(max, temp);
        } else if (now == 0) {
            for (int i = 1; i <= m; i++) {
                a.add(i);
                dfs(now + 1, a);
                a.remove(0);
            }
        } else {
            for (int i = a.get(now - 1); i <= m; i++) {
                a.add(i);
                dfs(now + 1, a);
                a.remove(now);
            }
        }
    }
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

/*
    Author: Anthony Ngene
    Created: 09/08/2020 - 21:48
*/

import java.io.*;
import java.util.*;

public class Main {
// That which does not kill us makes us stronger. - Friedrich Nietzsche
    public static void main(String[] args) throws IOException {
        in = new FastScanner();

        int n = in.intNext();
        long[] arr = in.nextLongArray(n);
        long[] dp = new long[n];
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + abs(arr[i] - arr[i - 1]);
            if (i > 1) dp[i] = min(dp[i], dp[i - 2] + abs(arr[i] - arr[i - 2]));
        }
        out.println(dp[n - 1]);

        out.close();
    }


// Generated Code Below:
private static final FastWriter out = new FastWriter();
private static FastScanner in;
static ArrayList<Integer>[] adj;
private static long e97 = (long)1e9 + 7;
static class FastWriter {
    private static final int IO_BUFFERS = 128 * 1024;
    private final StringBuilder out;
    public FastWriter() { out = new StringBuilder(IO_BUFFERS); }
    public FastWriter p(Object object) { out.append(object); return this; }
    public FastWriter p(String format, Object... args) { out.append(String.format(format, args)); return this; }
    public FastWriter pp(Object... args) { for (Object ob : args) { out.append(ob).append(" ");  } out.append("\n"); return this; }
    public void println(long[] arr) { out.append(Arrays.toString(arr)).append("\n"); }
    public void println(int[] arr) { out.append(Arrays.toString(arr)).append("\n"); }
    public void println(char[] arr) { out.append(Arrays.toString(arr)).append("\n"); }
    public void println(float[] arr) { out.append(Arrays.toString(arr)).append("\n"); }
    public void println(boolean[] arr) { out.append(Arrays.toString(arr)).append("\n"); }
    public <T>void println(T[] arr) { out.append(Arrays.toString(arr)).append("\n"); }
    public void println(long[][] arr) {  for (long[] row: arr) out.append(Arrays.toString(row)).append(" "); out.append("\n");  }
    public void println(int[][] arr) {  for (int[] row: arr) out.append(Arrays.toString(row)).append(" "); out.append("\n");  }
    public void println(char[][] arr) {  for (char[] row: arr) out.append(Arrays.toString(row)).append(" "); out.append("\n");  }
    public void println(float[][] arr) {  for (float[] row: arr) out.append(Arrays.toString(row)).append(" "); out.append("\n");  }
    public <T>void println(T[][] arr) {  for (T[] row: arr) out.append(Arrays.toString(row)).append(" "); out.append("\n");  }
    public FastWriter println(Object object) { out.append(object).append("\n"); return this; }
    public void toFile(String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(out.toString());
        writer.close();
    }
    public void close() throws IOException { System.out.print(out); }
}
static class FastScanner {
    private InputStream sin = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(){}
    public FastScanner(String filename) throws FileNotFoundException {
        File file = new File(filename);
        sin = new FileInputStream(file);
    }
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = sin.read(buffer);
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
    public long longNext() {
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
            }else if(b == -1 || !isPrintableChar(b) || b == ':'){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int intNext() {
        long nl = longNext();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double doubleNext() { return Double.parseDouble(next());}
    public long[] nextLongArray(final int n){
        final long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = longNext();
        return a;
    }
    public int[] nextIntArray(final int n){
        final int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = intNext();
        return a;
    }
    public ArrayList<Integer>[] getAdj(int n) {
        ArrayList<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        return adj;
    }
    public ArrayList<Integer>[] adjacencyList(int n, int m) throws IOException {
        adj = getAdj(n);
        for (int i = 0; i < m; i++) {
            int a = intNext(), b = intNext();
            adj[a].add(b);
            adj[b].add(a);
        }
        return adj;
    }
}
private static long abs(long a){    return (a>=0) ? a: -a;  }
private static long min(long... ins){ long min = ins[0]; for(int i=1; i<ins.length; i++){ if(ins[i] < min) min = ins[i]; } return min; }
}

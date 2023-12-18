/*
    Author: Anthony Ngene
    Created: 25/08/2020 - 06:19
*/

import java.io.*;
import java.util.*;

public class Main {
// Either you run the day, or the day runs you. - Jim Rohn
    static int[][] grid;
    static int rLen, cLen, k;
    public static void main(String[] args) throws IOException {
        in = new FastScanner();

        rLen = in.intNext();
        cLen = in.intNext();
        k = in.intNext();
        grid = new int[rLen + 1][cLen];
        for (int r = 1; r < rLen + 1; r++) {
            String seq = in.next();
//            out.println(seq);
            for (int c = 0; c < cLen; c++) {
                grid[r][c] = grid[r - 1][c];
                grid[r][c] += seq.charAt(c) == '1' ? 1 : 0;
            }
        }
//        out.println(grid);

        int mxRow = 1 << (rLen - 1);
        long ans = e97;
        for (int i = 0; i < mxRow; i++) {
            List<Integer> selected = new ArrayList<>();
            for (int j = 0; j < rLen; j++) {
                if ((i & (1 << j)) != 0) selected.add(j + 1);
            }
            int cuts = getCuts(selected);
            if (cuts != -1) ans = min(ans, cuts);
        }
        out.println(ans);

        out.close();
    }

    static int getCuts(List<Integer> rowCuts) {
        rowCuts.add(rLen);
        int cuts = rowCuts.size() - 1;
        HashMap<Integer, Integer> prevCuts = new HashMap<>();
        int c = 0;
        while (c < cLen) {
            int prev = 0;
            boolean recalculate = false;
            for (int r : rowCuts) {
                int size = grid[r][c] - grid[prev][c];
                if (size > k) return -1;
                if (size + prevCuts.getOrDefault(r, 0) > k) {
                    cuts += 1;
                    for (int el: rowCuts) prevCuts.put(el, 0);
                    recalculate = true;
                    break;
                }
                prevCuts.merge(r, size, Integer::sum);
                prev = r;
            }
            if (!recalculate) c++;
        }

        return cuts;
    }

// checks: 1. edge cases   2. overflow   3. possible errors (e.g 1/0, arr[out])   4. time/space complexity
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
    public FastWriter pp(int[] args) { for (int ob : args) { out.append(ob).append(" ");  } out.append("\n"); return this; }
    public FastWriter pp(long[] args) { for (long ob : args) { out.append(ob).append(" ");  } out.append("\n"); return this; }
    public FastWriter pp(char[] args) { for (char ob : args) { out.append(ob).append(" ");  } out.append("\n"); return this; }
    public void println(long[] arr) { out.append(Arrays.toString(arr)).append("\n"); }
    public void println(int[] arr) { out.append(Arrays.toString(arr)).append("\n"); }
    public void println(char[] arr) { out.append(Arrays.toString(arr)).append("\n"); }
    public void println(double[] arr) { out.append(Arrays.toString(arr)).append("\n"); }
    public void println(boolean[] arr) { out.append(Arrays.toString(arr)).append("\n"); }
    public <T>void println(T[] arr) { out.append(Arrays.toString(arr)).append("\n"); }
    public void println(long[][] arr) {  for (long[] row: arr) out.append(Arrays.toString(row)).append("\n"); }
    public void println(int[][] arr) {  for (int[] row: arr) out.append(Arrays.toString(row)).append("\n"); }
    public void println(char[][] arr) {  for (char[] row: arr) out.append(Arrays.toString(row)).append("\n"); }
    public void println(double[][] arr) {  for (double[] row: arr) out.append(Arrays.toString(row)).append("\n"); }
    public <T>void println(T[][] arr) {  for (T[] row: arr) out.append(Arrays.toString(row)).append("\n"); }
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
    public double[] nextDoubleArray(final int n){
        final double[] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = doubleNext();
        return a;
    }
    public ArrayList<Integer>[] getAdj(int n) {
        ArrayList<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        return adj;
    }
    public ArrayList<Integer>[] adjacencyList(int nodes, int edges) throws IOException {
        return adjacencyList(nodes, edges, false);
    }
    public ArrayList<Integer>[] adjacencyList(int nodes, int edges, boolean isDirected) throws IOException {
        adj = getAdj(nodes);
        for (int i = 0; i < edges; i++) {
            int a = intNext(), b = intNext();
            adj[a].add(b);
            if (!isDirected) adj[b].add(a);
        }
        return adj;
    }
}

private static long min(long... ins){ long min = ins[0]; for(int i=1; i<ins.length; i++){ if(ins[i] < min) min = ins[i]; } return min; }

}

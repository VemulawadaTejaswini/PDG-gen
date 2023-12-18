import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Comparator;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    // 標準入力
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 標準入力数値配列用 int
    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    /* 標準入力数値配列用 long */
    static long[] inputLongArr() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        long[] longarray = new long[strarray.length];
        for (int i = 0; i < longarray.length; i++) {
            longarray[i] = Long.parseLong(strarray[i]);
        }
        return longarray;
    }

    // 標準入力数値リスト用 int
    static List<Integer> inputIntList() throws Exception {
        List<String> strList = Arrays.asList(br.readLine().trim().split(" "));
        List<Integer> intList = new ArrayList<Integer>();
        for (String elem : strList){
            intList.add(Integer.parseInt(elem));
        }
        return intList;
    }

    // 標準入力数値配列用 integer 降順ソート用
    static Integer[] inputvalInteger() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        Integer[] intarray = new Integer[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    /*標準入力long*/
    static long inputLong() throws Exception {
        return Long.parseLong(br.readLine());
    }

    /*標準入力long*/
    static int inputInt() throws Exception {
        return Integer.parseInt(br.readLine());
    }




    public static void main(String[] args) throws Exception {
        // write your code here
        /*
        long [] nck = inputLongArr();
        long n = nck[0];
        long c = nck[1];
        long k = nck[2];
        long [] tl = new long [(int) n];
        for (int i=0; i<n; i++){
            tl[i] = inputLong();
        }
         */
        final IOFast io = new IOFast();
        int n = io.nextInt();
        int c = io.nextInt();
        int k = io.nextInt();
        int[] tl = io.nextIntArray(n);
        Arrays.sort(tl);
        long ans = 0;

        int index =0;
        if(c<n){
            while(index<n){
                for (int i=1; i<c; i++){
                    if (index+i >= n || tl[index+i] - tl[index] >k){
                        index+=i;
                        ans ++;
                        break;
                    }else if(i == c-1){
                        index+=c;
                        ans ++;
                    }
                }

            }

        }else{
            while(index<n){
                for (int i=1; i<n;i++){
                    if (index+i >= n || tl[index+i] - tl[index] >k){
                        index+=i;
                        ans ++;
                        break;
                    }else if(i == n-1){
                        index+=n;
                        ans ++;
                    }
                }

            }

        }

        System.out.println(ans);

    }
    static class EndOfFileRuntimeException extends RuntimeException {
        private static final long serialVersionUID = -8565341110209207657L; }
        
    static
    public class IOFast {
        private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        private PrintWriter out = new PrintWriter(System.out);

        void setFileIn(String ins) throws IOException { in.close(); in = new BufferedReader(new FileReader(ins)); }
        void setFileOut(String outs) throws IOException { out.flush(); out.close(); out = new PrintWriter(new FileWriter(outs)); }
        void setFileIO(String ins, String outs) throws IOException { setFileIn(ins); setFileOut(outs); }

        private static int pos, readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500*8*2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static { for(int i = 0; i < 10; i++) { isDigit['0' + i] = true; } isDigit['-'] = true; isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true; isLineSep['\r'] = isLineSep['\n'] = true; }
        public int read() throws IOException { if(pos >= readLen) { pos = 0; readLen = in.read(buffer); if(readLen <= 0) { throw new EndOfFileRuntimeException(); } } return buffer[pos++]; }
        public int nextInt() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isSpace); int i = 0; int ret = 0; if(str[0] == '-') { i = 1; } for(; i < len; i++) ret = ret * 10 + str[i] - '0'; if(str[0] == '-') { ret = -ret; } return ret; }
        public long nextLong() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isSpace); int i = 0; long ret = 0; if(str[0] == '-') { i = 1; } for(; i < len; i++) ret = ret * 10 + str[i] - '0'; if(str[0] == '-') { ret = -ret; } return ret; }
        public char nextChar() throws IOException { while(true) { final int c = read(); if(!isSpace[c]) { return (char)c; } } }
        int reads(int len, boolean[] accept) throws IOException { try { while(true) { final int c = read(); if(accept[c]) { break; } if(str.length == len) { char[] rep = new char[str.length * 3 / 2]; System.arraycopy(str, 0, rep, 0, str.length); str = rep; } str[len++] = (char)c; } } catch(EndOfFileRuntimeException e) { ; } return len; }
        int reads(char[] cs, int len, boolean[] accept) throws IOException { try { while(true) { final int c = read(); if(accept[c]) { break; } cs[len++] = (char)c; } } catch(EndOfFileRuntimeException e) { ; } return len; }
        public char[] nextLine() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isLineSep); try { if(str[len-1] == '\r') { len--; read(); } } catch(EndOfFileRuntimeException e) { ; } return Arrays.copyOf(str, len); }
        public String nextString() throws IOException { return new String(next()); }
        public char[] next() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isSpace); return Arrays.copyOf(str, len); }
        //		public int next(char[] cs) throws IOException { int len = 0; cs[len++] = nextChar(); len = reads(cs, len, isSpace); return len; }
        public double nextDouble() throws IOException { return Double.parseDouble(nextString()); }
        public long[] nextLongArray(final int n) throws IOException { final long[] res = new long[n]; for(int i = 0; i < n; i++) { res[i] = nextLong(); } return res; }
        public int[] nextIntArray(final int n) throws IOException { final int[] res = new int[n]; for(int i = 0; i < n; i++) { res[i] = nextInt(); } return res; }
        public int[][] nextIntArray2D(final int n, final int k) throws IOException { final int[][] res = new int[n][]; for(int i = 0; i < n; i++) { res[i] = nextIntArray(k); } return res; }
        public int[][] nextIntArray2DWithIndex(final int n, final int k) throws IOException { final int[][] res = new int[n][k+1]; for(int i = 0; i < n; i++) { for(int j = 0; j < k; j++) { res[i][j] = nextInt(); } res[i][k] = i; } return res; }
        public double[] nextDoubleArray(final int n) throws IOException { final double[] res = new double[n]; for(int i = 0; i < n; i++) { res[i] = nextDouble(); } return res; }
    }

}


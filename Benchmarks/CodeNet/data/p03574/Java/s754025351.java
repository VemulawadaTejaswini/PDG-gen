import java.io.PrintWriter;
import java.util.*;
import java.io.*;
import java.util.function.*;
import java.util.stream.Stream;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) { new Main().stream(); }

    final IO          io   = new IO();
    final PrintWriter out  = new PrintWriter(System.out);

    final int INF = Integer.MAX_VALUE/2;

    void stream(){ solve(); out.flush(); }

    /// ********** 本体 ********** ///

    void solve() {
        int H = io.Int();
        int W = io.Int();
        String[] S = new String[H];
        REP(H,i->S[i]=io.String());
        int[][] ans = new int[H][];
        REP(H,i->ans[i]=new int[W]);
        int[] dx={1,1,0,-1,-1,-1,0,1};
        int[] dy={0,1,1,1,0,-1,-1,-1};
        for(int i=0;i<H;++i){
            for(int j=0;j<W;++j){
                if(S[i].charAt(j)=='#') {
                    ans[i][j] = -1;
                }
            }
        }
        for(int i=0;i<H;++i){
            for(int j=0;j<W;++j){
                for(int k=0;k<8;++k){
                    int ny=i+dy[k];
                    int nx=j+dx[k];
                    if(0<=ny&&ny<H&&0<=nx&&nx<W){
                        if(S[ny].charAt(nx)=='#'&&ans[i][j]!=-1){
                            ans[i][j]++;
                        }
                    }
                }
            }
        }

        for(int i=0;i<H;++i){
            for(int j=0;j<W;++j){
                if(ans[i][j]!=-1)
                    out.print(ans[i][j]);
                else
                    out.print('#');
            }
            out.println();
        }


    }

    /// ********** __ ********** ///

    void FOR(int a, int b, Consumer<Integer>act) { for(int i = a; i < b; ++i) act.accept(i); }
    void REP(int a, Consumer<Integer>act) { FOR(0, a, act); }
    Integer[] int2IntegerArr(int[] arr) { return Arrays.stream(arr).boxed().toArray(Integer[]::new); }
    Character[] str2CharacterArr(String str) { return str.chars().mapToObj(c->(char)c).toArray(Character[]::new); }
}
/// ********** その他 ********** ///



/// ********** ___ ********** ///

class IO{
    private final InputStream in = System.in;
    private final byte[] buffer  = new byte[1<<12];
    private int   ptr = 0, buffLen = 0;
    private boolean hasNextByte     ()      {
        if(ptr < buffLen) return true;
        ptr = 0;
        try{ buffLen = in.read(buffer); } catch (IOException e){ e.printStackTrace(); }
        return buffLen > 0;
    }
    private int     readByte        ()      { return hasNextByte()? buffer[ptr++] : -1; }
    private boolean isPrintableChar (int c) { return 33 <= c && c <= 126; } //ASCII
    private void    skipUnprintable ()      { while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; }
    private boolean hasNext         ()      { skipUnprintable(); return hasNextByte();}
    private String  next            ()      {
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)){ sb.appendCodePoint(b); b = readByte(); }
        return sb.toString();
    }
    public String String () { return next(); }
    public char   Char   () { return next().charAt(0);}
    public int    Int    () { return Integer.parseInt(next());}
    public long   Long   () { return Long.parseLong(next());}
    public double Double () { return Double.parseDouble(next());}
    public String[] StringArr (final int n) { final String[] arr = new String[n]; for(int i = 0; i < n; ++i) arr[i] = String(); return arr; }
    public char  [] CharArr   (final int n) { final char  [] arr = new char  [n]; for(int i = 0; i < n; ++i) arr[i] = Char  (); return arr; }
    public int   [] IntArr    (final int n) { final int   [] arr = new int   [n]; for(int i = 0; i < n; ++i) arr[i] = Int   (); return arr; }
    public long  [] LongArr   (final int n) { final long  [] arr = new long  [n]; for(int i = 0; i < n; ++i) arr[i] = Long  (); return arr; }
    public double[] DoubleArr (final int n) { final double[] arr = new double[n]; for(int i = 0; i < n; ++i) arr[i] = Double(); return arr; }
}
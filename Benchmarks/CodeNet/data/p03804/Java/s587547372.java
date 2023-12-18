import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;


/**
 *
 * @author Pradyumn Agrawal coderbond007
 */
public class Main{
    public static InputStream inputStream = System.in;
    public static FastReader in = new FastReader(inputStream);
    public static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    public static int maxval = Integer.MAX_VALUE;
    public static int minval = Integer.MIN_VALUE;
    public static void main(String[] args)throws java.lang.Exception
    {
        new Main().run();
        out.close();
    }
    void run()
    {
        int n = ni(),m = ni();
        char[][] map = nm(n,n);
        char[][] p = nm(m,m);
        for(int i = 0;i < n - m; i++){
            for(int j = 0;j < n - m; j++){
                if(check(map,p,i,j)){
                    out.println("Yes");
                    return;
                }
            }
        }
        out.println("No");
    }
    boolean check(char[][] map, char[][] p, int i, int j)
    {
        int n = map.length;
        int m = p.length;
        for(int k = i;k < i + m; k++){
            for(int d = j;d < j + m; d++){
                if(map[k][d] == p[k - i][d - j]){
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    private static int ni(){ 
        return in.nextInt();
    }
    private static long nl(){
        return in.nextLong();
    }
    private static String ns(){
        return in.nextString();
    }
    private static char nc(){
        return in.nextCharacter();
    }
    private static double nd(){
        return in.nextDouble();
    }

    private static char[] ns(int n)
    {
        char[] a = new char[n];
        for(int i=0;i<n;i++) a[i] = nc();
        return a;
    }

    private static char[][] nm(int n, int m)
    {
        char[][] map = new char[n][];
        for(int i=0;i<n;i++) map[i] = ns(m);
        return map;
    }

    private static int[] na(int n)
    {
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = ni();
        return a;
    }

    private static long[] nal(int n)
    {
        long[] a = new long[n];
        for(int i=0;i<n;i++) a[i] = nl();
        return a;
    }
    //out.println(Arrays.stream());
}

class FastReader{
    private boolean finished = false;

    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private SpaceCharFilter filter;

    public FastReader(InputStream stream){
        this.stream = stream;
    }

    public int read(){
        if (numChars == -1){
            throw new InputMismatchException ();
        }
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read (buf);
            } catch (IOException e){
                throw new InputMismatchException ();
            }
            if (numChars <= 0){
                return -1;
            }
        }
        return buf[curChar++];
    }

    public int peek(){
        if (numChars == -1){
            return -1;
        }
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read (buf);
            } catch (IOException e){
                return -1;
            }
            if (numChars <= 0){
                return -1;
            }
        }
        return buf[curChar];
    }

    public int nextInt(){
        int c = read ();
        while (isSpaceChar (c))
            c = read ();
        int sgn = 1;
        if (c == '-'){
            sgn = -1;
            c = read ();
        }
        int res = 0;
        do{
            if(c==','){
                c = read();
            }
            if (c < '0' || c > '9'){
                throw new InputMismatchException ();
            }
            res *= 10;
            res += c - '0';
            c = read ();
        } while (!isSpaceChar (c));
        return res * sgn;
    }

    public long nextLong(){
        int c = read ();
        while (isSpaceChar (c))
            c = read ();
        int sgn = 1;
        if (c == '-'){
            sgn = -1;
            c = read ();
        }
        long res = 0;
        do{
            if (c < '0' || c > '9'){
                throw new InputMismatchException ();
            }
            res *= 10;
            res += c - '0';
            c = read ();
        } while (!isSpaceChar (c));
        return res * sgn;
    }

    public String nextString(){
        int c = read ();
        while (isSpaceChar (c))
            c = read ();
        StringBuilder res = new StringBuilder ();
        do{
            res.appendCodePoint (c);
            c = read ();
        } while (!isSpaceChar (c));
        return res.toString ();
    }

    public boolean isSpaceChar(int c){
        if (filter != null){
            return filter.isSpaceChar (c);
        }
        return isWhitespace (c);
    }

    public static boolean isWhitespace(int c){
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    private String readLine0(){
        StringBuilder buf = new StringBuilder ();
        int c = read ();
        while (c != '\n' && c != -1){
            if (c != '\r'){
                buf.appendCodePoint (c);
            }
            c = read ();
        }
        return buf.toString ();
    }

    public String nextLine(){
        String s = readLine0 ();
        while (s.trim ().length () == 0)
            s = readLine0 ();
        return s;
    }

    public String nextLine(boolean ignoreEmptyLines){
        if (ignoreEmptyLines){
            return nextLine ();
        }else{
            return readLine0 ();
        }
    }

    public BigInteger nextBigInteger(){
        try{
            return new BigInteger (nextString());
        } catch (NumberFormatException e){
            throw new InputMismatchException ();
        }
    }

    public char nextCharacter(){
        int c = read ();
        while (isSpaceChar (c))
            c = read ();
        return (char) c;
    }

    public double nextDouble(){
        int c = read ();
        while (isSpaceChar (c))
            c = read ();
        int sgn = 1;
        if (c == '-'){
            sgn = -1;
            c = read ();
        }
        double res = 0;
        while (!isSpaceChar (c) && c != '.'){
            if (c == 'e' || c == 'E'){
                return res * Math.pow (10, nextInt ());
            }
            if (c < '0' || c > '9'){
                throw new InputMismatchException ();
            }
            res *= 10;
            res += c - '0';
            c = read ();
        }
        if (c == '.'){
            c = read ();
            double m = 1;
            while (!isSpaceChar (c)){
                if (c == 'e' || c == 'E'){
                    return res * Math.pow (10, nextInt ());
                }
                if (c < '0' || c > '9'){
                    throw new InputMismatchException ();
                }
                m /= 10;
                res += (c - '0') * m;
                c = read ();
            }
        }
        return res * sgn;
    }

    public boolean isExhausted(){
        int value;
        while (isSpaceChar (value = peek ()) && value != -1)
            read ();
        return value == -1;
    }
    public SpaceCharFilter getFilter(){
        return filter;
    }

    public void setFilter(SpaceCharFilter filter){
        this.filter = filter;
    }

    public interface SpaceCharFilter{
        public boolean isSpaceChar(int ch);
    }
}
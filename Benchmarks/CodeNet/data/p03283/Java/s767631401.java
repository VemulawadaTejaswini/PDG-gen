import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.InputMismatchException;
public class Main {
    static Bus [] station ;
    public static void main(String[] args)throws IOException {
        InputReader in = new InputReader(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int q = in.nextInt();
        station = new Bus[m];
        int [][] st = new int [m+1][n+1];
        for(int i=0;i<m;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            station[i]= new Bus(a,b);
        }
        Arrays.sort(station);
//        for(int i =0;i<m;i++){
//            System.out.print(station[i]+" ");
//        }
//        System.out.println();
        for(int i =0;i<m;i++){
            for(int j=1;j<=n;j++){
                if(station[i].l==j)
                    st[i+1][j]=st[i][j]+1;
                else {
                    st[i+1][j]=st[i][j];
                }
            }
        }
        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int l =0 ; int h =m;
            int left =-1;
            for(int j =0;j<m;j++){
                if(station[j].f>=a){
                    left=j;
                    break;
                }

            }
            int right =m;
            for(int j=m-1;j>=0;j--){
                if(station[j].f<=b){
                    right=j;
                    break;
                }
            }
//            System.out.println("Left"+left+ "  Right:"+right);
            int ans=0;
            if(right==m || left==-1){
                System.out.println(0);
            }
            else {
                for(int i1 = 1;i1<=b;i1++){
//                System.out.println(i1+":"+b);
                    ans+=st[right+1][i1]-st[left][i1];
                }
                System.out.println(ans);
            }

            }
    }
    static public class Bus implements Comparable<Bus>{
        int f;int l;
        private Bus(int f,int l){
            this.f = f;
            this.l = l;
        }
        public int compareTo(Bus o){
            int compare = Integer.compare(f,o.f);
            if (compare==0){
                compare=Integer.compare(l,o.l);
            }
            return compare;

        }
        public String toString(){
            return "["+f+","+l+"]";
        }
    }

    static public class InputReader {
        private boolean finished = false;

        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int peek() {
            if (numChars == -1) {
                return -1;
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    return -1;
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private String readLine0() {
            StringBuilder buf = new StringBuilder();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r') {
                    buf.appendCodePoint(c);
                }
                c = read();
            }
            return buf.toString();
        }

        public String readLine() {
            String s = readLine0();
            while (s.trim().length() == 0) {
                s = readLine0();
            }
            return s;
        }

        public String readLine(boolean ignoreEmptyLines) {
            if (ignoreEmptyLines) {
                return readLine();
            } else {
                return readLine0();
            }
        }

        public BigInteger readBigInteger() {
            try {
                return new BigInteger(nextString());
            } catch (NumberFormatException e) {
                throw new InputMismatchException();
            }
        }

        public char nextCharacter() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            return (char) c;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E') {
                    return res * Math.pow(10, nextInt());
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E') {
                        return res * Math.pow(10, nextInt());
                    }
                    if (c < '0' || c > '9') {
                        throw new InputMismatchException();
                    }
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public boolean isExhausted() {
            int value;
            while (isSpaceChar(value = peek()) && value != -1) {
                read();
            }
            return value == -1;
        }

        public String next() {
            return nextString();
        }

        public SpaceCharFilter getFilter() {
            return filter;
        }

        public void setFilter(SpaceCharFilter filter) {
            this.filter = filter;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
        public int[] nextIntArray(int n){
            int[] array=new int[n];
            for(int i=0;i<n;++i)array[i]=nextInt();
            return array;
        }
        public int[] nextSortedIntArray(int n){
            int array[]=nextIntArray(n);
            Arrays.sort(array);
            return array;
        }
        public int[] nextSumIntArray(int n){
            int[] array=new int[n];
            array[0]=nextInt();
            for(int i=1;i<n;++i)array[i]=array[i-1]+nextInt();
            return array;
        }
        public long[] nextLongArray(int n){
            long[] array=new long[n];
            for(int i=0;i<n;++i)array[i]=nextLong();
            return array;
        }
        public long[] nextSumLongArray(int n){
            long[] array=new long[n];
            array[0]=nextInt();
            for(int i=1;i<n;++i)array[i]=array[i-1]+nextInt();
            return array;
        }
        public long[] nextSortedLongArray(int n){
            long array[]=nextLongArray(n);
            Arrays.sort(array);
            return array;
        }
    }

}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static FastScanner scan = new FastScanner();
    static java.io.PrintWriter out = new java.io.PrintWriter(System.out);

    public static void main(String[] args) {
        char[] a = getLine()[0].toCharArray();
        switch (a[a.length-1]){
            case '2':
            case '4':
            case '5':
            case '7':
            case '9':
                puts("hon");
                break;
            case '0':
            case '1':
            case '6':
            case '8':
                puts("pon");
                break;
            case '3':
                puts("bon");
                break;
        }
        out.flush();
    }

    public static void puts(Object mes){
        out.println(mes);
    }

    public static long[] getLineLongs(){
        return java.util.stream.Stream.of(getNewLine()).mapToLong(Long::parseLong).toArray();
    }

    public static int[] getLineInts(){
        return java.util.stream.Stream.of(getNewLine()).mapToInt(Integer::parseInt).toArray();
    }

    public static String[] getNewLine(){
        return new java.util.Scanner(System.in).nextLine().split(" ");
    }

    public static List<Integer> getListInts(){
        int[] a = getLineInts();
        List<Integer> b = new ArrayList<>();
        for(int i = 0; i < a.length ; i++){
            b.add(a[i]);
        }
        return b;
    }

    public static String[] getLine(){
        String line = scan.next();
        String[] sp = line.split(" ");
        if(sp.length == 1){
            //System.out.println(line);
            return new String[]{line};
        }else{
            return sp;
        }
    }
}

class FastScanner {
    private final java.io.InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (java.io.IOException e) {
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
        if (!hasNext()) throw new java.util.NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
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
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
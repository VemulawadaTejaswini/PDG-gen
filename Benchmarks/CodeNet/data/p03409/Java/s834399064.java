import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static int n;
    static Pair[] redPairs;
    static Pair[] bluePairs;
    static Map<Pair,List<Pair>> map;
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        n=scanner.nextInt();
        int[] a=new int[n];
        redPairs=new Pair[n];
        bluePairs=new Pair[n];
        map=new HashMap<>();
        for(int i=0;i<n;i++){
            redPairs[i]=new Pair(scanner.nextInt(),scanner.nextInt());
        }
        for(int i=0;i<n;i++){
            bluePairs[i]=new Pair(scanner.nextInt(),scanner.nextInt());
        }
        redPairs=Arrays.stream(redPairs).sorted(Comparator.comparing(pair ->((Pair)pair).y).reversed()).toArray(Pair[]::new);
        bluePairs=Arrays.stream(bluePairs).sorted(Comparator.comparing(pair->pair.x)).toArray(Pair[]::new);


        Map<Pair,List<Pair>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            Pair b=bluePairs[i];
            List<Pair> list=new ArrayList<>();
            for(Pair red:redPairs){
                if(red.x<b.x&&red.y<b.y) list.add(red);
            }
            map.put(b,list);
        }
        Map<Pair,Boolean> used=new HashMap<>();
        for(int i=0;i<n;i++){
            used.put(redPairs[i],false);
        }
        int result=0;
        for(int i=0;i<n;i++){
            Pair b=bluePairs[i];
            for(Pair r:map.get(b)){
                if(!used.get(r)){
                    result++;
                    used.put(r,true);
                    break;
                }
            }
        }
        put(result);

    }

    public static void put(Object object) {
        System.out.println(object);
    }
    public static String format(String string, Object... args) {
        return String.format(string, args);
    }
}

final class Scanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

class Pair {
    final public int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return (x+y)%Integer.MAX_VALUE;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result=super.equals(obj);
        if(obj.getClass()!=this.getClass()){
            return false;
        }
        Pair pair=(Pair)obj;
        if(this.x==pair.x&&this.y==pair.y) return true;
        return false;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
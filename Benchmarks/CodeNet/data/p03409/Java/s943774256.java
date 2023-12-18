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
        for(int i=0;i<n;i++){
            Pair key=redPairs[i];
            List val=new ArrayList();
            for(int j=0;j<n;j++){
                if(key.x<bluePairs[j].x&&key.y<bluePairs[j].y){
                    val.add(bluePairs[j]);
                }
            }
            map.put(key,val);
        }
        for(int i=0;i<n;i++){
            //put(format("%s->%s",redPairs[i].toString(),map.get(redPairs[i]).toString()));
        }
        Map<Pair,Boolean> used=new HashMap<>();
        for(int i=0;i<n;i++){
            used.put(bluePairs[i],false);
        }
        put(func(0,used));

    }
    static int func(int i,Map<Pair,Boolean> used){
        if(i==n) {
            //used.entrySet().stream().forEach(e->{System.out.print(format("%s->%s ",e.getKey(),e.getValue()?"T":"F"));});
            //put(":::end");
            return 0;
        }
        //put(format("i=%d",i));
        List<Pair> list=map.get(redPairs[i]);

        Map<Pair,Boolean> used2=new HashMap<>();
        for(int j=0;j<n;j++){
            used2.put(bluePairs[j],used.get(bluePairs[j]));
        }
        int temp2=func(i+1,used2);
        int max=temp2;
        for(Pair bPair:list){
            //put(format("bPair=",bPair.toString()));
            if(!used.get(bPair)){
                Map<Pair ,Boolean> used1=new HashMap<>();
                for(int j=0;j<n;j++){
                    used1.put(bluePairs[j],used.get(bluePairs[j]));
                }
                used1.put(bPair,true);
                int temp1=func(i+1,used1)+1;
                //put(format("temp1,temp2=%d,%d",temp1,temp2));
                max=Math.max(max,Math.max(temp1,temp2));
            }
        }
        return max;


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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
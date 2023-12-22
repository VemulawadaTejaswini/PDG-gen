import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main implements Runnable {
    public static void main(String[] args) {
        new Thread(null,new Main(), "" ,Runtime.getRuntime().maxMemory()).start();
    }

    public void run() {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] parent = new int[n];
        Arrays.fill(parent, -1);
        Map<Integer, List<Integer>> routeMap = new HashMap<>();
        for(int i = 0;i < m;i++) {
            Integer a = sc.nextInt() - 1;
            Integer b = sc.nextInt() - 1;
            List<Integer> route = routeMap.get(a);
            if(route == null) {
                route = new ArrayList<>();
                route.add(b);
            }
            else {
                route.add(b);
            }
            routeMap.put(a, route);
            route = routeMap.get(b);
            if(route == null) {
                route = new ArrayList<>();
                route.add(a);
            }
            else {
                route.add(a);
            }
            routeMap.put(b, route);
        }

        Queue<Integer> que = new ArrayDeque<>();
        que.offer(Integer.valueOf(0));
        while(!que.isEmpty()) {
            Integer room = que.poll();
            List<Integer> route = routeMap.get(room);
            for(Integer next : route) {
                if(parent[next.intValue()] != -1) continue;
                que.offer(next);
                parent[next.intValue()] = room.intValue();
            }
        }

        PrintWriter out =  new PrintWriter(System.out);
        out.println("Yes");
        for(int i = 1;i < n;i++) {
            out.println(parent[i] + 1);
        }
        out.flush();
    }
}

class FastScanner {
    private final InputStream in = System.in;
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
    public long nextLong() {
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
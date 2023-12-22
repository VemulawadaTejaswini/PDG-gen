import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            PriorityQueue<Long> que = new PriorityQueue<Long>((ma, mb) -> -Long.compare(ma, mb));
            HashMap<Long, Long> coin = new HashMap<Long, Long>();

            que.add(n);
            coin.put(n, 0L);

            long ans = Long.MAX_VALUE;

            while(!que.isEmpty()){
                long mn = que.poll();
                long mcoin = coin.get(mn);

                if(mn == 1){
                    ans = Math.min(ans, mcoin + d);
                    continue;
                }

                if(mn % 5 != 0){
                    long mmn = mn / 5 + 1;
                    long mmcoin = mcoin + (5 - (mn % 5)) * d + c;
                    long mm2coin = Long.MAX_VALUE;
                    if(mn - mmn <= (Long.MAX_VALUE-mcoin) / d){
                        mm2coin = mcoin + (mn - mmn) * d;
                    }
                    addQue(que, coin, mmn, Math.min(mmcoin, mm2coin));
                }
                if(mn % 3 != 0){
                    long mmn = mn / 3 + 1;
                    long mmcoin = mcoin + (3 - (mn % 3)) * d + b;
                    long mm2coin = Long.MAX_VALUE;
                    if(mn - mmn <= (Long.MAX_VALUE-mcoin) / d){
                        mm2coin = mcoin + (mn - mmn) * d;
                    }
                    addQue(que, coin, mmn, Math.min(mmcoin, mm2coin));
                }
                if(mn % 2 != 0){
                    long mmn = mn / 2 + 1;
                    long mmcoin = mcoin + (2 - (mn % 2)) * d + a;
                    long mm2coin = Long.MAX_VALUE;
                    if(mn - mmn <= (Long.MAX_VALUE-mcoin) / d){
                        mm2coin = mcoin + (mn - mmn) * d;
                    }
                    addQue(que, coin, mmn, Math.min(mmcoin, mm2coin));
                }

                if(mn >= 5){
                    long mmn = mn / 5;
                    long mmcoin = mcoin + (mn % 5) * d + c;
                    long mm2coin = Long.MAX_VALUE;
                    if(mn - mmn <= (Long.MAX_VALUE-mcoin) / d){
                        mm2coin = mcoin + (mn - mmn) * d;
                    }
                    addQue(que, coin, mmn, Math.min(mmcoin, mm2coin));
                }
                if(mn >= 3){
                    long mmn = mn / 3;
                    long mmcoin = mcoin + (mn % 3) * d + b;
                    long mm2coin = Long.MAX_VALUE;
                    if(mn - mmn <= (Long.MAX_VALUE-mcoin) / d){
                        mm2coin = mcoin + (mn - mmn) * d;
                    }
                    addQue(que, coin, mmn, Math.min(mmcoin, mm2coin));
                }
                if(mn >= 2){
                    long mmn = mn / 2;
                    long mmcoin = mcoin + (mn % 2) * d + a;
                    long mm2coin = Long.MAX_VALUE;
                    if(mn - mmn <= (Long.MAX_VALUE-mcoin) / d){
                        mm2coin = mcoin + (mn - mmn) * d;
                    }
                    addQue(que, coin, mmn, Math.min(mmcoin, mm2coin));
                }

            }

            System.out.println(ans);
        }
    }

    public static void addQue(PriorityQueue<Long> que, HashMap<Long, Long> coin, long mn, long mcoin){
        if(coin.containsKey(mn)){
            long m2coin = coin.remove(mn);
            coin.put(mn, Math.min(mcoin, m2coin));
        }else{
            que.add(mn);
            coin.put(mn, mcoin);
        }
    }

    private static class FastScanner {
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

        private static boolean isPrintableChar(int c) {
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

}

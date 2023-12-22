import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int[][] map = new int[h+2][w+2];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < map.length; i++) {
            map[i][0] = -1;
            map[i][w+1] = -1;
        }
        for (int i = 0; i < map[0].length; i++) {
            map[0][i] = -1;
            map[h+1][i] = -1;
        }

        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '@'){
                    map[i+1][j+1] = -1;
                }
            }
        }

        map[x1][y1] = 0;
        Integer[] pos = new Integer[]{x1, y1, 0}; // [2] = dir , 1 = x, 2 = y;
        ArrayDeque<Integer[]> list = new ArrayDeque<Integer[]>();
        list.add(pos);

        while(!list.isEmpty()){
            Integer[] next = list.poll();
            int mx = next[0];
            int my = next[1];
            int mlen = map[mx][my];
            if(next[2] == 0 || next[2] == 2){

                for (int i = 1; i < 1000010; i++) {
                    if(map[mx+i][my] != -1){
                        if(mlen + 1 < map[mx+i][my]){
                            map[mx+i][my] = mlen+1;
                            list.add(new Integer[]{mx+i, my, 1});
                        }
                    }else{
                        break;
                    }
                }
                for (int i = 1; i < 1000010; i++) {
                    if(map[mx-i][my] != -1){
                        if(mlen + 1 < map[mx-i][my]){
                            map[mx-i][my] = mlen+1;
                            list.add(new Integer[]{mx-i, my, 1});
                        }
                    }else{
                        break;
                    }
                }
            }
            if(next[2] == 0 || next[2] == 1){
                for (int i = 1; i < 1000010; i++) {
                    if(map[mx][my+i] != -1){


                        if(mlen + 1 < map[mx][my+i]){
                            map[mx][my+i] = mlen+1;
                            list.add(new Integer[]{mx, my+i, 2});
                        }
                    }else{
                        break;
                    }
                }
                for (int i = 1; i < 1000010; i++) {
                    if(map[mx][my-i] != -1){
                        if(mlen + 1 < map[mx][my-i]){
                            map[mx][my-i] = mlen+1;
                            list.add(new Integer[]{mx, my-i, 2});
                        }
                    }else{
                        break;
                    }
                }
            }
        }

        if(map[x2][y2] == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(map[x2][y2]+1);
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

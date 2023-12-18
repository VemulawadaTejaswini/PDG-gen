import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int m = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> key = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            if(map.get(a[i]) == null){
                map.put(a[i], 1);
                key.add(a[i]);
                m++;
            }else{
                map.put(a[i], map.get(a[i]) + 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<key.size(); i++){
            list.add(map.get(key.get(i)));
        }

        Collections.sort(list);

        int s = list.size();
        if(s > 6){
            no();
        }else if(s == 6){
            int t = list.get(0);
            for(int i=1; i<6; i++){
                if(t != list.get(i)){
                    no();
                    return;
                }
            }
            yes();
        }else if(s == 5){
            no();
        }else if(s == 4){
            int t = list.get(0);
            if(list.get(1) != t || list.get(2) != t * 2 || list.get(3) != t * 2){
                no();
                return;
            }else{
                yes();
            }
        }else if(s == 3){
            if(list.get(0) == list.get(1) && list.get(1) == list.get(2)){
                yes();
            }else{
                no();
            }
        }else if(s == 2){
            if(list.get(0) == list.get(1) || 
            list.get(0) * 2 == list.get(1) ||
            list.get(0) == list.get(1) * 2){
                yes();
            }else{
                no();
            }
        }else{
            no();
        }


    }

    public static void yes(){
        System.out.println("Yes");
    }

    public static void no(){
        System.out.println("No");
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

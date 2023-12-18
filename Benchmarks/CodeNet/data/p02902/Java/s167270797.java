import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static ArrayList<Integer>[] e;
    static ArrayList<Integer> groute;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        n = sc.nextInt();
        m = sc.nextInt();
        e = new ArrayList[n];
        for(int i=0; i<n; i++){
            e[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<m; i++){
            int ms = sc.nextInt();
            int me = sc.nextInt();
            e[ms-1].add(me-1);
        }

        boolean loop = false;
        groute = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            ArrayList<Integer> route = new ArrayList<Integer>();
            route.add(i);
            int ret = dfs(i, route);
            if(ret == 1){
                loop = true;
                break;
            }
        }

        if(!loop){
            System.out.println(-1);
            return;
        }

        ArrayList<Integer> jump = new ArrayList<Integer>();
        int jumppos = -1;
        for(int i=0; i<groute.size()-1; i++){
            int cur = groute.get(i);
            int next = groute.get(i+1);
            for(int ele: e[cur]){
                for(int mele: groute){
                    if(ele == mele && ele != next){
                        jump.add(ele);
                    }
                }
            }

            if(jump.size()> 0){
                jumppos = i;
                break;
            }
        }

        ArrayList<Integer> mroute = new ArrayList<Integer>();

        if(jump.size() > 0){
            int max = -1;
            for(int ele: jump){
                for(int i=0; i<groute.size(); i++){
                    if(ele == groute.get(i)){
                        if(i > max){
                            max = i;
                        }
                    }
                }
            }
            for(int i=0; i<=jumppos; i++){
                mroute.add(groute.get(i) + 1);
            }
            for(int i=max; i< groute.size()-1;  i++){
                mroute.add(groute.get(i) + 1);
            }
        }else{
            for(int i=0; i<groute.size()-1; i++){
                mroute.add(groute.get(i) + 1);
            }
        }

        
        jump = new ArrayList<Integer>();
        jumppos = -1;
        mroute.add(mroute.get(0));

        for(int i=mroute.size()-2; i>=0; i--){
            int cur = mroute.get(i);
            int next = mroute.get(i+1);
            for(int ele: e[cur]){
                for(int mele: groute){
                    if(ele == mele && ele != next){
                        jump.add(ele);
                    }
                }
            }
            if(jump.size()> 0){
                jumppos = i;
                break;
            }
        }


        ArrayList<Integer> mmroute = new ArrayList<Integer>();


        if(jump.size() > 0){
            int max = -1;
            for(int ele: jump){
                for(int i=0; i<groute.size(); i++){
                    if(ele == groute.get(i)){
                        if(i > max){
                            max = i;
                        }
                    }
                }
            }
            for(int i=max; i<=jumppos; i++){
                mmroute.add(mroute.get(i) + 1);
            }
        }else{
            for(int i=0; i<groute.size()-1; i++){
                mmroute.add(mroute.get(i) + 1);
            }
        }

        for(int ele: mmroute){
            System.out.println(ele + 1);
        }

    }

    static int dfs(int pos, ArrayList<Integer> route){
        int ret = -1;
        for(int i=0; i<e[pos].size(); i++){
            int next = e[pos].get(i);
            if(route.contains(next)){
                route.add(next);
                boolean start = false;
                for(int j=0; j<route.size(); j++){
                    int ele = route.get(j);
                    if(ele == next) start = true;
                    if(start) groute.add(ele);
                }
                return 1;
            }
            ArrayList<Integer> mroute = new ArrayList<Integer>();
            for(int ele: route){
                mroute.add(ele);
            }
            mroute.add(next);
            ret = dfs(next, mroute);
            if(ret == 1) return 1;
        }

        return ret;
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


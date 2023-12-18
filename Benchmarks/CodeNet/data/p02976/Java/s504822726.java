import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] e = new int[m][2];
        Node[] g = new Node[n];
        for(int i=0; i<n; i++) g[i] = new Node(i);
        for(int i=0; i<m; i++){
            int t0 = e[i][0] = sc.nextInt() - 1;
            int t1 = e[i][1] = sc.nextInt() - 1;
            g[t0].con(t1);
            g[t1].con(t0);
        }

        PriorityQueue<Integer[]> que = new PriorityQueue<>(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1] - o2[1];
            }
        });

        for(int i=0; i<n; i++){
            que.add(new Integer[]{i, g[i].ncon});
        }

        ArrayList<Integer[]> ans = new ArrayList<Integer[]>();

        while(!que.isEmpty()){
            Integer[] cur = que.poll();
            int mid = cur[0];
            if(cur[1] != g[mid].ncon || cur[1] == 0) continue;

            if(cur[1] == 1 && g[mid].nfrom % 2 == 0){
                int mfrom = g[mid].getNext();
                if(g[mfrom].nfrom % 2 == 0 && g[mfrom].ncon == 1){
                    System.out.println(-1);
                    return;
                }
                g[mfrom].conFrom(mid);
                g[mid].conTo(mfrom);
                que.add(new Integer[]{mfrom, g[mfrom].ncon});
                ans.add(new Integer[]{mfrom+1, mid+1});
                // System.out.println((mfrom + 1) + " " + (mid + 1));
            }else{
                int mto = g[mid].conFrom();
                if(g[mto].nfrom % 2 == 1 && g[mto].ncon == 1){
                    System.out.println(-1);
                    return;
                }
                g[mto].conTo(mid);
                que.add(new Integer[]{mid, g[mid].ncon});
                que.add(new Integer[]{mto, g[mto].ncon});
                ans.add(new Integer[]{mid+1, mto+1});
                // System.out.println((mid + 1) + " " + (mto + 1));
            }
        }

        for(int i=0; i<ans.size(); i++){
            Integer[] mans = ans.get(i);
            System.out.println(mans[0] + " " + mans[1]);
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

class Node{
    int id;
    int ncon;
    int nfrom;
    int nto;
    ArrayDeque<Integer> next;

    public Node(int id){
        this.id = id;
        ncon = 0;
        nfrom = 0;
        nto = 0;
        next = new ArrayDeque<Integer>();
    }

    public void con(int to){
        ncon++;
        next.add(to);
    }

    public int getNext(){
        return next.peek();
    }

    public void conTo(int to){
        ncon--;
        nto++;
        next.remove(to);
    }

    public int conFrom(){
        ncon--;
        nfrom++;
        int mnext = next.poll();
        return mnext;
    }

    public void conFrom(int to){
        ncon--;
        nfrom++;
        next.remove(to);
    }
}

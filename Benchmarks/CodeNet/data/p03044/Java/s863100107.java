import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        Node[] Tree = new Node[n];
        for(int i=0; i<n; i++){
            Tree[i] = new Node(i+1);
        }
        for(int i=0; i<n-1; i++){
            int from = sc.nextInt();
            int to = sc.nextInt();
            int dist = sc.nextInt();
            Tree[from-1].addNext(to, dist);
            Tree[to-1].addNext(from, dist);
        }

        ArrayDeque<Integer> que = new ArrayDeque<Integer>();
        que.add(1);

        boolean[] used = new boolean[n];
        used[0] = true;

        while(que.size() > 0){
            ArrayList<Integer> nextId = Tree[que.poll()-1].paint(used, Tree);
            for(Integer ne: nextId){
                que.add(ne);
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(Tree[i].getColor());
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
}

class Node{
    int id;
    ArrayList<Integer[]> next;
    boolean color;

    public Node(int id){
        this.id = id;
        next = new ArrayList<Integer[]>();
        color = true;
    }

    public void addNext(int id, int dist){
        next.add(new Integer[]{id, dist});
    }

    public ArrayList<Integer> paint(boolean[] used, Node[] Tree){
        ArrayList<Integer> nextId = new ArrayList<Integer>();
        for(Integer[] ne: next){
            if(!used[ne[0]-1]){
                used[ne[0]-1] = true;
                nextId.add(ne[0]);
                if(ne[1] % 2 == 0){
                    Tree[ne[0]-1].setColor(color);
                }else{
                    Tree[ne[0]-1].setColor(!color);
                }
            }
        }

        return nextId;
    }

    public void setColor(boolean color){
        this.color = color;
    }

    public int getColor(){
        return color ? 1 : 0;
    }
}
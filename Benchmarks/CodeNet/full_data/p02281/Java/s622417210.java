import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {

    class Node {
        int p = -1;
        int l = -1;
        int r = -1;
    }

    Node[] nodes;

    int getRoot() {
        int n = 0;
        while (nodes[n].p != -1) {
            n = nodes[n].p;
        }
        return n;
    }

    List<Integer> preorder = new ArrayList<>();
    List<Integer> inorder = new ArrayList<>();
    List<Integer> postorder = new ArrayList<>();

    void preorder(int id) {
        preorder.add(id);
        if (nodes[id].l != -1) {
            preorder(nodes[id].l);
        }
        if (nodes[id].r != -1) {
            preorder(nodes[id].r);
        }
    }

    void inorder(int id) {
        if (nodes[id].l != -1) {
            inorder(nodes[id].l);
        }
        inorder.add(id);
        if (nodes[id].r != -1) {
            inorder(nodes[id].r);
        }
    }

    void postorder(int id) {
        if (nodes[id].l != -1) {
            postorder(nodes[id].l);
        }
        if (nodes[id].r != -1) {
            postorder(nodes[id].r);
        }
        postorder.add(id);
    }

    void solve() {
        int n = io.nextInt();
        nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n; i++) {
            int id = io.nextInt();
            int l = io.nextInt();
            int r = io.nextInt();
            nodes[id].l = l;
            nodes[id].r = r;
            if (l != -1) nodes[l].p = id;
            if (r != -1) nodes[r].p = id;
        }

        int root = getRoot();
        preorder(root);
        inorder(root);
        postorder(root);

        System.out.println("Preorder");
        System.out.println(" " + preorder.stream().map(x -> x.toString()).collect(Collectors.joining(" ")));
        System.out.println("Inorder");
        System.out.println(" " + inorder.stream().map(x -> x.toString()).collect(Collectors.joining(" ")));
        System.out.println("Postorder");
        System.out.println(" " + postorder.stream().map(x -> x.toString()).collect(Collectors.joining(" ")));
    }


    public static void main(final String[] args) {
        new Main().solve();
    }

    IO io = new IO();

    class IO {
        private final int SIZE = 1 << 12;
        private final InputStream stream = System.in;
        private final byte[] buffer = new byte[SIZE];
        private int ptr = 0, buffLen = 0;

        private boolean hasNextByte() {
            if (ptr < buffLen) return true;
            ptr = 0;
            try {
                buffLen = stream.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return buffLen > 0;
        }

        private byte readByte() {
            if (hasNextByte()) return buffer[ptr++];
            return -1;
        }

        private boolean isAscii(byte i) {
            return '!' <= i && i <= '~';
        }

        public char nextChar() {
            byte b = readByte();
            while (!isAscii(b)) b = readByte();
            return (char) b;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();
            byte b = readByte();
            while (isAscii(b)) {
                sb.append((char) b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            return Integer.valueOf(next());
        }

        public long nextLong() {
            return Long.valueOf(next());
        }

        public double nextDouble() {
            return Double.valueOf(next());
        }
    }
}


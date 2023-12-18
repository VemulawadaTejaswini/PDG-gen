import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Reader in = new Reader();
        HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            if (adj.containsKey(u)) {
                ArrayList<Integer> list = adj.get(u);
                list.add(v);
                adj.put(u, list);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(v);
                adj.put(u, list);
            }
        }
        int start = in.nextInt();
        int end = in.nextInt();

        Queue<Node> queue = new LinkedList<>();
        boolean[][] vis = new boolean[n+1][3];
        queue.offer(new Node(start, 0, 0));
        int min = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            Node x = queue.poll();
            if (x.id == end) {
                if (x.hops == 0) {
                    min = Math.min(x.dist, min);
                }
            }
            if (adj.containsKey(x.id)) {
                for (int y : adj.get(x.id)) {
                    if (!vis[y][(x.hops+1)%3]) {
                        queue.offer(new Node(y, (x.hops+1)%3, x.dist+1));
                    }
                }
            }
            vis[x.id][x.hops] = true;
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(min/3);
        }
    }

    static class Node {
        int id, hops, dist;
        public Node(int id, int hops, int dist) {
            this.id = id;
            this.hops = hops;
            this.dist = dist;
        }
    }

    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

    }
}
/*


 */
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        FastScanner sc = new FastScanner();
        int n = sc.nextInt();

        Map<Long, List<long[]>> map = new HashMap<>();

        for (int i = 0; i < n - 1; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            map.computeIfAbsent(a, k -> new ArrayList<>()).add(new long[]{a, b, c});
            map.computeIfAbsent(b, k -> new ArrayList<>()).add(new long[]{b, a, c});
        }

        int q = sc.nextInt();
        int k = sc.nextInt();

        Map<Integer, Long> memo = new HashMap<>();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (!memo.containsKey(x)) {
                memo.put(x, dijkstra(map, x, k, n));
            }
            if (!memo.containsKey(y)) {
                memo.put(y, dijkstra(map, y, k, n));
            }
            System.out.println(memo.get(x) + memo.get(y));
        }
    }

    //return min distance from start to end O(EV) (negative cost is possible)
    //edge is int[3] array {from,to,cost}
    //edges is edge list from specific node
    //all_edges is Map<from node number,edges>
    public static long dijkstra(Map<Long, List<long[]>> all_edges, int start, int end, int max_node_number) {
        long[] distance = new long[max_node_number + 1];
        Arrays.fill(distance, -1);
        PriorityQueue<long[]> p_que = new PriorityQueue<>(Comparator.comparingLong(a -> (distance[(int)a[0]] + a[2])));
        distance[start] = 0;
        List<long[]> edges = all_edges.get((long)start);
        p_que.addAll(edges);
        while (distance[end] < 0) {
            long[] nearest_edge = p_que.poll();
            assert nearest_edge != null;
            if (distance[(int)nearest_edge[1]] < 0) {
                distance[(int)nearest_edge[1]] = distance[(int)nearest_edge[0]] + nearest_edge[2];
                if (all_edges.containsKey(nearest_edge[1])) {
                    edges = all_edges.get(nearest_edge[1]);
                    for (long[] edge : edges) {
                        if (distance[(int)edge[1]] < 0) p_que.add(edge);
                    }
                }
            }
        }
        return distance[end];
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
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
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
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
    }
}
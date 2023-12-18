import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Reader r = new Reader(System.in)) {
            int N = r.i();
            int M = r.i();

            List<Edge>[] edges = initDijkstra(N);
            for (int m = 0; m < M; m++) {
                int L = r.i() - 1;
                int R = r.i() - 1;
                long C = r.l();

                for (int s = L; s < R; s++) {
                    for (int t = s + 1; t <= R; t++) {
                        edges[s].add(new Edge(t, C));
                        edges[t].add(new Edge(s, C));
                    }
                }
            }

            long[] distances = execDijkstra(edges, 0);

            System.out.println(distances[N - 1]);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Edge>[] initDijkstra(int N) {
        List<Edge>[] edges = new List[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new ArrayList<>();
        }

        return edges;
    }

    public static long[] execDijkstra(List<Edge>[] edges, int start) {
        long[] distances = new long[edges.length];
        for (int i = 0; i < edges.length; i++) {
            distances[i] = -1;
        }

        PriorityQueue<Vertex> queue = new PriorityQueue<>(new Comparator<Vertex>() {
            @Override
            public int compare(Vertex o1, Vertex o2) {
                return Long.compare(o1.distance, o2.distance);
            }
        });

        queue.add(new Vertex(start, 0));

        while (queue.size() > 0) {
            Vertex vertex = queue.poll();

            if (distances[vertex.n] != -1) {
                continue;
            }

            distances[vertex.n] = vertex.distance;

            for (Edge edge : edges[vertex.n]) {
                if (distances[edge.to] == -1) {
                    queue.add(new Vertex(edge.to, vertex.distance + edge.distance));
                }
            }
        }

        return distances;
    }

    public static class Edge {

        public int to;

        public long distance;

        public Edge(int to, long distance) {
            this.to = to;
            this.distance = distance;
        }

    }

    public static class Vertex {

        public int n;

        public long distance;

        public Vertex(int n, long distance) {
            this.n = n;
            this.distance = distance;
        }

    }

    public static class Reader implements AutoCloseable {

        private BufferedReader br;

        private String[] buf;

        private int bufidx = -1;

        public Reader(InputStream in) {
            this.br = new BufferedReader(new InputStreamReader(in));
        }

        @Override
        public void close() throws Exception {
            br.close();
        }

        private void readBuf() throws IOException {
            if (bufidx == -1 || bufidx == buf.length) {
                buf = br.readLine().split(" ");
                bufidx = 0;
            }
        }

        public String s() throws IOException {
            readBuf();
            return buf[bufidx++];
        }

        public int i() throws IOException {
            return Integer.parseInt(s());
        }

        public long l() throws IOException {
            return Long.parseLong(s());
        }

        public double d() throws IOException {
            return Double.parseDouble(s());
        }

        public String[] sa() throws IOException {
            readBuf();
            if (bufidx != 0) {
                throw new RuntimeException("illegal read");
            }
            bufidx = -1;
            return buf;
        }

        public int[] ia() throws IOException {
            String[] sa = sa();
            int[] ia = new int[sa.length];
            for (int i = 0; i < sa.length; i++) {
                ia[i] = Integer.parseInt(sa[i]);
            }
            return ia;
        }

        public long[] la() throws IOException {
            String[] sa = sa();
            long[] la = new long[sa.length];
            for (int i = 0; i < sa.length; i++) {
                la[i] = Long.parseLong(sa[i]);
            }
            return la;
        }

        public double[] da() throws IOException {
            String[] sa = sa();
            double[] da = new double[sa.length];
            for (int i = 0; i < sa.length; i++) {
                da[i] = Double.parseDouble(sa[i]);
            }
            return da;
        }

        public int[][] im(int N) throws IOException {
            int[][] im = new int[N][];
            for (int i = 0; i < N; i++) {
                im[i] = ia();
            }
            return im;
        }

        public long[][] lm(int N) throws IOException {
            long[][] lm = new long[N][];
            for (int i = 0; i < N; i++) {
                lm[i] = la();
            }
            return lm;
        }

        public double[][] dm(int N) throws IOException {
            double[][] dm = new double[N][];
            for (int i = 0; i < N; i++) {
                dm[i] = da();
            }
            return dm;
        }

    }

}

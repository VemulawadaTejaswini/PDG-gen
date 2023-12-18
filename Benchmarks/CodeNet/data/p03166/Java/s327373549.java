public class LongestPathInGraph {

    
    private List<Set<Integer>> graph;
    private int nodes;
    private int edges;
    
    private int[] costs;
    private boolean[] used;
    
    int dfs(int index) {
        used[index] = true;
        
        int max_cost = 0;
        Set<Integer> edges = graph.get(index);
        for (Integer edge : edges) {

            int cur_cost;
            if (used[edge]) cur_cost = costs[edge];
            else cur_cost = dfs(edge);
            ++cur_cost; 
            if (max_cost < cur_cost) {
                max_cost = cur_cost;
            }
            
        }
        
        costs[index] = max_cost;
        
        return max_cost;
    }
    
    void execute() throws IOException, EndOfStreamException {
        FastInput fi = new FastInput(System.in);
//        FastInput fi = new FastInput(new FileInputStream(new File("input_graph.txt")));
        
        nodes = fi.readInt();
        edges = fi.readInt();
        
        graph = new ArrayList<>(nodes);
        for (int i = 0; i < nodes; ++i) {
            graph.add(new HashSet<>());
        }
        
        for (int i = 0; i < edges; ++i) {
            int v1 = fi.readInt();
            int v2 = fi.readInt();
            --v1;
            --v2;
            Set<Integer> edges = graph.get(v1);
            edges.add(v2);
        }
        
        fi.close();
        
        costs = new int[nodes];
        used = new boolean[nodes];
        
        int max_cost = 0;
        for (int i = 0; i < nodes; ++i) {
            if (!used[i]) {
                max_cost = Math.max(max_cost, dfs(i));
            }
        }
        
        System.out.println(max_cost);
    }
    
    public static void main(String[] args) throws IOException, EndOfStreamException {
        LongestPathInGraph s = new LongestPathInGraph();
        s.execute();
    }

    ///////////////////////////////////////////////////////////////////////////
    // Fast Input start here.
    ///////////////////////////////////////////////////////////////////////////
    public static class EndOfStreamException extends Exception {
        private static final long serialVersionUID = -1L;
    }

    public static class FastInput implements AutoCloseable {

        private InputStream stream;
        int lastChar;

        public FastInput(InputStream stream) throws IOException {
            // Assert stream exists
            assert stream != null;
            this.stream = stream;
            lastChar = stream.read();
            // Assure non-empty stream
            assert lastChar != -1;
        }

        private boolean isWhiteSpace(int ch) {
            return (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r');
        }

        private int skipWhitespaces() throws IOException, EndOfStreamException {
            while (lastChar != -1 && isWhiteSpace(lastChar))
                lastChar = stream.read();
            if (lastChar == -1)
                throw new EndOfStreamException();
            return lastChar;
        }

        public int readInt() throws IOException, EndOfStreamException {
            int ch = skipWhitespaces();
            int number = 0;
            int base = 10;
            boolean isNegative = false;
            switch (ch) {
            case '-':
                isNegative = true;
            case '+':
                ch = stream.read();
                if (ch < '0' || ch > '9')
                    throw new IOException("readInt() - data cannot be converted to an integer.");
            default:
                number = (ch - '0');
            }

            ch = stream.read();
            while (ch >= '0' && ch <= '9') {
                number *= base;
                number += (ch - '0');
                ch = stream.read();
            }
            lastChar = ch;
            if (isNegative)
                number = -number;

            return number;
        }

        public char readChar() throws IOException, EndOfStreamException {
            int ch = skipWhitespaces();
            lastChar = stream.read();
            return (char)ch;
        }

        public String readString() throws IOException, EndOfStreamException {
            StringBuilder builder = new StringBuilder();
            int ch = skipWhitespaces();
            while (ch != -1) {
                builder.append((char)ch);
                ch = stream.read();
                if (isWhiteSpace(ch))
                    break;
            }
            lastChar = ch;
            return builder.toString();
        }

        public double readDouble() throws IOException, EndOfStreamException {
            StringBuilder builder = new StringBuilder();
            int ch = skipWhitespaces();
            boolean mantisDelimeterFound = false;
            if (ch == '-' || ch == '+') {
                builder.append((char)ch);
                ch = stream.read();
            } else if (ch == '.') {
                builder.append((char)ch);
                mantisDelimeterFound = true;
                ch = stream.read();
            }

            while (ch != -1) {
                if (ch >= '0' && ch <= '9')
                    builder.append((char)ch);
                else if (ch == '.') {
                    if (mantisDelimeterFound)
                        break;
                    mantisDelimeterFound = true;
                    builder.append((char)ch);
                } else {
                    break;
                }
                ch = stream.read();
            }
            lastChar = ch;

            return Double.parseDouble(builder.toString());
        }

        @Override
        public void close() throws IOException {
            if (stream != null)
                stream.close();
        }
    }    
}

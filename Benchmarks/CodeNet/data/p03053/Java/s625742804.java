import java.io.InputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static MultiPathQuery<GridPoint> query;

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int h = sc.nextInt();
    int w = sc.nextInt();

    List<GridPoint> blacks = new ArrayList<>();
    for (int r = 0; r < h; r++) {
      String line = sc.next();
      for (int c = 0; c < w; c++) {
        if (line.charAt(c) == '#') {
          blacks.add(new GridPoint(r, c));
        }
      }
    }

    // reduce visited cells
    EncodedGraph<GridPoint> graph = new VerticalHorizontalNeighborGridPointGraph(h, w, p -> true);

    query = graph.multiPathQuery(DistanceMemoBfsPathQuery::new);

    query.path(blacks, null);

    os.println(max);

  }

  static long max = 0L;

  private static class DistanceMemoBfsPathQuery<V> extends BfsPathQuery<V> {


    public DistanceMemoBfsPathQuery(Graph<V> graph) {
      super(graph);
    }

    @Override
    void mark(Graph.VertexPath<V> existing, Graph.Edge<V> edge,
        Graph.VertexPath<V> path) {
      super.mark(existing, edge, path);
      max = Math.max(max, path.getWeight());
    }
  }

  private static class GridPointEncoder implements Encoder<GridPoint> {

    public GridPointEncoder(int h, int w) {
      this.h = h;
      this.w = w;
    }

    private final int h;
    private final int w;

    @Override
    public int num() {
      return w * h;
    }

    @Override
    public Integer encode(GridPoint from) {
      if (from == null) {
        return null;
      }
      return w * from.r + from.c;
    }

    @Override
    public GridPoint decode(Integer from) {
      if (from == null) {
        return null;
      }
      return new GridPoint(from / w, from % w);
    }
  }

  private static class GridPoint implements Encoded<GridPoint> {

    private final int r;
    private final int c;

    public GridPoint(int r, int c) {
      this.r = r;
      this.c = c;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      GridPoint gridPoint = (GridPoint) o;
      return r == gridPoint.r &&
          c == gridPoint.c;
    }

    @Override
    public int hashCode() {
      return Objects.hash(r, c);
    }
  }

  private static class VerticalHorizontalNeighborGridPointGraph extends GridPointGraph {

    private final Predicate<GridPoint> predicate;
    protected int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public VerticalHorizontalNeighborGridPointGraph(int h, int w, Predicate<GridPoint> predicate) {
      super(h, w);
      this.predicate = predicate;
    }

    protected boolean predicate(GridPoint p) {
      if (p.r < 0 || h <= p.r) {
        return false;
      }
      if (p.c < 0 || w <= p.c) {
        return false;
      }
      return predicate.test(p);
    }

    protected Set<Edge<GridPoint>> neighbors(GridPoint from) {

      return Arrays.stream(moves)
          .map(move -> new GridPoint(from.r + move[0], from.c + move[1]))
          .filter(this::predicate)
          .map(to -> new ConstantWeightEdge<>(from, to))
          .collect(Collectors.toSet());
    }

    @Override
    public Set<Edge<GridPoint>> getEdges(GridPoint from) {
      return Optional.of(from).filter(this::predicate).map(this::neighbors)
          .orElse(Collections.emptySet());
    }
  }

  private static class AdjacencyMatrixGridPointGraph extends IntVertexGraph {

    private final Set<Integer> vertexes = new HashSet<>();

    private final int n;
    private final int[][] matrix;

    public AdjacencyMatrixGridPointGraph(int n, int[][] matrix) {
      this.n = n;
      this.matrix = matrix;
      IntStream.range(0, n).forEach(vertexes::add);
    }

    @Override
    public Set<Integer> getVertexes() {
      return vertexes;
    }

    @Override
    public Set<Edge<Integer>> getEdges(Integer from) {
      return IntStream.range(0, n).mapToObj(to -> new Edge<>(from, to, matrix[from][to]))
          .collect(Collectors.toSet());
    }
  }

  private static class AdjacencyListGridPointGraph extends IntVertexGraph {

    private final Set<Integer> vertexes = new HashSet<>();

    private final int n;
    private final List<Set<Edge<Integer>>> edges;

    public AdjacencyListGridPointGraph(int n, List<Set<Edge<Integer>>> edges) {
      this.n = n;
      this.edges = edges;
      IntStream.range(0, n).forEach(vertexes::add);
    }

    @Override
    public Set<Integer> getVertexes() {
      return vertexes;
    }

    @Override
    public Set<Edge<Integer>> getEdges(Integer from) {
      return edges.get(from);
    }
  }


  private static abstract class GridPointGraph extends EncodedGraph<GridPoint> {

    public GridPointGraph(int h, int w) {
      super(new GridPointEncoder(h, w));
      this.h = h;
      this.w = w;

      for (int r = 0; r < h; r++) {
        for (int c = 0; c < w; c++) {
          nodes.add(new GridPoint(r, c));
        }
      }
    }

    protected final int h;
    protected final int w;

    protected final Set<GridPoint> nodes = new HashSet<>();

    @Override
    public Set<GridPoint> getVertexes() {
      return nodes;
    }
  }

  private static interface Encoded<E extends Encoded> {

  }

  private static interface Encoder<E extends Encoded> {

    int num();

    Integer encode(E from);

    E decode(Integer from);
  }

  private static abstract class EncodedGraph<V extends Encoded<V>> implements Graph<V> {

    public EncodedGraph(Encoder<V> encoder) {
      this.encoder = encoder;
      this.delegate = new IntVertexGraph() {
        @Override
        public Set<Integer> getVertexes() {
          return EncodedGraph.this.getVertexes().stream()
              .map(encoder::encode)
              .collect(Collectors.toSet());
        }

        @Override
        public Set<Edge<Integer>> getEdges(Integer from) {
          return EncodedGraph.this.getEdges(encoder.decode(from)).stream()
              .map(e -> new Edge<>(encoder.encode(e.getFrom()), encoder.encode(e.getTo()),
                  e.getWeight()))
              .collect(Collectors.toSet());
        }
      };
    }

    private final Encoder<V> encoder;
    private final IntVertexGraph delegate;

    public PathQuery<V> pathQuery(Function<Graph<Integer>, PathQuery<Integer>> delegate) {
      return new EncodedPathQuery<>(delegate, this);
    }

    public MultiPathQuery<V> multiPathQuery(
        Function<Graph<Integer>, MultiPathQuery<Integer>> delegate) {
      return new EncodedMultiPathQuery<>(delegate, this);
    }

    private static class EncodedPathQuery<V extends Encoded<V>> implements PathQuery<V> {

      EncodedGraph<V> graph;
      PathQuery<Integer> delegate;

      private EncodedPathQuery(Function<Graph<Integer>, PathQuery<Integer>> delegate,
          EncodedGraph<V> graph) {
        this.graph = graph;
        this.delegate = delegate.apply(graph.delegate);
      }

      @Override
      public VertexPath<V> path(V begin, V end) {
        VertexPath<Integer> path = delegate
            .path(graph.encoder.encode(begin), graph.encoder.encode(end));
        if (path == null) {
          return null;
        }
        return new EfficientVertexPath<>(graph.encoder.decode(path.getBegin()),
            graph.encoder.decode(path.getEnd()), path.getWeight());
      }
    }

    private static class EncodedMultiPathQuery<V extends Encoded<V>> implements MultiPathQuery<V> {

      EncodedGraph<V> graph;
      MultiPathQuery<Integer> delegate;

      private EncodedMultiPathQuery(Function<Graph<Integer>, MultiPathQuery<Integer>> delegate,
          EncodedGraph<V> graph) {
        this.graph = graph;
        this.delegate = delegate.apply(graph.delegate);
      }

      @Override
      public VertexPath<V> path(List<V> begin, V end) {
        List<Integer> list = begin.stream().map(graph.encoder::encode)
            .collect(Collectors.toList());
        VertexPath<Integer> path = delegate
            .path(list, graph.encoder.encode(end));
        if (path == null) {
          return null;
        }
        return new EfficientVertexPath<>(graph.encoder.decode(path.getBegin()),
            graph.encoder.decode(path.getEnd()), path.getWeight());
      }
    }

  }

  private static interface PathQuery<V> {

    Graph.VertexPath<V> path(V begin, V end);
  }

  private static interface MultiPathQuery<V> {

    Graph.VertexPath<V> path(List<V> begin, V end);
  }

  private static abstract class QueuedPathQuery<V> implements PathQuery<V> {

    protected final Graph<V> graph;
    protected final Queue<Graph.VertexPath<V>> queue;

    public QueuedPathQuery(Graph<V> graph, Queue<Graph.VertexPath<V>> queue) {
      this.graph = graph;
      this.queue = queue;
    }

    public Graph.VertexPath<V> path(V begin, V end) {

      prepare(begin, end);
      queue.add(new Graph.EfficientVertexPath<>(begin));
      return search(end);
    }

    protected Graph.VertexPath<V> search(V end) {
      while (!queue.isEmpty()) {
        Graph.VertexPath<V> path = queue.remove();
        V head = path.getEnd();

        if (head.equals(end)) {
          return path;
        }
        for (Graph.Edge<V> e : graph.getEdges(head)) {
          if (predicate(e)) {
            Graph.VertexPath<V> p = path.append(e);
            queue.add(p);
            mark(path, e, p);
          }
        }
      }
      return null;
    }

    abstract void prepare(V begin, V end);

    abstract boolean predicate(Graph.Edge<V> edge);

    abstract void mark(Graph.VertexPath<V> existing, Graph.Edge<V> edge,
        Graph.VertexPath<V> path);
  }

  private static class DijkstraPathQuery<V> extends QueuedPathQuery<V> {

    private final Map<V, Long> distance = new HashMap<>();

    public DijkstraPathQuery(Graph<V> graph) {
      super(graph, new PriorityQueue<>(
          Comparator.comparingLong(Graph.VertexPath::getWeight)));
    }


    @Override
    void prepare(V begin, V end) {
      graph.getVertexes()
          .forEach(v -> distance.put(v, (long) Integer.MAX_VALUE));
      distance.put(begin, 0L);
    }

    @Override
    boolean predicate(Graph.Edge<V> edge) {
      return distance.get(edge.getFrom()) + edge.getWeight() < distance.get(edge.getTo());
    }

    @Override
    void mark(Graph.VertexPath<V> existing, Graph.Edge<V> edge,
        Graph.VertexPath<V> path) {
      distance.put(path.getEnd(), path.getWeight());
    }
  }

  private static class BfsPathQuery<V> extends QueuedPathQuery<V> implements MultiPathQuery<V> {

    private final Set<V> visited;

    public BfsPathQuery(Graph<V> graph) {
      super(graph, new ArrayDeque<>());
      visited = new HashSet<>(graph.getVertexes().size());
    }

    @Override
    void prepare(V begin, V end) {
      visited.add(begin);
    }

    @Override
    boolean predicate(Graph.Edge<V> edge) {
      return !visited.contains(edge.getTo());
    }

    @Override
    void mark(Graph.VertexPath<V> existing, Graph.Edge<V> edge,
        Graph.VertexPath<V> path) {
      visited.add(path.getEnd());
    }

    public Graph.VertexPath<V> path(List<V> begins, V end) {

      begins.forEach(begin -> prepare(begin, end));
      begins.forEach(begin -> queue.add(new Graph.EfficientVertexPath<>(begin)));
      return search(end);
    }

  }

  private static abstract class MemoDfsPathQuery<V> extends DfsPathQuery<V> {

    public MemoDfsPathQuery(Graph<V> graph) {
      super(graph);
    }

    abstract Graph.VertexPath<V> memo(Graph.VertexPath<V> path, V parent,
        V end);

    @Override
    public Graph.VertexPath<V> path(Graph.VertexPath<V> path, V parent,
        V end) {
      Graph.VertexPath<V> memo = memo(path, parent, end);
      if (memo != null) {
        return memo;
      }
      return super.path(path, parent, end);
    }
  }

  private static class DfsPathQuery<V> implements PathQuery<V> {

    protected final Graph<V> graph;

    public DfsPathQuery(Graph<V> graph) {
      this.graph = graph;
    }

    @Override
    public Graph.VertexPath<V> path(V begin, V end) {
      return path(new Graph.EfficientVertexPath<>(begin), null, end);
    }

    protected Graph.VertexPath<V> path(Graph.VertexPath<V> path, V parent,
        V end) {
      V head = path.getEnd();
      if (path.getEnd().equals(end)) {
        return path;
      }
      for (Graph.Edge<V> e : graph.getEdges(head)) {
        if (!e.getTo().equals(parent)) {
          Graph.VertexPath<V> next = path(path.append(e), head, end);
          if (next != null) {
            return next;
          }
        }
      }
      return null;
    }
  }

  private static class WarshallFloydQuery implements PathQuery<Integer> {

    private Graph.VertexPath<Integer>[][] shortest;

    private WarshallFloydQuery(Graph<Integer> graph) {
      Set<Integer> nodes = graph.getVertexes();

      shortest = new Graph.VertexPath[nodes.size()][nodes.size()];

      for (int from : nodes) {
        Set<Graph.Edge<Integer>> edges = graph.getEdges(from);
        for (Graph.Edge<Integer> e : edges) {
          shortest[e.getFrom()][e.getTo()] = new Graph.EfficientVertexPath<>(e);
        }
        shortest[from][from] = new Graph.EfficientVertexPath<>(from);
      }

      for (int relay : nodes) {
        for (int from : nodes) {
          for (int dest : nodes) {
            Graph.VertexPath<Integer> pathA = shortest[from][relay];
            Graph.VertexPath<Integer> pathB = shortest[relay][dest];
            if (pathA != null && pathB != null) {
              if (shortest[from][dest] == null
                  || pathA.getWeight() + pathB.getWeight() < shortest[from][dest]
                  .getWeight()) {
                shortest[from][dest] = pathA.append(pathB);
              }
            }
          }
        }
      }
    }

    @Override
    public Graph.VertexPath<Integer> path(Integer begin, Integer end) {
      return shortest[begin][end];
    }
  }

  private static abstract class IntVertexGraph implements Graph<Integer> {

  }

  private static interface Graph<V> {

    static class Edge<V> {

      public Edge(V from, V to, long weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
      }

      private final V from;

      private final V to;
      private final long weight;


      V getFrom() {
        return from;
      }

      V getTo() {
        return to;
      }

      long getWeight() {
        return weight;
      }

      @Override
      public boolean equals(Object o) {
        if (this == o) {
          return true;
        }
        if (o == null || getClass() != o.getClass()) {
          return false;
        }
        Edge<?> edge = (Edge<?>) o;
        return weight == edge.weight &&
            Objects.equals(from, edge.from) &&
            Objects.equals(to, edge.to);
      }

      @Override
      public int hashCode() {
        return Objects.hash(from, to, weight);
      }
    }

    static class ConstantWeightEdge<V> extends Edge<V> {

      public ConstantWeightEdge(V from, V to) {
        super(from, to, 1);
      }
    }

    Set<V> getVertexes();

    Set<Edge<V>> getEdges(V from);

    static interface VertexPath<V> {

      V getBegin();

      V getEnd();

      long getWeight();

      VertexPath<V> append(VertexPath<V> other);

      VertexPath<V> append(Edge<V> edge);
    }

    static class EfficientVertexPath<V> implements VertexPath<V> {

      final V begin;
      final V end;
      final long weight;

      public EfficientVertexPath(V begin) {
        this.begin = begin;
        this.end = begin;
        this.weight = 0;
      }

      public EfficientVertexPath(V begin, V end, long weight) {
        this.begin = begin;
        this.end = end;
        this.weight = weight;
      }

      public EfficientVertexPath(Edge<V> edge) {
        this.begin = edge.getFrom();
        this.end = edge.getTo();
        this.weight = edge.getWeight();
      }

      private EfficientVertexPath(VertexPath<V> path, Edge<V> append) {
        this.begin = path.getBegin();
        if (!path.getEnd().equals(append.getFrom())) {
          throw new IllegalStateException("not correct edge.");
        }
        this.end = append.getTo();
        this.weight = path.getWeight() + append.getWeight();
      }

      private EfficientVertexPath(VertexPath<V> pathA, VertexPath<V> pathB) {
        this.begin = pathA.getBegin();
        if (!pathA.getEnd().equals(pathB.getBegin())) {
          throw new IllegalStateException("not correct edge.");
        }
        this.end = pathB.getEnd();
        this.weight = pathA.getWeight() + pathB.getWeight();
      }

      @Override
      public V getBegin() {
        return begin;
      }

      @Override
      public V getEnd() {
        return end;
      }

      @Override
      public long getWeight() {
        return weight;
      }

      @Override
      public VertexPath<V> append(VertexPath<V> other) {
        return new EfficientVertexPath<>(this, other);
      }

      @Override
      public VertexPath<V> append(Edge<V> edge) {
        return new EfficientVertexPath<>(this, edge);
      }

      @Override
      public boolean equals(Object o) {
        if (this == o) {
          return true;
        }
        if (o == null || getClass() != o.getClass()) {
          return false;
        }
        EfficientVertexPath<?> that = (EfficientVertexPath<?>) o;
        return weight == that.weight &&
            Objects.equals(begin, that.begin) &&
            Objects.equals(end, that.end);
      }

      @Override
      public int hashCode() {
        return Objects.hash(begin, end, weight);
      }
    }
  }

  private static class Scanner {

    private final InputStream is;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    Scanner(InputStream is) {
      this.is = is;
    }

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = is.read(buffer);
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
      if (hasNextByte()) {
        return buffer[ptr++];
      } else {
        return -1;
      }
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
        ptr++;
      }
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
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
      if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
        throw new NumberFormatException();
      }
      return (int) nl;
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }
  }
}

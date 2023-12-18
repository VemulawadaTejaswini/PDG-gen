import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  private static class HpReader {
    private int lineIndex = -1;
    private int[] lineIntMem;
    private long[] lineLongMem;
    private BufferedReader in;

    public HpReader(String dir, String inFile, String outFile) {
      initAndRedirectInOut(dir, inFile, outFile);
    }

    private int ivl(String val) {
      return Integer.parseInt(val);
    }

    private long lvl(String val) {
      return Long.parseLong(val);
    }

    private void initAndRedirectInOut(String dir, String inFile, String outFile) {
      if (dir != null) {
        try {
          String containingDirPath = dir.endsWith(File.separator) ? dir : dir + File.separator;
          if (isDebug && inFile != null)
            System.setIn(new FileInputStream(new File(containingDirPath + inFile)));
          if (isDebug && outFile != null)
            System.setOut(new PrintStream(new File(containingDirPath + outFile)));
        } catch (FileNotFoundException e) {
          // Do nothing, stdin & stdout are not redirected
        }
      }
      in = new BufferedReader(new InputStreamReader(System.in));
      out = new PrintWriter(System.out);
    }

    private String nextSingleStr() throws IOException {
      return in.readLine();
    }

    private String[] nextLineStr() throws IOException {
      return nextLineStr(0);
    }

    private String[] nextLineStr(int offset) throws IOException {
      String[] inp = nextSingleStr().split(" ");
      String[] rs = new String[offset + inp.length];
      System.arraycopy(inp, 0, rs, offset, inp.length);
      return rs;
    }

    private int nextSingleInt() throws IOException {
      if (lineIndex == -1 || lineIndex == lineIntMem.length) {
        lineIndex = 0;
        lineIntMem = nextLineInt();
      }

      return lineIntMem[lineIndex++];
    }

    private int[] nextLineInt() throws IOException {
      return nextLineInt(0);
    }

    private int[] nextLineInt(int offset) throws IOException {
      String[] inp = nextLineStr();
      int[] rs = new int[offset + inp.length];
      for (int i = 0; i < inp.length; i++) rs[offset + i] = ivl(inp[i]);
      return rs;
    }

    private long nextSingleLong() throws IOException {
      if (lineIndex == -1 || lineIndex == lineLongMem.length) {
        lineIndex = 0;
        lineLongMem = nextLineLong();
      }

      return lineLongMem[lineIndex++];
    }

    private long[] nextLineLong() throws IOException {
      return nextLineLong(0);
    }

    private long[] nextLineLong(int offset) throws IOException {
      String[] inp = nextLineStr();
      long[] rs = new long[offset + inp.length];
      for (int i = 0; i < inp.length; i++) rs[offset + i] = lvl(inp[i]);
      return rs;
    }

    private int[][] nextMatInt(int lineCount) throws IOException {
      return nextMatInt(lineCount, 0, 0);
    }

    private int[][] nextMatInt(int lineCount, int rowOffset, int colOffset) throws IOException {
      int[][] rs = new int[rowOffset + lineCount][];
      for (int i = rowOffset; i < rs.length; i++) rs[i] = nextLineInt(colOffset);
      return rs;
    }
  }

  private static class HpHelper {
    private static final String LOCAL_DEBUG_FLAG = "COM_PROG_DEBUG";

    private static boolean isDebug() {
      try {
        return Boolean.parseBoolean(System.getenv(HpHelper.LOCAL_DEBUG_FLAG));
      } catch (Exception e) {
        return false;
      }
    }

    private static String createDelimiter(String delimiter) {
      return delimiter == null ? " " : delimiter;
    }

    private static void println(int[] data, String delimiter) {
      delimiter = createDelimiter(delimiter);
      for (int t : data) out.print(t + delimiter);
      out.println();
    }

    private static void println(long[] data, String delimiter) {
      delimiter = createDelimiter(delimiter);
      for (long t : data) out.print(t + delimiter);
      out.println();
    }

    private static <T> void println(T[] data, String delimiter) {
      delimiter = createDelimiter(delimiter);
      for (T t : data) {
        if (t instanceof int[]) {
          println((int[]) t, delimiter);
        } else if (t instanceof long[]) {
          println((long[]) t, delimiter);
        } else if (t instanceof Object[]) {
          println((Object[]) t, delimiter);
        } else {
          out.print(t + delimiter);
        }
      }
      out.println();
    }
  }

  private static boolean isDebug = HpHelper.isDebug();
  private static HpReader in = new HpReader("/Users/henryhuypham/Workspace/CompetitiveProg", "in.txt", null);
  private static PrintWriter out;

  private static class Node {
    public int x, y;

    public Node(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  public static void main(String[] args) throws IOException {
    int h = in.nextSingleInt(), w = in.nextSingleInt();
    long rs = 0;
    char[][] mat = new char[h][];
    for (int i = 0; i < h; i++) {
      mat[i] = in.nextSingleStr().toCharArray();
    }

    boolean[][] visited = new boolean[h][w];
    int[] d1 = new int[]{-1,  0,  1,  0} ;
    int[] d2 = new int[]{ 0,  1,  0, -1};

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (visited[i][j]) continue;

        long blackCount = 0, whiteCount = 0;
        Queue<Node> q = new LinkedList<>();

        visited[i][j] = true;
        q.add(new Node(i, j));
        if (mat[i][j] == '.') {
          whiteCount++;
        } else {
          blackCount++;
        }

        while (!q.isEmpty()) {
          Node node = q.poll();

          for (int k = 0; k < d1.length; k++) {
            int x = node.x + d1[k], y = node.y + d2[k];
            if (x >= 0 && x < h && y >= 0 && y < w && !visited[x][y] && mat[x][y] != mat[node.x][node.y]) {
              visited[x][y] = true;
              q.add(new Node(x, y));
              if (mat[x][y] == '.') {
                whiteCount++;
              } else {
                blackCount++;
              }
            }
          }
        }

        rs += whiteCount * blackCount;
      }
    }
    out.print(rs);

    out.flush();
  }
}
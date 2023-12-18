import java.io.*;

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

  public static void main(String[] args) throws IOException {
    int n = in.nextSingleInt(), q = in.nextSingleInt();
    long[] A = in.nextLineLong();

    int takaTC = (n + 1) / 2, aoTc = n - takaTC;
    long takaAllDownRs = 0;
    for (int i = 1; i <= takaTC; i++) {
      takaAllDownRs += A[n - i];
    }

    long[] preCal = new long[n];
    preCal[0] = A[0];
    preCal[1] = A[1];
    for (int i = 2; i < n; i++) {
      preCal[i] = preCal[i - 2] + A[i];
    }

    long[] preCalDown = new long[n];
    preCalDown[0] = A[n - 1];
    for (int i = 1; i < n; i++) {
      preCalDown[i] = preCalDown[i - 1] + A[n - 1 - i];
    }

    for (int tc = 0; tc < q; tc++) {
      int X = in.nextSingleInt();

      long l = 0, r = A[n - 1] - X + 1;
      while (l < r) {
        long mid = (l + r) / 2;
        int nl = n - countGreater(A, X - mid);
        int nr = n - countGreater(A, X + mid);

//        if ((2 * nr - nl <= 1) && (2 * nr - nl >= 0)) {
//          l = r = mid;
//          break;
//        }

        if (nl < 2 * nr - 1) {
          l = mid + 1;
        } else {
          r = mid;
        }
      }

      if (l >= (X - A[0])) {
        out.println(takaAllDownRs);
      } else {
        long mid = l;
        int nl = n - countGreater(A, X - mid);
        int nr = n - countGreater(A, X + mid);
        int stepLeft = n - 2 * nr;
        long rs = (nr >= 1 ? preCalDown[nr - 1] : 0) + (stepLeft >= 1 ? preCal[stepLeft - 1] : 0);
        out.println(rs);
      }
    }

    out.flush();
  }

  private static int countGreater(long[] data, long value) {
    return binarySearchLeft(data, value);
  }

  private static int binarySearchLeft(long[] data, long value) {
    int l = 0, r = data.length;
    while (l < r) {
      int mid = (l + r) / 2;
      if (data[mid] < value) {
        l = mid + 1;
      } else {
        r = mid;
      }
    }

    return l;
  }
}
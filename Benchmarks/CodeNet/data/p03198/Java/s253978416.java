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
  private static HpReader in = new HpReader("/Users/henryhuypham/Workspace/Data/CompetitiveProg", "in.txt", null);
  private static PrintWriter out;

  public static void main(String[] args) throws IOException {
    int n = in.nextSingleInt(), rs = 0;
    long[] data = in.nextLineLong();

    for (int i = 1; i < n; i++) {
      if (data[i] >= data[i - 1]) {
        continue;
      }

      if (data[i - 1] * -2 < data[i] && (i - 2 < 0 || data[i - 2] <= data[i - 1] * -2)) {
        rs++;
      } else {
        long count = 0, focus = data[i];
        while (focus < data[i - 1]) {
          focus *= -2;
          count++;
        }
        rs += count * (n - i);
      }
    }

    out.print(rs);
    out.flush();
  }
}
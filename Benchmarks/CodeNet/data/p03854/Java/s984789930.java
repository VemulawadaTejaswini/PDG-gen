public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    String s = sc.next();

    String[] words = {"dream", "dreamer", "erase", "eraser"};

    List<String> prefixes = new ArrayList<>();
    prefixes.add("");

    if (bfs(prefixes, words, s)) {
      os.println("Yes");
    } else {
      os.println("No");
    }
  }

  private static boolean bfs(List<String> prefixes, String[] words, String s) {
    while (!prefixes.isEmpty()) {
      List<String> matches = new ArrayList<>();
      for (String p : prefixes) {
        for (String w : words) {
          String t = p + w;
          if (s.equals(t)) return true;
          if (s.startsWith(t)) matches.add(t);
        }
      }
      prefixes = matches;
    }
    return false;
  }
}

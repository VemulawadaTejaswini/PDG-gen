import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }
  
  private static class Problem implements Comparable<Problem> {

    public int getScore() {
      return score;
    }

    public int getIndex() {
      return index;
    }

    private final int index;
    private final int score;

    private Problem(int index, int score) {
      this.score = score;
      this.index = index;
    }

    @Override
    public int compareTo(Problem o) {
      return Integer.compare(this.score, o.score);
    }
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    int m = sc.nextInt();
    int v = sc.nextInt();
    int p = sc.nextInt();
    
    List<Problem> list = new ArrayList<>(n);
    
    for (int i = 0; i < n; i++) {
      Problem problem = new Problem(i, sc.nextInt());
      list.add(problem);
    }
    
    list.sort(Comparator.comparingInt(Problem::getScore));
    
    List<Integer> accum = new ArrayList<>();
    
    int sum = 0;
    for (int i = 0; i < n; i++) {
      accum.add(sum);
      sum += list.get(i).score;
    }
    accum.add(sum);
    
    Set<Problem> ans = new HashSet<>();
    
    for (int i = n - 1; 0 <= i; i--) {
      Problem problem = list.get(i);
      if (!isAcceptable(n, m, v, p, i, problem, accum)) break;
      ans.add(problem);
    }
    os.println(ans.size());
  }
  
  private static boolean isAcceptable(int n, long m, long v, int p, int i, Problem problem, List<Integer> accum) {
    long vote = 0;
    int l = i;
    int r = Math.max(i, (n - 1) - ((p - 1) - 1));
    vote += m * ((n - 1) - r);
    vote += m * (l + 1);
    long targetScore = problem.score + m; // all man will vote to the target
    vote += targetScore * (r - l) - (accum.get(r) - accum.get(l));
    return m * v <= vote;
  }
}
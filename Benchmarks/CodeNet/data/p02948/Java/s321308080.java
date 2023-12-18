import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    List<Job> jobs = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next()); // value
      jobs.add(new Job(b, a));
    }
    int today = 0;
    int ans = 0;
    Collections
      .sort(jobs, Comparator.<Job>comparingInt(j -> -j.value).thenComparing(j -> -j.cost));
    for (Job job : jobs) {
      if (job.cost <= m - today) {
        ans += job.value;
        today++;
      }
    }
    pw.println(ans);
  }

  static class Job {

    int value;
    int cost;

    public Job(int value, int cost) {
      this.value = value;
      this.cost = cost;
    }
  }
}

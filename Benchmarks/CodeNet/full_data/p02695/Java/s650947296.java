import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
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
    int q = Integer.parseInt(sc.next());
    List<Rule> rules = new ArrayList<>();
    for (int i = 0; i < q; i++) {
      rules.add(
        new Rule(
          Integer.parseInt(sc.next()),
          Integer.parseInt(sc.next()),
          Integer.parseInt(sc.next()),
          Integer.parseInt(sc.next())
        )
      );
    }
    RuleList ruleList = new RuleList(rules);
    int array[] = new int[n];
    pw.println(dfs(0, 0, m, array, ruleList));
  }

  static long dfs(int index, long max, int m, int[] array, RuleList ruleList) {
    if (index == array.length) {
      return ruleList.calc(array);
    }
    int begin = index == 0 ? 1 : array[index - 1];
    for (int i = begin; i <= m; i++) {
      array[index] = i;
      max = Math.max(max, dfs(index + 1, max, m, array, ruleList));
    }
    return max;
  }

  static class RuleList {

    private List<Rule> rules;

    RuleList(List<Rule> rules) {
      this.rules = rules;
    }

    long calc(int[] array) {
      return rules.stream().mapToInt(rule -> rule.calc(array)).sum();
    }
  }

  static class Rule {

    int a;
    int b;
    int c;
    int d;

    public Rule(int a, int b, int c, int d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
    }

    int calc(int[] array) {
      if (array[b - 1] - array[a - 1] == c) {
        return d;
      }
      return 0;
    }
  }
}

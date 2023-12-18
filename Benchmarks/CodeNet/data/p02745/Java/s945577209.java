import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author takahiro
 * 
 *         <pre>
 * すぬけ君は、文字列 s を持っています。
 * あぬけ君、ぶぬけ君、くぬけ君は次のような方法でそれぞれ文字列 a,b,c を得ました。
 * s の空でない (s 全体であってもよい) 連続な部分文字列を一つ選ぶ。
 * その部分文字列のうちいくつかの文字 (0 個や全部であってもよい) を ? で置き換える。
 * たとえば、s が mississippi であるとき、
 * 部分文字列として ssissip を選び、その 1,3 文字目を ? で置き換えることで ?s?ssip を得ることができます。
 * 文字列 a,b,c が与えられます。
 * s の長さとして考えられる最小値を求めてください。
 *         </pre>
 */
public class Main {
  public static void main(String[] args) {
    final Input input = new Input(args);
    final UniqueString uniqueString = UniqueString.get()
        .append(input.getA())
        .append(input.getB())
        .append(input.getC());
    Answer.answer(uniqueString.countUniquely());
  }

  /** parameter */
  private static class Input {

    private Input(final String[] args) {
      try (final Scanner scanner = new Scanner(System.in)) {
        a = scanner.next();
        b = scanner.next();
        c = scanner.next();
      }
    }

    private final String a, b, c;

    private String getA() {
      return a;
    }

    private String getB() {
      return b;
    }

    private String getC() {
      return c;
    }
  }

  /** ?はワイルドカードとして扱うということで。 */
  private static class UniqueString {
    private static final int WILD_CARD = '?';
    private final Set<Integer> cache = new HashSet<Integer>();

    /** factory */
    private static UniqueString get() {
      return new UniqueString();
    }

    private UniqueString append(final String string) {
      string.chars().forEach(cache::add);
      return this;
    }

    private int countUniquely() {
      if (cache.size() == 1 && cache.contains(WILD_CARD)) {
        return 1;
      }

      if (cache.contains(WILD_CARD)) {
        return cache.size() - 1;
      }
      return cache.size();
    }
  }

  private static class Answer {
    private static void answer(int count) {
      System.out.println(count);
    }
  }
}

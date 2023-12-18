import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

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
  public static void main(final String[] args) {
    final Input input = new Input();
    final UniqueString uniqueString = UniqueString.get()
        .append(input.getA())
        .append(input.getB())
        .append(input.getC());
    Answer.answer(uniqueString.countUniquely());
  }

  /** ?はワイルドカードとして扱うということで。 */
  private static final class UniqueString {
    private final CharCountMap charCountMap = CharCountMap.get();

    /**
     * factory
     */
    private static UniqueString get() {
      return new UniqueString();
    }

    private UniqueString append(final String string) {
      charCountMap.add(string);
      return this;
    }

    private int countUniquely() {
      return charCountMap.countUniquely();
    }
  }

  private static final class CharCountMap {
    private final Map<Integer/* char */, Integer> countingByChar =
        new HashMap<Integer, Integer>();
    private static final int WILD_CARD = '?';

    /**
     * factory
     */
    private static CharCountMap get() {
      return new CharCountMap();
    }

    /**
     * if @param charInteger exists in map as a key, <br>
     * the value will increament.
     */
    private void add(final String string) {
      final Map<Integer, Long> map = string.chars()
          .boxed()
          .collect(
              Collectors
                  .groupingBy(singleChar -> singleChar, Collectors.counting()));

      map.entrySet().forEach(entry -> {
        final Integer charValue = entry.getKey();
        final Integer charValueCount = entry.getValue().intValue();
        if (countingByChar.containsKey(charValue)) {
          final int currentValueCount = countingByChar.get(charValue);
          if (currentValueCount < charValueCount) {
            countingByChar.put(charValue, charValueCount);
          }
        } else {
          countingByChar.put(charValue, charValueCount);
        }
      });
    }

    private int countUniquely() {
      if (countingByChar.size() == 1 && countingByChar.containsKey(WILD_CARD)) {
        return 1;
      }

      int sum = countingByChar.entrySet()
          .stream()
          .map(Entry::getValue)
          .mapToInt(i -> i)
          .sum();
      if (countingByChar.containsKey(WILD_CARD)) {
        return sum - 1;
      }
      return sum;
    }
  }

  private static final class Answer {
    private static void answer(final int count) {
      System.out.println(count);
    }
  }
  /** parameter */
  private static final class Input {

    private Input() {
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
}

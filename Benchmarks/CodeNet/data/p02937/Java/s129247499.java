import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    String s = sc.next();
    String t = sc.next();
    int[] tIndexInS = new int[t.length()];
    Map<String, List<Integer>> charIndexes = IntStream
      .rangeClosed("a".codePointAt(0), "z".codePointAt(0))
      .mapToObj(codePoint -> String.valueOf((char) codePoint))
      .collect(Collectors.toMap(
        Function.identity(),
        i -> new LinkedList<>()
      ));
    for (int i = 0; i < s.length(); i++) {
      charIndexes.get(String.valueOf(s.charAt(i))).add(i);
    }
    CharIndexMap map = new CharIndexMap(charIndexes);
    boolean allContains = true;
    for (int i = 0; i < t.length(); i++) {
      allContains = allContains && map.hasChar(t.charAt(i));
    }
    if (!allContains) {
      pw.println(-1);
      return;
    }
    long resetCount = 0;
    for (int i = 0; i < t.length(); i++) {
      String c = String.valueOf(t.charAt(i));
      if (!map.hasNext(c)) {
        map.resetIndex();
        resetCount++;
      }
      map.next(c);
    }
    pw.println(s.length() * resetCount + map.lastIndex + 1);
  }

  static class CharIndexMap {

    Map<String, List<Integer>> charIndexes;
    Map<String, Integer> arrayIndex;
    int lastIndex = -1;

    public CharIndexMap(Map<String, List<Integer>> charIndexes) {
      this.charIndexes = charIndexes;
      this.arrayIndex = charIndexes.keySet().stream().collect(Collectors.toMap(
        k -> k,
        k -> 0
      ));
    }

    boolean hasChar(char c) {
      return charIndexes.get(String.valueOf(c)).size() > 0;
    }

    void resetIndex() {
      for (String key : arrayIndex.keySet()) {
        arrayIndex.put(key, 0);
      }
    }

    boolean hasNext(String s) {
      return arrayIndex.get(s) < charIndexes.get(s).size()
        && charIndexes.get(s).get(arrayIndex.get(s)) > lastIndex;
    }

    void next(String c) {
      Integer i = arrayIndex.get(c);
      lastIndex = charIndexes.get(c).get(i);
      arrayIndex.put(c, i + 1);
    }
  }
}

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int h = scanner.nextInt();
    final int w = scanner.nextInt();
    char[][] table = new char[h][w];
    for (int i = 0; i < h; i++) {
      char[] chars = scanner.next().toCharArray();
      for (int j = 0; j < chars.length; j++) {
        table[i][j] = chars[j];
      }
    }

    HashSet<Chars> set = new HashSet<>();
    for (int i = 0; i < h; i++) {
      Chars chars = new Chars(table[i]);
      if (set.contains(chars)) set.remove(chars);
      else set.add(chars);
    }
    if (set.size() > 1) {
      System.out.println("NO");
      return;
    }
    set.clear();
    char[] buff = new char[w];
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) buff[j] = table[i][j];
      Chars chars = new Chars(buff);
      if (set.contains(chars)) set.remove(chars);
      else set.add(chars);
    }
    if (set.size() > 1) {
      System.out.println("NO");
      return;
    }
    System.out.println("YES");
  }

  static class Chars {
    private final char[] chars;

    public Chars(char[] chars) {
      this.chars = Arrays.copyOf(chars, chars.length);
      Arrays.sort(this.chars);
    }

    @Override public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Chars chars1 = (Chars) o;
      return Arrays.equals(chars, chars1.chars);
    }

    @Override public int hashCode() {
      return Arrays.hashCode(chars);
    }
  }
}

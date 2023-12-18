import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    scn.nextLine();

    long anagCombi = 0;

    ArrayList<String> sorted = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      String s = scn.nextLine();
      Character[] chars = new Character[10];
      for (int j = 0; j < 10; j++) {
        chars[j] = s.charAt(j);
      }

      Arrays.sort(chars, new Comparator<Character>() {
        public int compare(Character c1, Character c2) {
          int cmp = Character.compare(Character.toLowerCase(c1.charValue()), Character.toLowerCase(c2.charValue()));
          if (cmp != 0)
            return cmp;
          return Character.compare(c1.charValue(), c2.charValue());
        }
      });
      StringBuilder sb = new StringBuilder(chars.length);
      for (char c : chars) {
        sb.append(c);
      }
      sorted.add(sb.toString());

    }

    Collections.sort(sorted);
    sorted.add("dummy");
    String prev = sorted.get(0);
    long sameCount = 1L;
    for (int i = 1; i < sorted.size(); i++) {
      if (sorted.get(i).equals(prev)) {
        sameCount++;
      } else {
        if (sameCount == 2) {
          anagCombi += 1;
        }
        if (sameCount > 2) {
          anagCombi += fact(sameCount) / (2L * fact(sameCount - 2L));
        }
        prev = sorted.get(i);
        sameCount = 1L;

      }
    }

    System.out.println(anagCombi);

  }

  public static long fact(long a) {
    if (a == 0) {
      return 1L;
    }
    return a * fact(a - 1);
  }

}

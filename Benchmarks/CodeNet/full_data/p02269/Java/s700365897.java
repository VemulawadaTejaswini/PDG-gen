import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String... args) {

    Scanner sc = new Scanner(System.in);
    int size = Integer.parseInt(sc.next());
    List<Integer> inserts = new ArrayList<>(size);
    List<String> results = new ArrayList<>(size);

    for (int i = 0; i < size; i++) {

      if (sc.next().equals("insert")) {
        int index = calcIndex(sc.next());
        if (!inserts.contains(index)) {
          inserts.add(index);
        }

      } else {
        results.add(search(sc.next(), inserts) ? "yes" : "no");
      }
    }

    for (String result : results) {
      System.out.println(result);
    }
  }

  public static int calcIndex(String target) {

    char[] cTargets = target.toCharArray();
    int index = 0;
    int level = 1;
    for (char ch : cTargets) {
      index += level * charToInt(ch);
      level *= 5;
    }

    return index;
  }

  public static int charToInt(char ch) {

    switch (ch) {
    case 'A':
      return 1;

    case 'C':
      return 2;

    case 'G':
      return 3;

    case 'T':
      return 4;

    default:
      return 0;
    }
  }

  public static boolean search(String find, List<Integer> inserts) {
    return  inserts.contains(calcIndex(find)) ? true : false;
  }
}


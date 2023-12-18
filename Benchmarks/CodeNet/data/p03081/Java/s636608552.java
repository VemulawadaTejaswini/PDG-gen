import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int Q = scan.nextInt();
    scan.nextLine();
    String s = scan.nextLine();

    List<Set<Character>> list = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
      Set<Character> masu = new HashSet<>();
      masu.add(s.charAt(i));
      list.add(masu);
    }

    for (int i = 0; i < Q; i++) {
      String jumon = scan.nextLine();
      String[] ju = jumon.split(" ");
      char t = ju[0].charAt(0);
      char d = ju[1].charAt(0);

      if (d == 'L') {
        for (int j = 0; j < N; j++) {
          Set<Character> set = list.get(j);
          if (set.contains(t)) {
            if (j == 0) {
              set.clear();
              continue;
            }
            list.get(j - 1).addAll(set);
            set.clear();
          }
        }
      } else if (d == 'R') {
        for (int j = N - 1; j >= 0; j--) {
          Set<Character> set = list.get(j);
          if (set.contains(t)) {
            if (j == N - 1) {
              set.clear();
              continue;
            }
            list.get(j + 1).addAll(set);
            set.clear();
          }
        }
      }

    }
    int count = 0;
    for (Set<Character> lc : list) {
      count += lc.size();
    }
    System.out.println(count);
  }
}

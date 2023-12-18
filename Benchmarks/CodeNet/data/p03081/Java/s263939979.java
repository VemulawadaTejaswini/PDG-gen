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

      if (ju[1].charAt(0) == 'L') {
        for (int j = 0; j < N; j++) {
          if (list.get(j).contains(ju[0].charAt(0))) {
            if (j == 0) {
              list.get(j).clear();
              continue;
            }
            list.get(j - 1).addAll(list.get(j));
            list.get(j).clear();
          }
        }
      } else if (ju[1].charAt(0) == 'R') {
        for (int j = N - 1; j >= 0; j--) {
          if (list.get(j).contains(ju[0].charAt(0))) {
            if (j == N - 1) {
              list.get(j).clear();
              continue;
            }
            list.get(j + 1).addAll(list.get(j));
            list.get(j).clear();
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

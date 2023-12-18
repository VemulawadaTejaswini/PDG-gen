import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    ArrayList<Integer> l = new ArrayList<>();
    ArrayList<Integer> ans = new ArrayList<>();
    ans.add(A);
    ans.add(B);
    ans.add(C);
    int mp = 0;
    for (int i = 0; i < N; i++) {
      tmp = sc.nextInt();
      for (int j = 0; j < 3; i++)
        if (tmp == ans.get(j)) {
          ans.remove(j);
          break;
        }
      l.add(tmp);
    }
    if (ans.size() == 0) {
      System.out.println(mp);
      return;
    }
    Collections.sort(ans);
    Collections.sort(l);
    for (int j = 0; j < ans.size(); j++) {
      for (int i = 0; i < l.size(); i++) {
        if (ans.get(j) - l.get(i) <= 10) {
          mp += Math.abs(ans.get(j) - l.get(i));
          ans.remove(j);
          l.remove(i);
          break;
        }
      }
    }
    if (ans.size() == 0) {
      System.out.println(mp);
      return;
    }
    int min = Integer.MAX_VALUE;
    for (int k = 0; k < ans.size(); k++) {
      int sum = 0;
      for (int i = 0; i < l.size() - 1; i++) {
        int set = l.get(i);
        sum = set;
        for (int j = i + 1; j < l.size(); j++) {
          min = Math.min(ans.get(k) - set + l.get(j), min);
          sum += l.get(j);
        }
      }
      if ((Math.abs(ans.get(k) - sum) + 20) > (Math.abs(ans.get(k) - min) + 20 * (l.size() - 1))) {
        mp += Math.abs(ans.get(k) - min) + 20 * (l.size() - 1);
      } else {
        mp += Math.abs(ans.get(k) - sum) + 20;
      }
    }
    System.out.println(mp);
  }
}

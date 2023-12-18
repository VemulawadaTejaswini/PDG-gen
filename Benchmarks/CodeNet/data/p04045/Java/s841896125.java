import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int K = scn.nextInt();

    ArrayList<Integer> D = new ArrayList<>();
    for (int i = 0; i < K; i++) {
      D.add(scn.nextInt());
    }

    ArrayList<Integer> useableNum = new ArrayList<>();
    for (int i = 0; i <= 9; i++) {
      if (!D.contains(i)) {
        useableNum.add(i);
      }
    }

    ArrayList<Integer> combi = new ArrayList<>();

    calcCombi("", combi, useableNum, String.valueOf(N).length());
    calcCombi("", combi, useableNum, String.valueOf(N).length() + 1);

    int ans = Integer.MAX_VALUE;
    for (int n : combi) {
      if (n >= N) {
        ans = Math.min(n, ans);
      }

    }
    System.out.println(ans);
  }

  public static void calcCombi(String num, ArrayList<Integer> combi, ArrayList<Integer> useableNum, int rest) {
    if (rest == 0) {
      combi.add(Integer.parseInt(num));
      return;
    }
    for (int n : useableNum) {
      calcCombi(num + String.valueOf(n), combi, useableNum, rest - 1);
    }
  }
}
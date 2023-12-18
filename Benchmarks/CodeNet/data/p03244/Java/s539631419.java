import java.util.Scanner;

class Main {

  public static int[] firstMode(int[] v) {
    int maxValue = 0;
    int maxCnt = 0;
    int[] count = new int[v.length];
    for (int i = 0; i < v.length; i++) {
      for (int j = 0; j < v.length; j++) {
        if (v[i] == v[j]) {
          count[i]++;
        }
      }
      if (maxCnt < count[i]) {
        maxCnt = count[i];
        maxValue = v[i];
      }
    }
    return new int[] { maxCnt, maxValue };
  }

  public static int[] secondMode(int[] v) {
    int[] firstmode = firstMode(v);
    int maxValue = 0;
    int maxCnt = 0;
    int[] count = new int[v.length];
    for (int i = 0; i < v.length; i++) {
      for (int j = 0; j < v.length; j++) {
        if (v[i] == v[j]) {
          count[i]++;
        }
      }
      if (maxCnt < count[i] && v[i] != firstmode[1]) {
        maxCnt = count[i];
        maxValue = v[i];
      }
    }
    return new int[] { maxCnt, maxValue };
  }

  public static int min(int a, int b) {
    return a < b ? a : b;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    int[] o = new int[n / 2];
    int[] e = new int[(n + 1) / 2];
    for (int i = 0; i < n / 2; i++) {
      o[i] = Integer.parseInt(scanner.next());
      e[i] = Integer.parseInt(scanner.next());
    }
    if (n % 2 == 1) {
      e[e.length - 1] = Integer.parseInt(scanner.next());
    }
    scanner.close();

    int[] e1 = firstMode(e), e2 = secondMode(e), o1 = firstMode(o), o2 = secondMode(o);
    if (e1[1] != o1[1]) {
      System.out.println(n - e1[0] - o1[0]);
    } else {
      System.out.println(min(n - e1[0] - o2[0], n - e2[0] - o1[0]));
    }
  }

}

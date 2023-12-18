import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    Map<Long,Long> map = new TreeMap<>();
    String[] list = new String[n];
    for (int i = 0; i < n; i++) {
      list[i] = sc.nextLong() + "_"+ sc.nextLong();
    }
    long ans = 0;
    int p = m;
    Arrays.sort(list);
    for(String item : list) {
      String[] temp = item.split("_");
      Long a = Long.parseLong(temp[0]);
      Long b = Long.parseLong(temp[1]);
      p -= b;
      if (p < 0) {
        ans += a * (b - (p * -1));
        break;
      }
      ans += a * b;
    }
    System.out.println(ans);
  }
}
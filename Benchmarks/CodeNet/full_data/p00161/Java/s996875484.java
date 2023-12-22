import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      String[] cs = new String[n];
      for (int ii = 0; ii < n; ii++) {
        int c1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int m3 = scanner.nextInt();
        int s3 = scanner.nextInt();
        int m4 = scanner.nextInt();
        int s4 = scanner.nextInt();
        int t = m1 * 60 + s1 + m2 * 60 + s2 + m3 * 60 + s3 + m4 * 60 + s4;
        cs[ii] = String.format("%05d,%08d", t, c1);
      }
      Arrays.sort(cs);
      String[] works = cs[0].split(",");
      System.out.println(Integer.parseInt(works[1]));
      works = cs[1].split(",");
      System.out.println(Integer.parseInt(works[1]));
      works = cs[cs.length - 2].split(",");
      System.out.println(Integer.parseInt(works[1]));
    }
  }
}
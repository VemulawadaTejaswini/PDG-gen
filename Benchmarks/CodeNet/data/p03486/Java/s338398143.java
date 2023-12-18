import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] ss = s.split("");
    Arrays.sort(ss);
    s = Arrays.toString(ss);
    String t = sc.nextLine();
    String[] tt = t.split("");
    Arrays.sort(tt, Comparator.reverseOrder());
    t = Arrays.toString(tt);
    if (s.compareTo(t) < 0)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
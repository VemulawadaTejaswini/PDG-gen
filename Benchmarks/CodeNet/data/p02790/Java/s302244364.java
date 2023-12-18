import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    sc.close();

    String aw = "";
    for (int i = 0; i < B; ++i) {
      aw += String.valueOf(A);
    }
    String awa = aw + "a";
    String bw = "";
    for (int i = 0; i < A; ++i) {
      bw += String.valueOf(B);
    }
    String bwa = bw + "a";
    if (awa.compareTo(bwa) == -1) {
      System.out.println(aw);
    } else {
      System.out.println(bw);
    }
  }
}
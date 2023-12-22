import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    sc.close();

    String ans = null;
    for (long i = -10000; ans == null && i <= 10000; i++)
      for (long j = -10000; ans == null && j <= 10000; j++)
        if (i * i * i * i * i - j * j * j * j * j == X)
          ans = i + " " + j;
    System.out.println(ans);
  }
}

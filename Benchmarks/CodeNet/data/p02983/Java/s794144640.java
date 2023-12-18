import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int L = in.nextInt(), R = in.nextInt();
    if (L <= 2019 && 2019 < R) {
      System.out.println("2019 2020");
    } else {
      System.out.println(L + " " + (L + 1));
    }
  }
}
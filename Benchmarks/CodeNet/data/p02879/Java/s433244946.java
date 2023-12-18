import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner();
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();
    if (A>=10||B>=10) return -1;
    return A*B;
  }
}
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    int ans = 0;
    long deposit = 100;
    while (deposit < X) {
      deposit *= 1.01;
      ans++;
    }
    System.out.println(ans);
  }
}
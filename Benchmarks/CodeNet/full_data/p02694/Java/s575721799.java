import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long goal = sc.nextLong();
    long yen = 100;
    int ans = 0;
    while(yen < goal) {
      yen = yen + (yen / 100);
      ans++;
    }
    System.out.println(ans);
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long ans = 0;
    long yo = 100;
    for(long i = 1; i < Long.MAX_VALUE; i++) {
      yo = (yo + (yo / 100));
      if(yo >= x) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}
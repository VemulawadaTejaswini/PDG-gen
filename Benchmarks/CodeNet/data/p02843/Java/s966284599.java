import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = N / 100;
    int n = N % 100;
    //System.out.println(n);
    cnt -= n / 5;
    n %= 5;
    cnt -= n / 4;
    n %= 4;
    cnt -= n / 3;
    n %= 3;
    cnt -= n / 2;
    n %= 2;
    cnt -= n / 1;
    n %= 1;
    if (cnt - n >= 0) {
      System.out.println(1);
      return;
    }
    System.out.println(0);
  }
}
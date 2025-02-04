import java.util.Scanner;

/**
 * A - Study Scheduling
 *
 * https://atcoder.jp/contests/nomura2020/tasks/nomura2020_a
 *
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h1 = sc.nextInt();
    int m1 = sc.nextInt();
    int h2 = sc.nextInt();
    int m2 = sc.nextInt();
    int k = sc.nextInt();
    if(h1 > h2){
      h2 += 24;
    }
    int answer = (h2 - h1) * 60 - (m2 - m1) - k;
    System.out.print(answer);
  }
}
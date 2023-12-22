import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = new char[n];
    int wnum = 0;
    int rnum = 0;

    for (int i = 0; i < n; i++) {
      c[i] = s.charAt(i);
      if (c[i] == 'W') {
        wnum++;
      } else {
        rnum++;
      }
    }

    int cnt = 0;
    for (int i = rnum; i < n; i++) {
      if (c[i] == 'R') {
        cnt++;
      }
    }

    System.out.println(Math.min(Math.min(rnum, cnt), wnum));

  }
}
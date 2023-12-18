import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long N = scanner.nextLong();
    String S = scanner.next();
    long first = N;
    for (int i = 0; i < N; i++) {
      if (S.charAt(i) == '#') {
        first = i;
        break;
      }
    }
    long ans = 0;
    for (long i = first; i < N; i++) {
      if (S.charAt((int) i) == '.') {
        ans++;
      }
    }
    System.out.println(ans);
  }

}

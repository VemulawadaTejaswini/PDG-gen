import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    char s[] = sc.next().toCharArray();
    for (int i = 0;i < q;i ++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      int count = 0;
      for (int j = l - 1; j <= r - 2; j++) {
        if ('A' == s[j] && 'C' == s[j + 1]) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
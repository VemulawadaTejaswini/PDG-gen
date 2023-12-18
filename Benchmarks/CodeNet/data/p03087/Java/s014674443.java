import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    char s[] = sc.next().toCharArray();
    int cntarr[] = new int[n];
    cntarr[0] = 0;
    int cnt = 0;
    for (int i = 0; i < n - 1; i++) {
      if ('A' == s[i] && 'C' == s[i + 1]) cnt++;
      cntarr[i + 1] = cnt;
    }
    for (int i = 0;i < q;i ++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      System.out.println(cntarr[r-1]-cntarr[l-1]);
    }
  }
}
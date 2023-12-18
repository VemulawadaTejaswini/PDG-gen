import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int i =0, count =0;
    while (i < N-2) {
      if (S.charAt(i) == 'A' && S.charAt(i+1) == 'B' && S.charAt(i+2) == 'C') {
        count++;
        i += 3;
      } else {
      i++;
      }
    }
    System.out.println(count);
  }
}
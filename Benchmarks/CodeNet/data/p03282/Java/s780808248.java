import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    long K = sc.nextLong();
    if (S.length() == 1) {
      System.out.println(S);
      return;
    }
    int i =0;
    while (S.charAt(i) == '1') {
      i++;
    }
    System.out.print(S.charAt(i));
  }
}
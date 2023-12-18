import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    String A = scan.next();
    String B;
    String C;
    String ans = "No";
    int l;
    l = A.length();
    B = A.substring(0, l/2);
    C = A.substring(l/2, l);
    if (B.equals(C)) {
      ans = "Yes";
    }
    System.out.println(ans);
    scan.close();
  }
}
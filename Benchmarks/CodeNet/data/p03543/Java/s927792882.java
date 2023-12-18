import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char a = s.charAt(0);
    char b = s.charAt(1);
    char c = s.charAt(2);
    char d = s.charAt(3);
    if((a == b && b == c )||( b == c && c == d )) System.out.println("Yes");
    else System.out.println("No");
  }
}

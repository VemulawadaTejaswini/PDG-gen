import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    String ans = "No";
    for (int i = 0; i <= X; i++) {
      if ((i*2 + (X-i)*4) == Y) {
        ans = "Yes";
        break;
      }
    }
    System.out.println(ans);
  }
}
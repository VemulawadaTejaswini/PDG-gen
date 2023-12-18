import java.util.Scanner;

public class Main{
  static int s, c;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    s = sc.nextInt(); c = sc.nextInt();

    if(c == 0 || c == 1){
      System.out.println(0);
      return;
    }

    int ans = Math.min(s, c / 2);

    c -= 2 * ans;

    if(c > 0){
      ans += c / 4;
    }

    System.out.println(ans);
  }
}

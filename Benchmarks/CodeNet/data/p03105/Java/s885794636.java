import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int count = 0;

    if(a > b) {
      System.out.println(0);
    } else {
      for(int i = 0; i <= c; i++) {
        count = i;
        if(count * a >= b) break;
      }
      System.out.println(count);
    }

  }

}

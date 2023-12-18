import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    boolean ok = true;
    int i = 0;
    int j = 1;
    while (ok) {
      i += a;
      System.out.println(j + " " + i);
      if (b <= i) {
        break;
      } else {
        i--;
        j++;
      }
    }
    
    System.out.println(j);
  }
}

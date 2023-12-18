import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    boolean ok = true;
    int i = 1;
    int j = 0;
    while (ok) {
      i--;
      i += a;
      j++;
      if (b <= i) break;
    }
    
    System.out.println(j);
  }
}

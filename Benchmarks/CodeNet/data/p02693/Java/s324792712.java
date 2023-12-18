import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        final int k = s.nextInt();
        int a = s.nextInt();
        final int b = s.nextInt();

        boolean okFlg = false;
        while (a <= b) {
            if (a % k == 0) {
                okFlg = true;
                break;
            }
            a++;
        }
        if (okFlg) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
  }
}
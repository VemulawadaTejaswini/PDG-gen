import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    long K = sc.nextInt();

    sc.close(); 

    String[] s = S.split("");
    boolean isLong = false;

    if (1 < K) {
      if (s.length % 2 != 0) {
        String S2 = S + S;
        s = S2.split("");
        isLong = true;
      }
    }

    long count = 0;
    long r = 0;
    boolean isChange = false;

    for (int i = 0; i < s.length - 1; i++) {
      if (s[i].equals(s[i+1]) && (isChange == false)) {
        count++;
        isChange = true;
      } else {
        isChange = false;
      }
    }

    if (s[0].equals(s[s.length - 1]) && (isChange == false)) {
      if (isLong) {
        if (K % 2 == 0) {
          r = K / 2 - 1;
        } else {
          r = K / 2;
        }
      } else {
        r = 1;
      }
    }

    if (isLong) {
      System.out.println(count * K / 2 + r);
    } else {
      System.out.println(count * K + r);
    }

  }

}
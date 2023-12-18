import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    String s = sc.next();

    sc.close();

    String[] S = s.split("");

    String result = "Yes";

    for (int i = 0; i < S.length; i++) {

      if (S.length != 8) {
        result = "No";
        break;
      }

      if (i == 3 && !S[i].equals("-")) {
        result = "No";
        break;
      }

      if (i < 3 || 3 < i) {
        if (!S[i].equals("-")) {
          int n_ = Integer.valueOf(S[i]);
          if (n_ < 0 || 9 < n_) {
            result = "No";
            break;
          }
        } else {
          result = "No";
          break;
        }
      }

    }

    System.out.println(result);
  
  }

}
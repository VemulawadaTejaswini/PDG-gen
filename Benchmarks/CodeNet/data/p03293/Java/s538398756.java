import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    String T = sc.next();

    sc.close();

    String[] s = S.split("");

    int[] arr = new int[s.length];

    String result = "No";

    for (int i = 0; i < s.length; i++) {
      
      for (int j = 0; j < s.length; j++) {

        if (i + j < s.length) {
          arr[j] = i + j;
        } else {
          arr[j] = i + j - s.length;
        }

      }

      String s_ = "";

      for (int j = 0; j < s.length; j++) {
        s_ += s[arr[j]];
      }

      if (s_.equals(T)){
        result = "Yes";
        break;
      }

    }

    System.out.println(result);

  }

}
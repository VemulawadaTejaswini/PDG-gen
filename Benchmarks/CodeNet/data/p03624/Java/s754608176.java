import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();

    sc.close();

    String result = "None";

    int[] count = new int[26];

    for (int i = 0; i < S.length(); i++) {
      count[(int) S.charAt(i) - 97]++;
    }

    for (int i = 0; i < 26; i++) {
      if (count[i] == 0) {
        result = String.valueOf((char) (i+97));
        break;
      }
    }

    System.out.println(result);
  }

}
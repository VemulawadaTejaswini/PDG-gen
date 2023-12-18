import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    sc.close();

    String[] S = s.split("");

    String result = "";

    int max = 0;

    for (int i = 0; i < S.length; i++) {
      if (S[i].equals("A") || S[i].equals("C") || S[i].equals("G") || S[i].equals("T")) {
        result += S[i];
        max = Math.max(max, result.length());
      } else {
        result = "";
      }
    }

    System.out.println(max);

  }

}
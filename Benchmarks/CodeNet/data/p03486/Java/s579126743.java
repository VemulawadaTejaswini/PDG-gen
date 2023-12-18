import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    sc.close();

    String[] S = s.split("");
    String[] T = t.split("");

    Arrays.sort(S);
    Arrays.sort(T, Comparator.reverseOrder());

    String S2 = "";
    
    for (int i = 0; i < S.length; i++) {
      S2 += S[i];
    }

    String T2 = "";

    for (int i = 0; i < T.length; i++) {
      T2 += T[i];
    }
    
    if (1 <= T2.compareTo(S2)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
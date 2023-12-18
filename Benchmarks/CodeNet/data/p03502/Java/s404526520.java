import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    String s = String.valueOf(N);

    String[] S = s.split("");

    int a = 0;

    for (int i = 0; i < S.length; i++) {
      a += Integer.valueOf(S[i]);
    }

    if (N % a == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    
  }

}
// ALDS1_14_A/B: String search (DFA)

import java.io.PrintWriter;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] T = sc.next().toCharArray();
    char[] P = sc.next().toCharArray();
    PrintWriter pw = new PrintWriter(System.out);

    // preprocess
    int[] pi = new int[P.length + 1];
    pi[0] = -1;
    int k = -1;
    for (int i = 1; i <= P.length; ++i) {
      while (k >= 0 && P[k] != P[i - 1]) k = pi[k];
      pi[i] = ++k;
    }

    // search
    int j = 0;
    for (int i = 1; i <= T.length; ++i) {
      while (j >= 0 && P[j] != T[i - 1]) j = pi[j];
      ++j;
      if (j == P.length) {
        pw.println(i - P.length);
        j = pi[j];
      }
    }
    pw.flush();
  }
}

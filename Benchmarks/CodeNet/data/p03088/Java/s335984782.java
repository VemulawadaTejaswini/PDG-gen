import java.util.*;

public class Main {
  private static boolean valid4(String s) {
    // invalid XACG AXCG, ACXG
    return !s.matches(".AGC") && !s.matches("A.GC") && !s.matches("AG.C") && !s.matches("AGC.")
        && !s.matches(".AGC") && !s.matches(".ACG") && !s.matches(".GAC");
  }
  
  private static boolean valid3(String s) {
    return !s.equals("AGC") && !s.equals("ACG") && !s.equals("GAC");
  }
  
  private static long solve(int n) {
    if (n == 1) {
      return 4;
    } else if (n == 2) {
      return 16;
    }
    
    char[] atcg = new char[]{'A', 'T', 'C', 'G'};
    
    long[] init = new long[64];
    ArrayList<ArrayList<Integer>> transform = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i < 64; i++) {
      transform.add(new ArrayList<Integer>());
    }
    
    for (int a = 0; a < atcg.length; a++) {
      for (int b = 0; b < atcg.length; b++) {
        for (int c = 0; c < atcg.length; c++) {
          int indexSrc = (a << 4) | (b << 2) | c;
          String str3 = "" + atcg[a] + atcg[b] + atcg[c];
          if (valid3(str3)) {
            init[indexSrc] = 1;
          } else {
            init[indexSrc] = 0;
            continue;
          }
          
          for (int d = 0; d < atcg.length; d++) {
            int indexDst = (b << 4) | (c << 2) | d;
            String str4 = str3 + atcg[d];
            if (valid4(str4)) {
              transform.get(indexDst).add(indexSrc);
//              System.out.println(str3 + " - " + str4);
            }
          }
        }
      }
    }
    
    long[] src = init;
    for (int i = 3; i < n; i++) {
      long[] dst = new long[64];
      for (int j = 0; j < 64; j++) {
        dst[j] = 0;
        for (int indexSrc: transform.get(j)) {
          dst[j] += src[indexSrc];
          dst[j] %= 1000000007;
        }
      }
      src = dst;
    }
    
    long sum = 0;
    for (int i = 0; i < 64; i++) {
      sum += src[i];
      sum %= 1000000007;
    }
    return sum;
  }
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println(solve(s.nextInt()));
  }
}

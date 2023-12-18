import java.util.*;
public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    String S = sc.next();
    int[] l = new int[Q];
    int[] r = new int[Q];
    for (int i = 0; i < Q; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }
    
    long[] c = new long[N+1];
    long count = 0;
    int i = 0;
    while (i < S.length()) {
      char c1 = S.charAt(i);
      if (c1 == 'A') {
        c[i+1] = count;
        i++;
        char c2 = S.charAt(i);
        if (c2 == 'C') {
          c[i+1] = ++count;
        } else {
          c[i+1] = count;
        }
      } else {
        c[i+1] = count;
      }
      i++;
    }

    for (int j = 0; j < Q; j++) {
      System.out.println(c[r[j]] - c[l[j]]);
    }
  }
}
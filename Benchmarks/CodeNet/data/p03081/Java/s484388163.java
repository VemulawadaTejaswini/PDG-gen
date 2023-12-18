import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int Q = sc.nextInt();
      String S = sc.next();
      char[] s = new char[N];
      for (int i = 0; i < s.length; i++) {
         s[i] = S.charAt(i);
      }
      char[] t = new char[Q];
      char[] d = new char[Q];
      for (int i = 0; i < t.length; i++) {
         S = sc.next();
         t[i] = S.charAt(0);
         S = sc.next();
         d[i] = S.charAt(0);
      }
      int[] g = new int[N];
      Arrays.fill(g, 1);

      for (int i = 0; i < Q; i++) {

         if (s[0] == t[i]) {
            if (d[i] != 'L') {
               g[1] += g[0];
            }
            g[0] = 0;
         }
         if (s[N - 1] == t[i]) {
            if (d[i] != 'R') {
               g[N - 2] += g[N - 1];
            }
            g[N - 1] = 0;
         }

         for (int j = 1; j < N - 1; j++) {
            if (s[j] == t[i]) {
               if (d[j] == 'L') {
                  g[j - 1] += g[j];
               } else {
                  g[j + 1] += g[j];
               }
               g[j] = 0;
            }
         }
      }

      int sum = 0;
      for (int i = 0; i < N; i++) {
         sum += g[i];
      }

      System.out.println(sum);

   }
}

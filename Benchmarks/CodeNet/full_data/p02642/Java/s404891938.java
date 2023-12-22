
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

   private static final String INPUT_FILE_PATH = "";

   static void solve(InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int[] a = new int[n];
      TreeMap<Integer, Integer> tm = new TreeMap();
      HashSet<Integer> seen = new HashSet();
      for (int i = 0; i < n; i++) {
         a[i] = in.nextInt();
         tm.put(a[i], 1 + tm.getOrDefault(a[i], 0));
      }
      int ans = 0;
      for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
         int x = entry.getKey();
         int count = entry.getValue();
         if (count == 1) {
            boolean hasDivisor = false;
            for (int i = 1; i * i <= x; i++) {
               if (x % i > 0) continue;
               if (seen.contains(i) || seen.contains(x / i)) {
                  hasDivisor = true;
                  break;
               }
            }
            if (!hasDivisor) ans++;
         }
         seen.add(x);
      }
      out.println(ans);
   }

   private static class InputReader {
      private BufferedReader br;
      private StringTokenizer st;

      public InputReader(InputStream inputStream) {
         this.br = new BufferedReader(new InputStreamReader(inputStream), 32768);
         this.st = null;
      }

      public String nextToken() {
         while (st == null || !st.hasMoreTokens()) {
            try {
               st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
               throw new RuntimeException(e);
            }
         }
         return st.nextToken();
      }

      public int nextInt() {
         return Integer.parseInt(nextToken());
      }

      public long nextLong() {
         return Long.parseLong(nextToken());
      }

      public double nextDouble() {
         return Double.parseDouble(nextToken());
      }
   }

   public static void main(String[] args) throws Exception {
      InputStream inputStream = INPUT_FILE_PATH.isEmpty()
         ? System.in
         : new FileInputStream(new File(INPUT_FILE_PATH));
      OutputStream outputStream = System.out;

      InputReader inputReader = new InputReader(inputStream);
      PrintWriter printWriter = new PrintWriter(outputStream);

      solve(inputReader, printWriter);

      printWriter.close();
   }

}

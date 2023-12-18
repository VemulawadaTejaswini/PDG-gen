import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    long students[][] = new long[N][];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      students[i] = new long[]{Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())};
    }

    long checkpts[][] = new long[M][];
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      checkpts[i] = new long[]{Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())};
    }

    for (long[] student : students) {
      long a = student[0];
      long b = student[1];
      long min = 10000000;
      int ans = 1;
      int i = 1;
      for (long[] checkpt : checkpts) {
        long x = checkpt[0];
        long y = checkpt[1];
        long t = Math.abs(a-x) + Math.abs(b-y);
        if (min > t) {
          min = t;
          ans = i;
        }
        i++;
      }
      System.out.println(ans);
    }
  }
}

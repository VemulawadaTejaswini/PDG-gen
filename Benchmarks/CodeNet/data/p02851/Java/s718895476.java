import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(in.readLine());
    int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(in.readLine());
    int[] A = new int[N];
    for (int i = 0; i < N; ++i) {
      A[i] = Integer.parseInt(st.nextToken());
    }

    HashMap<Integer, Integer> psumCt = new HashMap<>();
    psumCt.put(0, 1);
    int psum = 0;
    long ans = 0;
    for (int i = 0; i < N; ++i) {
      psum += A[i] - 1;
      int ct = psumCt.getOrDefault(psum % K, 0);
      ans += ct;
      psumCt.put(psum % K, ct + 1);
    }
    out.println(ans);

    out.close();
  }
}

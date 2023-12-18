import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] A = new int[N];
    int tot = 0;
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
      tot += A[i];
    }
    int i, psum = 0;
    for (i = 0; i < N && 2*psum < tot; ++i) {
      psum += A[i];
    }
    System.out.println(2*psum - tot);
  }
}

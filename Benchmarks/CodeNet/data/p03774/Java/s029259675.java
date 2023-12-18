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
    int students[][] = new int[N][];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      students[i] = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
    }

    int checkpts[][] = new int[M][];
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      checkpts[i] = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
    }

    for (int[] student : students) {
      int a = student[0];
      int b = student[1];
      int min = 10000000;
      int ans = 1;
      int i = 1;
      for (int[] checkpt : checkpts) {
        int x = checkpt[0];
        int y = checkpt[1];
        int t = Math.abs(a-x) + Math.abs(b-y);
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
